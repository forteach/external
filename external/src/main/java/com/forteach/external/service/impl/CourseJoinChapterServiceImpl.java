package com.forteach.external.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.forteach.external.mysql.domain.CourseChapterCount;
import com.forteach.external.mysql.domain.builder.CourseJoinChapterDescriptionBuilder;
import com.forteach.external.mysql.domain.description.CourseJoinChapterDescription;
import com.forteach.external.mysql.repository.CourseChapterCountRepository;
import com.forteach.external.mysql.repository.CourseChapterRepository;
import com.forteach.external.mysql.repository.CourseStudyRepository;
import com.forteach.external.mysql.repository.description.CourseJoinChapterDescriptionRepository;
import com.forteach.external.service.CourseJoinChapterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static com.forteach.external.common.Dic.*;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-6 15:24
 * @version: 1.0
 * @description:
 */
@Slf4j
@Service
public class CourseJoinChapterServiceImpl implements CourseJoinChapterService {


    @Resource
    private CourseChapterRepository courseChapterRepository;

    @Resource
    private HashOperations<String, String, String> hashOperations;

    @Resource
    private CourseJoinChapterDescriptionRepository courseJoinChapterDescriptionRepository;

    @Resource
    private CourseChapterCountRepository courseChapterCountRepository;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private CourseStudyRepository courseStudyRepository;

    @Override
    public void saveJoinCourseChapter() {
        //保存对应的上课章节信息
        List<String> circleIds = findCircleIdsList();

        List<String> chapterIds = findJoinChapterIdsList(circleIds);

        List<CourseJoinChapterDescription> chapterDescriptions = findCourseJoin(circleIds);

        List<CourseChapterCount> chapterCounts = findCourseCount(circleIds);

        if (chapterDescriptions != null && chapterDescriptions.size() > 0) {
            courseChapterRepository.findByChapterIdIn(chapterIds)
                    .stream()
                    .filter(Objects::nonNull)
                    .forEach(iCourseChapterDto -> {
                        chapterDescriptions.forEach(c -> {
                            if (c.getChapterId().equals(iCourseChapterDto.getChapterId())) {
                                c.setCourseId(iCourseChapterDto.getCourseId());
                            }
                        });
                        chapterCounts.stream()
                                .filter(Objects::nonNull)
                                .forEach(c -> {
                                    if (c.getChapterId().equals(iCourseChapterDto.getChapterId())) {
                                        c.setCourseId(iCourseChapterDto.getCourseId());
                                    }
                                });
                    });
            courseJoinChapterDescriptionRepository.saveAll(chapterDescriptions);
            courseChapterCountRepository.saveAll(chapterCounts);
        }
    }

    private List<CourseChapterCount> findCourseCount(List<String> circleIds) {
        List<CourseChapterCount> chapterCounts = CollUtil.newArrayList();
        if (circleIds != null && circleIds.size() > 0) {
            circleIds.stream()
                    .filter(Objects::nonNull)
                    .forEach(c -> {
                        //查找对应的课程章节id
                        final String key = getRoomChapterKey(c);
                        final String joinMemberKey = getJoinMemberKey(c);
                        if (stringRedisTemplate.hasKey(key)) {
                            final String teacherId = stringRedisTemplate.opsForValue().get(getJoinTeacherKey(c));
                            Set<String> stringSet = stringRedisTemplate.opsForSet().members(getJoinMemberKey(c));
                            //查找加入的学生id list
                            List<String> strings = findStudentsByCircleId(joinMemberKey, teacherId);
                            strings.forEach(s -> {
                                final String studentKey = getStudentKey(s);
                                chapterCounts.add(
                                        CourseChapterCount.builder()
                                                .chapterId(stringRedisTemplate.opsForValue().get(key))
                                                .circleId(c)
                                                .teacherId(teacherId)
                                                .classId(hashOperations.get(studentKey, "classId"))
                                                .joinNumber(getJoinStudentNumber(teacherId, stringSet))
                                                .build()
                                );
                            });
                        }
                    });
            return chapterCounts;
        }
        return null;
    }

    private List<CourseJoinChapterDescription> findCourseJoin(List<String> circleIds) {
        List<CourseJoinChapterDescription> chapterDescriptions = CollUtil.newArrayList();
        if (circleIds != null && circleIds.size() > 0) {
            circleIds.stream()
                    .filter(Objects::nonNull)
                    .forEach(c -> {
                        //查找对应的课程章节id
                        final String key = getRoomChapterKey(c);
                        final String joinMemberKey = getJoinMemberKey(c);
                        if (stringRedisTemplate.hasKey(key)) {
                            final String teacherId = stringRedisTemplate.opsForValue().get(getJoinTeacherKey(c));
                            List<String> strings = findStudentsByCircleId(joinMemberKey, teacherId);
                            strings.forEach(s -> {
                                final String studentKey = getStudentKey(s);
                                chapterDescriptions.add(CourseJoinChapterDescriptionBuilder
                                        .aCourseJoinChapterDescription()
                                        .withCircleId(c)
                                        .withClassId(hashOperations.get(studentKey, "classId"))
                                        .withStudentId(s)
                                        .withChapterId(stringRedisTemplate.opsForValue().get(key))
                                        .build());
                            });
                        }
                    });
            return chapterDescriptions;
        }
        return null;
    }

    private String getStudentKey(String studentId) {
        return STUDENT_ADO.concat(studentId);
    }

    private String getRoomChapterKey(String circleId) {
        return circleId.concat(CLASSROOM_CHAPTER);
    }

    private String getJoinTeacherKey(String circleId) {
        return circleId.concat(CLASSROOM_TEACHER);
    }

    private String getJoinMemberKey(String circleId) {
        return circleId.concat(CLASS_ROOM_QR_CODE_PREFIX);
    }

    /**
     * 查询课堂信息list
     *
     * @return
     */
    private List<String> findCircleIdsList() {
        if (stringRedisTemplate.hasKey(OPEN_CLASSROOM)) {
            return new ArrayList<>(Objects.requireNonNull(stringRedisTemplate
                    .opsForSet()
                    .members(OPEN_CLASSROOM)));
        }
        return null;
    }

    private List<String> findStudentsByCircleId(final String key, final String teacherId) {
        if (stringRedisTemplate.hasKey(key)) {
            return new ArrayList<>(Objects
                    .requireNonNull(stringRedisTemplate
                            .opsForSet()
                            .members(key)))
                    .stream()
                    .filter(Objects::nonNull)
                    .filter(s -> !teacherId.equals(s))
                    .collect(Collectors.toList());
        }
        return null;
    }

    /**
     * 上课的章节信息list
     *
     * @return
     */
    private List<String> findJoinChapterIdsList(List<String> circleId) {
        Set<String> stringSet = CollUtil.newHashSet();
        if (circleId != null && circleId.size() > 0) {
            circleId.stream()
                    .filter(Objects::nonNull)
                    .forEach(s -> {
                        //查找对应的课程章节id
                        String key = getRoomChapterKey(s);
                        if (stringRedisTemplate.hasKey(key)) {
                            stringSet.add(stringRedisTemplate.opsForValue().get(getRoomChapterKey(s)));
                        }
                    });
            return new ArrayList<>(stringSet);
        }
        return null;
    }


    /**
     * 计算加入的人数
     *
     * @param teacherId
     * @param stringSet
     * @return
     */
    private int getJoinStudentNumber(String teacherId, Set<String> stringSet) {
        long count = stringSet.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.equals(teacherId))
                .count();
        return (int) count;
    }

}

package com.forteach.external.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.forteach.external.mysql.domain.CourseJoinChapter;
import com.forteach.external.mysql.repository.CourseChapterRepository;
import com.forteach.external.mysql.repository.CourseJoinChapterRepository;
import com.forteach.external.service.CourseJoinChapterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

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
    private CourseJoinChapterRepository courseJoinChapterRepository;

    @Resource
    private CourseChapterRepository courseChapterRepository;

    @Resource
    private HashOperations<String, String, String> hashOperations;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void saveOrUpdateCourseJoinChapter() {
        saveJoinChapterId();
    }

    private void saveJoinChapterId() {
        //保存对应的上课章节信息
        List<String> circleIds = findCircleIdsList();

        List<String> chapterIds = findJoinChapterIdsList(circleIds);

        List<CourseJoinChapter> courseJoinChapters = findCourseJoinChapters(circleIds);

        if (courseJoinChapters != null && courseJoinChapters.size() > 0) {
            findJoinCoursesIdsList(chapterIds)
                    .stream()
                    .filter(Objects::nonNull)
                    .forEach(courseJoinChapter -> {
                        courseJoinChapters
                                .stream()
                                .filter(Objects::nonNull)
                                .forEach(c -> {
                                    updateJoinCourseChapter(courseJoinChapter, c);
                                });
                    });
            courseJoinChapterRepository.saveAll(courseJoinChapters);
        }

    }

    private void updateJoinCourseChapter(CourseJoinChapter courseJoinChapter, CourseJoinChapter c) {
        if (c.getChapterId().equals(courseJoinChapter.getChapterId())) {
            String circleId = c.getCircleId();
            String teacherId = stringRedisTemplate.opsForValue().get(getJoinTeacherKey(circleId));
            Set<String> stringSet = stringRedisTemplate.opsForSet().members(getJoinMemberKey(circleId));
            c.setCourseId(courseJoinChapter.getCourseId());
            c.setCircleId(circleId);
            c.setTeacherId(teacherId);
            if (!stringSet.isEmpty() && (stringSet.size() > 1)) {
                c.setJoinNumber(getJoinStudentNumber(teacherId, stringSet));
                c.setStudents(getJoinStudents(teacherId, stringSet));
                Optional<String> optionalS = stringSet
                        .stream()
                        .filter(Objects::nonNull)
                        .filter(s -> !s.equals(teacherId))
                        .findFirst();
                optionalS.ifPresent(s -> c.setClassId(hashOperations.get(getStudentKey(s), "classId")));
            }
        }
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
     * 1.查询全部课堂信息 -> 章节 -> 课程
     * 2.查询对应的课程信息
     * 3.查询对应
     */

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

    private List<CourseJoinChapter> findCourseJoinChapters(List<String> circleId) {
        List<CourseJoinChapter> courseJoinChapters = CollUtil.newArrayList();
        if (circleId != null && circleId.size() > 0) {
            circleId.stream()
                    .filter(Objects::nonNull)
                    .forEach(c -> {
                        //查找对应的课程章节id
                        String key = getRoomChapterKey(c);
                        if (stringRedisTemplate.hasKey(key)) {
                            courseJoinChapters.add(CourseJoinChapter.builder()
                                    .circleId(c)
                                    .chapterId(stringRedisTemplate.opsForValue().get(key))
                                    .build());
                        }
                    });
            return courseJoinChapters;
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

    private List<CourseJoinChapter> findJoinCoursesIdsList(List<String> chapterIds) {
        List<CourseJoinChapter> courseJoinChapters = CollUtil.newArrayList();
        courseChapterRepository.findByChapterIdIn(chapterIds)
                .stream()
                .filter(Objects::nonNull)
                .forEach(iCourseChapterDto -> {
                    courseJoinChapters.add(CourseJoinChapter.builder()
                            .courseId(iCourseChapterDto.getCourseId())
                            .chapterId(iCourseChapterDto.getChapterId())
                            .build());
                });
        if (courseJoinChapters.size() > 0) {
            return courseJoinChapters;
        } else {
            return null;
        }
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

    /**
     * 加入的学生
     *
     * @param teacherId
     * @param stringSet
     * @return
     */
    private String getJoinStudents(String teacherId, Set<String> stringSet) {
        StringBuffer stringBuffer = new StringBuffer();
        stringSet.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.equals(teacherId))
                .forEach(s -> {
                    stringBuffer.append(s).append(",");
                });
        return stringBuffer.toString();
    }
}

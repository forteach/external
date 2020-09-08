package com.forteach.external.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.jgravatar.Gravatar;
import com.forteach.external.jgravatar.GravatarDefaultImage;
import com.forteach.external.mysql.domain.StudentEntitys;
import com.forteach.external.mysql.repository.StudentRepository;
import com.forteach.external.oracle.dto.IStudentDto;
import com.forteach.external.oracle.repository.ZhxyXsxxRepository;
import com.forteach.external.service.StudentService;
import com.forteach.external.service.TeacherOfficeService;
import com.forteach.external.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static com.forteach.external.common.Dic.*;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 09:45
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Resource
    private TeacherOfficeService teacherOfficeService;

    private static final Gravatar gravatar;

    /**
     * 初始化用户图像设置信息
     */
    static {
        gravatar = new Gravatar();
        gravatar.setSize(100);
        gravatar.setDefaultImage(GravatarDefaultImage.IDENTICON);
    }

    @Resource
    private HashOperations<String, String, String> hashOperations;

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private ZhxyXsxxRepository zhxyXsxxRepository;

    /**
     * 查询有效的学生信息
     */
    @Override
    @Async
    public void saveAll() {
        this.saveOrUpdateStudentsInfo(zhxyXsxxRepository.findAllRedisDto());
    }

    /**
     * 查询3天内修改的用户信息
     */
    @Async
    @Override
    public void updateTimestamp() {
        this.saveOrUpdateStudentsInfo(zhxyXsxxRepository.findAllDtoByTimeStamp(DateUtil.offsetDay(new Date(), -7).toTimestamp()));
    }

    /**
     * 对查询到的学生信息进行处理
     *
     * @param list
     */
    private void saveOrUpdateStudentsInfo(List<IStudentDto> list) {
        list.stream().filter(Objects::nonNull)
                .filter(iStudentDto ->
                        StrUtil.isNotBlank(iStudentDto.getId())
                                && StrUtil.isNotBlank(iStudentDto.getName())
                                && StrUtil.isNotBlank(iStudentDto.getIDCardNo())
                                && StrUtil.isNotBlank(iStudentDto.getClassId()))
                .forEach(this::accept);
    }

    @SuppressWarnings(value = "all")
    private void accept(IStudentDto iStudentDto) {
        String isValidated = StringUtil.changeIsValidated(iStudentDto.getIsValidated());
        String gender = StringUtil.changeGender(iStudentDto.getGender());
        String jGravatart = this.jGravatart(iStudentDto.getId());
        String teacherOfficeId = iStudentDto.getTeacherOfficeId();
        String teacherOfficeName = teacherOfficeService.findTeacherName(teacherOfficeId);
        String key = STUDENT_ADO.concat(iStudentDto.getId());
        if (ISVALIDATED_0.equals(isValidated)) {
            if (!stringRedisTemplate.hasKey(key)) {
                HashMap<String, String> map = MapUtil.newHashMap();
                map.put("id", iStudentDto.getId());
                map.put("studentId", iStudentDto.getId());
                map.put("name", iStudentDto.getName());
                map.put("IDCardNo", iStudentDto.getIDCardNo());
                map.put("classId", iStudentDto.getClassId());
                map.put("isValidated", isValidated);
                map.put("portrait", jGravatart);
                map.put("teacherOfficeId", teacherOfficeId);
                map.put("teacherOfficeName", teacherOfficeName);
                hashOperations.putAll(key, map);
                redisTemplate.expire(key, 365, TimeUnit.DAYS);
            }
        } else if (ISVALIDATED_1.equals(isValidated) && stringRedisTemplate.hasKey(key)) {
            stringRedisTemplate.delete(key);
        }
        StudentEntitys studentEntitys = studentRepository.findById(iStudentDto.getId()).orElseGet(StudentEntitys::new);
        studentEntitys.setId(iStudentDto.getId());
        studentEntitys.setUserName(iStudentDto.getName());
        studentEntitys.setGender(gender);
        studentEntitys.setIDCardNo(iStudentDto.getIDCardNo());
        studentEntitys.setPortrait(jGravatart);
        String classId = StrUtil.isBlank(iStudentDto.getClassId()) ? "9999" : iStudentDto.getClassId();
        studentEntitys.setClassId(iStudentDto.getClassId());
        studentEntitys.setBirthDate(iStudentDto.getBirthDate());
        studentEntitys.setGrade(iStudentDto.getGrade());
        studentEntitys.setIsGraduate(iStudentDto.getIsGraduate());
        studentEntitys.setStudentStatus(iStudentDto.getStudentStatus());
        studentEntitys.setPhone(iStudentDto.getPhone());
        studentEntitys.setIsValidated(isValidated);
        studentEntitys.setTeacherOfficeId(teacherOfficeId);
        studentEntitys.setTeacherOfficeName(teacherOfficeName);
        studentRepository.save(studentEntitys);
    }
    /**
     * 转换对应的redis 需要保存的信息
     *
     * @param iStudentDto
     * @return
     */
//    private Student builderStudent(IStudentDto iStudentDto) {
//        HashMap<String, String> map = MapUtil.newHashMap();
//        map.put("id", iStudentDto.getId());
//        map.put("studentId", iStudentDto.getId());
//        map.put("name", iStudentDto.getName());
//        map.put("IDCardNo", iStudentDto.getIDCardNo());
//        map.put("classId", iStudentDto.getClassId());
//        map.put("isValidated", StringUtil.changeIsValidated(iStudentDto.getIsValidated()));
//        map.put("portrait", this.jGravatart(iStudentDto.getId()));
//        return StudentBuilder.aStudent()
//                .withId(iStudentDto.getId())
//                .withKey(STUDENT_ADO.concat(iStudentDto.getId()))
//                .withName(iStudentDto.getName())
//                .withMap(map)
//                .build();
//    }

    /**
     * 生成用户头像
     *
     * @param id
     * @return
     */
    private String jGravatart(String id) {
        return gravatar.getUrl(id);
    }

    /**
     * 保存到redis数据库中
     *
     * @param student
     */
//    @SuppressWarnings(value = "all")
//    private void accept(Student student) {
//        String isValidated = student.getMap().get("isValidated");
//        //记录redis
//        String key = student.getKey();
//        if (ISVALIDATED_0.equals(isValidated)) {
//            if (!stringRedisTemplate.hasKey(key)) {
//                hashOperations.putAll(key, student.getMap());
//                redisTemplate.expire(key, 365, TimeUnit.DAYS);
//            }
//        } else if (ISVALIDATED_1.equals(isValidated) && stringRedisTemplate.hasKey(key)) {
//            stringRedisTemplate.delete(key);
//        }
//        //保存mysql
//        this.saveMySqlStudentInfo(student);
//    }

    /**
     * 将查询到的学生信息保存到mysql
     *
     * @param student
     */
//    private void saveMySqlStudentInfo(Student student) {
//        HashMap<String, String> map = student.getMap();
//        Optional<StudentEntitys> optionalStudentEntitys = studentRepository.findById(student.getId());
//        if (!optionalStudentEntitys.isPresent()) {
//            studentRepository.save(StudentEntitysBuilder.aStudentEntitys()
//                    .id(map.get("id"))
//                    .userName(map.get("name"))
//                    .IDCardNo(map.get("IDCardNo"))
//                    .classId(map.get("classId"))
//                    .isValidated(map.get("isValidated"))
//                    .portrait(map.get("portrait"))
//                    .build());
//        } else {
//            optionalStudentEntitys.ifPresent(studentEntitys -> {
//                String isValidated = map.get("isValidated");
//                if (ISVALIDATED_1.equals(isValidated)) {
//                    studentEntitys.setPortrait(ISVALIDATED_1);
//                    studentRepository.save(studentEntitys);
//                }
//            });
//        }
//    }
}
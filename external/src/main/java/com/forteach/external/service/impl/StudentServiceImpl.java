package com.forteach.external.service.impl;

import cn.hutool.core.util.StrUtil;
import com.forteach.external.oracle.dto.IStudentDto;
import com.forteach.external.oracle.repository.ZhxyXsxxRepository;
import com.forteach.external.redis.model.pojo.Student;
import com.forteach.external.redis.model.pojo.StudentBuilder;
import com.forteach.external.service.StudentService;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.HashMap;

import static com.forteach.external.common.Dic.STUDENT_ADO;

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
    private HashOperations<String, String, String> hashOperations;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private ZhxyXsxxRepository zhxyXsxxRepository;

    @Override
    public void saveAll() {
        zhxyXsxxRepository.findAllRedisDto()
                .stream()
                .parallel()
                .filter(iStudentDto -> StrUtil.isNotBlank(iStudentDto.getId()))
                .filter(iStudentDto -> StrUtil.isNotBlank(iStudentDto.getName()))
                .map(this::builderStudent)
                .forEach(this::accept);
        log.info("save students redis OK!");
    }

    private Student builderStudent(IStudentDto iStudentDto){
        HashMap<String, String> map = new HashMap<>();
        map.put("id", iStudentDto.getId());
        map.put("name", iStudentDto.getName());
        return StudentBuilder.aStudent()
                .withId(iStudentDto.getId())
                .withKey(STUDENT_ADO + iStudentDto.getId())
                .withMap(map)
                .build();
    }

    private void accept(Student student) {
        hashOperations.putAll(student.getKey(), student.getMap());
    }
}

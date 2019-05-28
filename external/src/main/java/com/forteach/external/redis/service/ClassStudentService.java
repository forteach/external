package com.forteach.external.redis.service;

import com.forteach.external.mysql.repository.StudentRepository;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static com.forteach.external.common.Dic.CLASS_ROOM;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-28 15:46
 * @version: 1.0
 * @description: 同步班级的学生信息
 */
@Service
public class ClassStudentService {
    @Resource
    private StudentRepository studentRepository;
    @Resource
    private StringRedisTemplate stringRedisTemplate;


    public void saveUpdate(){
        studentRepository.findByIsValidatedEqualsAndClassId()
                .parallelStream()
                .filter(Objects::nonNull)
                .forEach(iStudentDto -> {
                    String key = CLASS_ROOM.concat(iStudentDto.getClassId());
                    stringRedisTemplate.opsForSet().add(key, iStudentDto.getStudentId());
                    //设置有效期7天
                    stringRedisTemplate.expire(key, 7, TimeUnit.DAYS);
                });
    }

}

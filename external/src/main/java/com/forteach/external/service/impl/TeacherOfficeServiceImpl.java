package com.forteach.external.service.impl;

import com.forteach.external.oracle.entity.GzJsxxEntity;
import com.forteach.external.oracle.repository.GzJsxxRepository;
import com.forteach.external.service.TeacherOfficeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/8/26 17:43
 * @Version: v1.0
 * @Modified：教研室、院系
 * @Description:
 */
@Service
@Slf4j
public class TeacherOfficeServiceImpl implements TeacherOfficeService {
    private final GzJsxxRepository gzJsxxRepository;

    public TeacherOfficeServiceImpl(GzJsxxRepository gzJsxxRepository) {
        this.gzJsxxRepository = gzJsxxRepository;
    }

    @Override
    public String findTeacherName(String teacherOfficeId) {
        return gzJsxxRepository.findAllByJysbh(teacherOfficeId)
                .stream()
                .filter(Objects::nonNull)
                .map(GzJsxxEntity::getJysmc)
                .findFirst()
                .orElseGet(String::new);
    }

    @Override
    public String findTeacherId(String teacherId) {
        return gzJsxxRepository.findById(teacherId)
                .filter(Objects::nonNull)
                .map(GzJsxxEntity::getJysmc)
                .orElseGet(String::new);
    }
}

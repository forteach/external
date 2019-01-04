package com.forteach.external.service;

import com.forteach.external.oracle.dto.ITeacherDto;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 14:24
 * @Version: 1.0
 * @Description:
 */
public interface TeacherService {
    List<ITeacherDto> findAllDto();
    void saveAll();
    void saveAllByTimestamp();

}

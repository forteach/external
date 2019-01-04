package com.forteach.external.service;

import com.forteach.external.oracle.dto.ICourseDto;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:35
 * @Version: 1.0
 * @Description:
 */
public interface CourseService {
    List<ICourseDto> findAllDto();
    void saveDto();
    void saveByTimestamp();
}

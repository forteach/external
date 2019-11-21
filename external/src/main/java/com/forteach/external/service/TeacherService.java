package com.forteach.external.service;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 14:24
 * @Version: 1.0
 * @Description:
 */
public interface TeacherService {
    /**
     * 从其他数据库查询的教师信息
     * @return
     */
//    List<ITeacherDto> findAllDto();

    /**
     * 保存教师信息
     */
    void saveAll();

    /**
     * 保存最近修改的教师信息
     */
    void saveAllByTimestamp();

}

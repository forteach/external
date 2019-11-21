package com.forteach.external.service;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:35
 * @Version: 1.0
 * @Description:
 */
public interface CourseService {
    /**
     * 查询需要的课程信息
     * @return
     */
//    List<ICourseDto> findAllDto();

    /**
     * 保存课程到mysql数据库
     */
    void saveDto();

    /**
     * 查询最近三天修改的数据同时修改保存的数据
     */
    void saveByTimestamp();

    /**
     * 保存缓存到redis数据
     */
    void saveRedis();
}

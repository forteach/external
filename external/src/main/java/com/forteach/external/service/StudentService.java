package com.forteach.external.service;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 09:44
 * @Version: 1.0
 * @Description:
 */
public interface StudentService {
    /**
     * 程序启动时执行的保存学生信息到redis 和 mysql
     */
    void saveAll();

    /**
     * 每天执行一次的近期修改的用户信息
     */
    void updateTimestamp();

}

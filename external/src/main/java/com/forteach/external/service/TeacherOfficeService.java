package com.forteach.external.service;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/8/26 17:44
 * @Version: v1.0
 * @Modified：教研室、院系
 * @Description:
 */
public interface TeacherOfficeService {
    /**
     * 根据教研室Id查询名称
     *
     * @param teacherOfficeId
     * @return
     */
    String findTeacherName(String teacherOfficeId);

    /**
     * 根据教师Id查询教研室名称
     *
     * @param teacherId
     * @return
     */
    String findTeacherId(String teacherId);
}
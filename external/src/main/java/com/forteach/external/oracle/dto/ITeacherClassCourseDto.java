package com.forteach.external.oracle.dto;

import java.io.Serializable;
/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 15:16
 * @version: 1.0
 * @description: 排课信息dto
 */
public interface ITeacherClassCourseDto extends Serializable {

    /**
     * 教师id
     * @return
     */
    public String getTeacherId();

    /**
     * 课程id
     * @return
     */
    public String getClassId();

    /**
     * 课程id
     * @return
     */
    public String getCourseId();
}

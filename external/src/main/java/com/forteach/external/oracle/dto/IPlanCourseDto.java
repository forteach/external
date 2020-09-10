package com.forteach.external.oracle.dto;

import java.io.Serializable;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/9/9 9:32
 * @Version: v1.0
 * @Modified：排课信息
 * @Description:
 */
public interface IPlanCourseDto extends Serializable {
    /**
     * 主键id
     */
    public String getId();

    /**
     * 课程id
     */
    public String getCourseId();

    /**
     * 学年
     */
    public String getYear();

    /**
     * 学期
     */
    public String getSemester();

    /**
     * 课程名称
     */
    public String getCourseName();

    /**
     * 教师id
     */
    public String getTeacherId();

    /**
     * 教师姓名
     */
    public String getTeacherName();

    /**
     * 节次
     */
    public String getClassRoomNum();

    /**
     * 课程类别
     */
    public String getCourseType();
    /**
     * 周别 0 不分单双周
     * 1 单周 2 双周
     */
    public String getWeekType();

    /**
     * 班级id
     */
    public String getClassId();

    /**
     * 上课的班级教室id
     */
    public String getClassRoomId();

    /**
     * 上课的教室名称
     */
    public String getClassRoomName();

    /**
     * 上课的星期(数字)
     */
    public String getWeekNum();

    /**
     * 排课描述
     */
    public String getPlanCourseDesc();

    /**
     * 周次
     * @return
     */
    public String getClassRoomWeekNum();
}

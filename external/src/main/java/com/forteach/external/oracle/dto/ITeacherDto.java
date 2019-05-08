package com.forteach.external.oracle.dto;

import java.io.Serializable;
/**
 * 教师dto
 */
public interface ITeacherDto extends Serializable {
    /**
     * 教师id
     * @return
     */
    public String getTeacherId();
    /**
     * 教师编号
     * @return
     */
    public String getTeacherCode();

    /**
     *　教师名称
     * @return
     */
    public String getTeacherName();

    /**
     * 教师生效标识
     * 人员状态
     * @return
     */
    public String getIsValidated();


}
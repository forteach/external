package com.forteach.external.oracle.dto;

import java.io.Serializable;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 09:59
 * @Version: 1.0
 * @Description:
 */
public interface IStudentDto extends Serializable {

    /**
     * 学生编号
     *
     * @return
     */
    public String getId();

    /**
     * 用户信息
     *
     * @return
     */
    public String getName();

    /**
     * 身份证号码
     *
     * @return
     */
    public String getIDCardNo();

    /**
     * 班级编号
     *
     * @return
     */
    public String getClassId();

    /**
     * 移动电话
     */
    public String getPhone();

    /*性别*/
    public String getGender();

    /**
     * 年级
     */
    public String getGrade();

    /**
     * 出生日期
     */
    public String getBirthDate();

    /**
     * 是否毕业
     */
    public String getIsGraduate();

    /**
     * 学籍状态
     */
    public String getStudentStatus();

    /**
     * 有效状态 1有效
     *
     * @return
     */
    public String getIsValidated();

    /**
     * 院系教研室编码
     */
    public String getTeacherOfficeId();
}

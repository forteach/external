package com.forteach.external.oracle.dto;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 09:59
 * @Version: 1.0
 * @Description:
 */
public interface IStudentDto {

    /**
     * 学生编号
     * @return
     */
    public String getId();

    /**
     * 用户信息
     * @return
     */
    public String getName();

    /**
     * 身份证号码
     * @return
     */
    public String getIDCardNo();

    /**
     * 有效状态 1有效
     * @return
     */
    public String getIsValidated();
}

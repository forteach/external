package com.forteach.external.oracle.dto;

import java.util.Date;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-25 15:20
 * @Version: 1.0
 * @Description:　系统用户信息
 */
public interface ISysUserDto {
    /**
     * 用户id
     *
     * @return
     */
    public String getId();

    /**
     * 用户名
     *
     * @return
     */
    public String getUserName();

    /**
     * 用户手机号　对应注册数据号
     *
     * @return
     */
    public String getRegisterPhone();

    /**
     * 邮箱
     *
     * @return
     */
    public String getEmail();

    /**
     * 性别
     * 1 男
     * 2 女
     *
     * @return
     */
    public String getGenders();

    /**
     * 创建时间
     *
     * @return
     */
    public Date getCTime();

    /**
     * 修改时间
     *
     * @return
     */
    public Date getUTime();

    /**
     * 创建用户
     *
     * @return
     */
    public String getCUser();

    /**
     * 修改用户
     *
     * @return
     */
    public String getUUser();

}

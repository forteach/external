package com.forteach.external.dto;

import java.util.Date;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-25 15:20
 * @Version: 1.0
 * @Description:
 */
public interface IUserDto {
    /**
     * 用户id
     *
     * @return
     */
    public String id();

    /**
     * 用户名
     *
     * @return
     */
    public String userName();

    /**
     * 用户手机号　对应注册数据号
     *
     * @return
     */
    public String registerPhone();

    /**
     * 邮箱
     *
     * @return
     */
    public String email();

    /**
     * 性别
     * 1 男
     * 2 女
     *
     * @return
     */
    public String genders();

    /**
     * 创建时间
     *
     * @return
     */
    public Date cTime();

    /**
     * 修改时间
     *
     * @return
     */
    public Date uTime();

    /**
     * 创建用户
     *
     * @return
     */
    public String cUser();

    /**
     * 修改用户
     *
     * @return
     */
    public String uUser();

}

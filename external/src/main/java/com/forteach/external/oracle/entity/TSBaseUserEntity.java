package com.forteach.external.oracle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "T_S_BASE_USER", schema = "SZXY")
public class TSBaseUserEntity implements Serializable {

    @Id
    private String id;
    /**
     * 流程
     */
    private Long activitisync;
    /**
     * 浏览器
     */
    private String browser;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户姓名
     */
    private String realname;
    /**
     * 签名
     */
    private byte[] signature;
    /**
     * 用户状态
     */
    private Long status;
    /**
     * key
     */
    private String userkey;
    /**
     * 用户名
     */
    private String username;
    /**
     * 机构编号
     */
    private String departid;
    /**
     * 删除标志
     */
    private Long deleteFlag;
    /**
     * 管理权限
     * １　本部门
     * ２　全部部门
     * ３　指定部门
     */
    private String manageScope;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ACTIVITISYNC", nullable = true, precision = 0)
    public Long getActivitisync() {
        return activitisync;
    }

    public void setActivitisync(Long activitisync) {
        this.activitisync = activitisync;
    }

    @Basic
    @Column(name = "BROWSER", nullable = true, length = 20)
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "REALNAME", nullable = true, length = 50)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "SIGNATURE", nullable = true)
    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, precision = 0)
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "USERKEY", nullable = true, length = 200)
    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "DEPARTID", nullable = true, length = 32)
    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    @Basic
    @Column(name = "DELETE_FLAG", nullable = true, precision = 0)
    public Long getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Long deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Basic
    @Column(name = "MANAGE_SCOPE", nullable = true, length = 1)
    public String getManageScope() {
        return manageScope;
    }

    public void setManageScope(String manageScope) {
        this.manageScope = manageScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSBaseUserEntity that = (TSBaseUserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(activitisync, that.activitisync) &&
                Objects.equals(browser, that.browser) &&
                Objects.equals(password, that.password) &&
                Objects.equals(realname, that.realname) &&
                Arrays.equals(signature, that.signature) &&
                Objects.equals(status, that.status) &&
                Objects.equals(userkey, that.userkey) &&
                Objects.equals(username, that.username) &&
                Objects.equals(departid, that.departid) &&
                Objects.equals(deleteFlag, that.deleteFlag) &&
                Objects.equals(manageScope, that.manageScope);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, activitisync, browser, password, realname, status, userkey, username, departid, deleteFlag, manageScope);
        result = 31 * result + Arrays.hashCode(signature);
        return result;
    }
}

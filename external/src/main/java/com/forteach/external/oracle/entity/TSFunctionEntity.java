package com.forteach.external.oracle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "T_S_FUNCTION", schema = "SZXY")
public class TSFunctionEntity implements Serializable {
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * target
     */
    private Long functioniframe;
    /**
     * 级次
     */
    private Long functionlevel;
    /**
     * 菜单名
     */
    private String functionname;
    /**
     * 顺序号
     */
    private String functionorder;
    /**
     * Url
     */
    private String functionurl;
    /**
     * 父菜单ID
     */
    private String parentfunctionid;
    /**
     * 图标ID
     */
    private String iconid;
    /**
     * 桌面图表ID
     */
    private String deskIconid;
    /**
     * 菜单类型
     */
    private Long functiontype;
    /**
     * style
     */
    private String functionIconStyle;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建人姓名
     */
    private String createName;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 修改日期
     */
    private Date updateDate;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 修改人
     */
    private String updateName;
    /**
     * 应用系统别名（关联T_S_APPLICATION的app_code）
     */
    private String appCode;
    /**
     * 业务分类
     */
    private String bussinessType;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FUNCTIONIFRAME", nullable = true, precision = 0)
    public Long getFunctioniframe() {
        return functioniframe;
    }

    public void setFunctioniframe(Long functioniframe) {
        this.functioniframe = functioniframe;
    }

    @Basic
    @Column(name = "FUNCTIONLEVEL", nullable = true, precision = 0)
    public Long getFunctionlevel() {
        return functionlevel;
    }

    public void setFunctionlevel(Long functionlevel) {
        this.functionlevel = functionlevel;
    }

    @Basic
    @Column(name = "FUNCTIONNAME", nullable = false, length = 50)
    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    @Basic
    @Column(name = "FUNCTIONORDER", nullable = true, length = 255)
    public String getFunctionorder() {
        return functionorder;
    }

    public void setFunctionorder(String functionorder) {
        this.functionorder = functionorder;
    }

    @Basic
    @Column(name = "FUNCTIONURL", nullable = true, length = 500)
    public String getFunctionurl() {
        return functionurl;
    }

    public void setFunctionurl(String functionurl) {
        this.functionurl = functionurl;
    }

    @Basic
    @Column(name = "PARENTFUNCTIONID", nullable = true, length = 32)
    public String getParentfunctionid() {
        return parentfunctionid;
    }

    public void setParentfunctionid(String parentfunctionid) {
        this.parentfunctionid = parentfunctionid;
    }

    @Basic
    @Column(name = "ICONID", nullable = true, length = 32)
    public String getIconid() {
        return iconid;
    }

    public void setIconid(String iconid) {
        this.iconid = iconid;
    }

    @Basic
    @Column(name = "DESK_ICONID", nullable = true, length = 32)
    public String getDeskIconid() {
        return deskIconid;
    }

    public void setDeskIconid(String deskIconid) {
        this.deskIconid = deskIconid;
    }

    @Basic
    @Column(name = "FUNCTIONTYPE", nullable = true, precision = 0)
    public Long getFunctiontype() {
        return functiontype;
    }

    public void setFunctiontype(Long functiontype) {
        this.functiontype = functiontype;
    }

    @Basic
    @Column(name = "FUNCTION_ICON_STYLE", nullable = true, length = 255)
    public String getFunctionIconStyle() {
        return functionIconStyle;
    }

    public void setFunctionIconStyle(String functionIconStyle) {
        this.functionIconStyle = functionIconStyle;
    }

    @Basic
    @Column(name = "CREATE_BY", nullable = true, length = 32)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "CREATE_NAME", nullable = true, length = 32)
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Basic
    @Column(name = "UPDATE_BY", nullable = true, length = 32)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "UPDATE_DATE", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "UPDATE_NAME", nullable = true, length = 32)
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Basic
    @Column(name = "APP_CODE", nullable = true, length = 20)
    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    @Basic
    @Column(name = "BUSSINESS_TYPE", nullable = true, length = 50)
    public String getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSFunctionEntity that = (TSFunctionEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(functioniframe, that.functioniframe) &&
                Objects.equals(functionlevel, that.functionlevel) &&
                Objects.equals(functionname, that.functionname) &&
                Objects.equals(functionorder, that.functionorder) &&
                Objects.equals(functionurl, that.functionurl) &&
                Objects.equals(parentfunctionid, that.parentfunctionid) &&
                Objects.equals(iconid, that.iconid) &&
                Objects.equals(deskIconid, that.deskIconid) &&
                Objects.equals(functiontype, that.functiontype) &&
                Objects.equals(functionIconStyle, that.functionIconStyle) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(createName, that.createName) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateName, that.updateName) &&
                Objects.equals(appCode, that.appCode) &&
                Objects.equals(bussinessType, that.bussinessType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, functioniframe, functionlevel, functionname, functionorder, functionurl, parentfunctionid, iconid, deskIconid, functiontype, functionIconStyle, createBy, createName, updateBy, updateDate, createDate, updateName, appCode, bussinessType);
    }
}

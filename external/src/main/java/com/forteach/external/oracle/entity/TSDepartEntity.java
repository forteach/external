package com.forteach.external.oracle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:　组织机构信息
 */
@Entity
@Table(name = "T_S_DEPART", schema = "SZXY", catalog = "")
public class TSDepartEntity implements Serializable {
    @Id
    private String id;
    /**
     * 组织机构名称
     */
    private String departname;
    /**
     * 描述
     */
    private String description;
    /**
     * 父级编号
     */
    private String parentdepartid;
    /**
     * 组织机构编码
     */
    private String orgCode;
    /**
     * 机构类型
     * １行政机构
     * 2 教研室
     */
    private String orgType;
    /**
     * 手机号
     */
    private String mobile;
    /**
     *
     */
    private String fax;
    /**
     * 地址
     */
    private String address;
    /**
     * 序号
     * 顺序号　用于组织机构排序
     */
    private String departOrder;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DEPARTNAME", nullable = false, length = 100)
    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PARENTDEPARTID", nullable = true, length = 32)
    public String getParentdepartid() {
        return parentdepartid;
    }

    public void setParentdepartid(String parentdepartid) {
        this.parentdepartid = parentdepartid;
    }

    @Basic
    @Column(name = "ORG_CODE", nullable = true, length = 64)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Basic
    @Column(name = "ORG_TYPE", nullable = true, length = 1)
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 32)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "FAX", nullable = true, length = 32)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "DEPART_ORDER", nullable = true, length = 5)
    public String getDepartOrder() {
        return departOrder;
    }

    public void setDepartOrder(String departOrder) {
        this.departOrder = departOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSDepartEntity that = (TSDepartEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(departname, that.departname) &&
                Objects.equals(description, that.description) &&
                Objects.equals(parentdepartid, that.parentdepartid) &&
                Objects.equals(orgCode, that.orgCode) &&
                Objects.equals(orgType, that.orgType) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(address, that.address) &&
                Objects.equals(departOrder, that.departOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departname, description, parentdepartid, orgCode, orgType, mobile, fax, address, departOrder);
    }
}

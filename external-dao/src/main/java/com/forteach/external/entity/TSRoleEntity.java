package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
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
@Table(name = "T_S_ROLE", schema = "SZXY", catalog = "")
public class TSRoleEntity implements Serializable {
    @Id
    private String id;
    private String rolecode;
    private String rolename;
    private String updateName;
    private Date updateDate;
    private String updateBy;
    private String createName;
    private Date createDate;
    private String createBy;
    private String roletype;
    private String dept;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLECODE", nullable = true, length = 50)
    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    @Basic
    @Column(name = "ROLENAME", nullable = false, length = 100)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
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
    @Column(name = "UPDATE_DATE", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
    @Column(name = "CREATE_NAME", nullable = true, length = 32)
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
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
    @Column(name = "CREATE_BY", nullable = true, length = 32)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "ROLETYPE", nullable = true, length = 1)
    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }

    @Basic
    @Column(name = "DEPT", nullable = true, length = 500)
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSRoleEntity that = (TSRoleEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(rolecode, that.rolecode) &&
                Objects.equals(rolename, that.rolename) &&
                Objects.equals(updateName, that.updateName) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(createName, that.createName) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(roletype, that.roletype) &&
                Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rolecode, rolename, updateName, updateDate, updateBy, createName, createDate, createBy, roletype, dept);
    }
}

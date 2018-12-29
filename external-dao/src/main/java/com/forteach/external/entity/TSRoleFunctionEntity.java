package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "T_S_ROLE_FUNCTION", schema = "SZXY", catalog = "")
public class TSRoleFunctionEntity implements Serializable {
    @Id
    private String id;
    /**
     * 菜单类型
     */
    private String operation;
    /**
     * 菜单id
     */
    private String functionid;
    /**
     * 角色id
     */
    private String roleid;
    /**
     * 权限id
     */
    private String datarule;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "OPERATION", nullable = true, length = 1000)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "FUNCTIONID", nullable = true, length = 32)
    public String getFunctionid() {
        return functionid;
    }

    public void setFunctionid(String functionid) {
        this.functionid = functionid;
    }

    @Basic
    @Column(name = "ROLEID", nullable = true, length = 32)
    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "DATARULE", nullable = true, length = 1000)
    public String getDatarule() {
        return datarule;
    }

    public void setDatarule(String datarule) {
        this.datarule = datarule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSRoleFunctionEntity that = (TSRoleFunctionEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(functionid, that.functionid) &&
                Objects.equals(roleid, that.roleid) &&
                Objects.equals(datarule, that.datarule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operation, functionid, roleid, datarule);
    }
}

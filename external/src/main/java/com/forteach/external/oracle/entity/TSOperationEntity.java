package com.forteach.external.oracle.entity;

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
@Table(name = "T_S_OPERATION", schema = "SZXY", catalog = "")
public class TSOperationEntity implements Serializable {
    @Id
    private String id;
    /**
     * 操作权限code
     */
    private String operationcode;
    /**
     * 皮肤
     */
    private String operationicon;
    /**
     * 操作权限名称
     */
    private String operationname;
    /**
     * 状态
     */
    private Long status;
    /**
     * 菜单id
     */
    private String functionid;
    /**
     * 皮肤id
     */
    private String iconid;
    /**
     * 操作类型
     */
    private Long operationtype;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "OPERATIONCODE", nullable = true, length = 50)
    public String getOperationcode() {
        return operationcode;
    }

    public void setOperationcode(String operationcode) {
        this.operationcode = operationcode;
    }

    @Basic
    @Column(name = "OPERATIONICON", nullable = true, length = 100)
    public String getOperationicon() {
        return operationicon;
    }

    public void setOperationicon(String operationicon) {
        this.operationicon = operationicon;
    }

    @Basic
    @Column(name = "OPERATIONNAME", nullable = true, length = 50)
    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
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
    @Column(name = "FUNCTIONID", nullable = true, length = 32)
    public String getFunctionid() {
        return functionid;
    }

    public void setFunctionid(String functionid) {
        this.functionid = functionid;
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
    @Column(name = "OPERATIONTYPE", nullable = true, precision = 0)
    public Long getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(Long operationtype) {
        this.operationtype = operationtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSOperationEntity that = (TSOperationEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(operationcode, that.operationcode) &&
                Objects.equals(operationicon, that.operationicon) &&
                Objects.equals(operationname, that.operationname) &&
                Objects.equals(status, that.status) &&
                Objects.equals(functionid, that.functionid) &&
                Objects.equals(iconid, that.iconid) &&
                Objects.equals(operationtype, that.operationtype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operationcode, operationicon, operationname, status, functionid, iconid, operationtype);
    }
}

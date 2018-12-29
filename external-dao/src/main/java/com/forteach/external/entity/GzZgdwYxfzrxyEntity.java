package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:33
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "GZ_ZGDW_YXFZRXY", schema = "SZXY", catalog = "")
public class GzZgdwYxfzrxyEntity implements Serializable {
    @Id
    private String id;
    /**
     * 教工号
     */
    private String jgh;
    /**
     * 教研室号
     */
    private String xybh;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 修改人姓名
     */
    private String updateName;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建人姓名
     */
    private String createName;
    /**
     * 创建时间
     */
    private Date createTime;

    @Basic
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JGH", nullable = true, length = 50)
    public String getJgh() {
        return jgh;
    }

    public void setJgh(String jgh) {
        this.jgh = jgh;
    }

    @Basic
    @Column(name = "XYBH", nullable = true, length = 50)
    public String getXybh() {
        return xybh;
    }

    public void setXybh(String xybh) {
        this.xybh = xybh;
    }

    @Basic
    @Column(name = "UPDATE_BY", nullable = true, length = 50)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "UPDATE_NAME", nullable = true, length = 50)
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = true)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "CREATE_BY", nullable = true, length = 50)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "CREATE_NAME", nullable = true, length = 50)
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzZgdwYxfzrxyEntity that = (GzZgdwYxfzrxyEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(jgh, that.jgh) &&
                Objects.equals(xybh, that.xybh) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateName, that.updateName) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(createName, that.createName) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jgh, xybh, updateBy, updateName, updateTime, createBy, createName, createTime);
    }
}

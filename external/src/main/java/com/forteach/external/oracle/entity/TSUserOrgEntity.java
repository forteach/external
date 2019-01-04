package com.forteach.external.oracle.entity;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description: 用户组织机构表
 */
@Entity
@Table(name = "T_S_USER_ORG", schema = "SZXY", catalog = "")
@ToString
public class TSUserOrgEntity implements Serializable {
    @Id
    private String id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 机构ID
     */
    private String orgId;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSUserOrgEntity that = (TSUserOrgEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, orgId);
    }
}

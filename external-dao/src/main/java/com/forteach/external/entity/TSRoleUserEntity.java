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
@Table(name = "T_S_ROLE_USER", schema = "SZXY", catalog = "")
public class TSRoleUserEntity implements Serializable {
    @Id
    private String id;
    /**
     * 角色ID
     */
    private String roleid;
    /**
     * 用户ID
     */
    private String userid;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "USERID", nullable = true, length = 32)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSRoleUserEntity that = (TSRoleUserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(roleid, that.roleid) &&
                Objects.equals(userid, that.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleid, userid);
    }
}

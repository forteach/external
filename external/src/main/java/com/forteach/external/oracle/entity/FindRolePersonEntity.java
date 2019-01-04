package com.forteach.external.oracle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:33
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "FIND_ROLE_PERSON", schema = "SZXY", catalog = "")
public class FindRolePersonEntity implements Serializable {
    @Id
    private String realname;
    private String rolecode;
    private String rolename;

    @Basic
    @Column(name = "REALNAME", nullable = true, length = 50)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
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
    @Column(name = "ROLENAME", nullable = true, length = 100)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FindRolePersonEntity that = (FindRolePersonEntity) o;
        return Objects.equals(realname, that.realname) &&
                Objects.equals(rolecode, that.rolecode) &&
                Objects.equals(rolename, that.rolename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realname, rolecode, rolename);
    }
}

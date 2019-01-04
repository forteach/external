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
@Table(name = "GZ_JZXX_XSXX", schema = "SZXY", catalog = "")
public class GzJzxxXsxxEntity implements Serializable {
    @Id
    private String id;
    /**
     * 家长id
     */
    private String jzid;
    /**
     * 学生id
     */
    private String xsid;

    @Basic
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JZID", nullable = true, length = 50)
    public String getJzid() {
        return jzid;
    }

    public void setJzid(String jzid) {
        this.jzid = jzid;
    }

    @Basic
    @Column(name = "XSID", nullable = true, length = 50)
    public String getXsid() {
        return xsid;
    }

    public void setXsid(String xsid) {
        this.xsid = xsid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzJzxxXsxxEntity that = (GzJzxxXsxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(jzid, that.jzid) &&
                Objects.equals(xsid, that.xsid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jzid, xsid);
    }
}

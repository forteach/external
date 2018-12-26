package com.forteach.external.entity;

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
@Table(name = "GZ_JSXX", schema = "SZXY", catalog = "")
public class GzJsxxEntity implements Serializable {
    @Id
    private String jsbh;
    private String jsxm;
    private String jysbh;
    private String jysmc;

    @Basic
    @Column(name = "JSBH", nullable = true, length = 50)
    public String getJsbh() {
        return jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh;
    }

    @Basic
    @Column(name = "JSXM", nullable = true, length = 50)
    public String getJsxm() {
        return jsxm;
    }

    public void setJsxm(String jsxm) {
        this.jsxm = jsxm;
    }

    @Basic
    @Column(name = "JYSBH", nullable = true, length = 50)
    public String getJysbh() {
        return jysbh;
    }

    public void setJysbh(String jysbh) {
        this.jysbh = jysbh;
    }

    @Basic
    @Column(name = "JYSMC", nullable = false, length = 100)
    public String getJysmc() {
        return jysmc;
    }

    public void setJysmc(String jysmc) {
        this.jysmc = jysmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzJsxxEntity that = (GzJsxxEntity) o;
        return Objects.equals(jsbh, that.jsbh) &&
                Objects.equals(jsxm, that.jsxm) &&
                Objects.equals(jysbh, that.jysbh) &&
                Objects.equals(jysmc, that.jysmc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsbh, jsxm, jysbh, jysmc);
    }
}

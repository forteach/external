package com.forteach.external.oracle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:33
 * @Version: 1.0
 * @Description: 学期信息
 */
@Entity
@Table(name = "GZ_XQXXB", schema = "SZXY", catalog = "")
public class GzXqxxbEntity implements Serializable {
    @Id
    private String xqbh;
    /**
     * 学期名称
     */
    private String xqmc;
    /**
     * 开始时间
     */
    private Date kssj;
    /**
     * 结束时间
     */
    private Date jssj;
    /**
     * 是否当前　1 是　2 否
     */
    private String sfdq;
    /**
     * 学期
     */
    private String xq;
    /**
     * 学年
     */
    private String xn;

    @Basic
    @Column(name = "XQBH", nullable = false, length = 36)
    public String getXqbh() {
        return xqbh;
    }

    public void setXqbh(String xqbh) {
        this.xqbh = xqbh;
    }

    @Basic
    @Column(name = "XQMC", nullable = true, length = 500)
    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc;
    }

    @Basic
    @Column(name = "KSSJ", nullable = true)
    public Date getKssj() {
        return kssj;
    }

    public void setKssj(Date kssj) {
        this.kssj = kssj;
    }

    @Basic
    @Column(name = "JSSJ", nullable = true)
    public Date getJssj() {
        return jssj;
    }

    public void setJssj(Date jssj) {
        this.jssj = jssj;
    }

    @Basic
    @Column(name = "SFDQ", nullable = true, length = 1)
    public String getSfdq() {
        return sfdq;
    }

    public void setSfdq(String sfdq) {
        this.sfdq = sfdq;
    }

    @Basic
    @Column(name = "XQ", nullable = true, length = 1)
    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq;
    }

    @Basic
    @Column(name = "XN", nullable = true, length = 4)
    public String getXn() {
        return xn;
    }

    public void setXn(String xn) {
        this.xn = xn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzXqxxbEntity that = (GzXqxxbEntity) o;
        return Objects.equals(xqbh, that.xqbh) &&
                Objects.equals(xqmc, that.xqmc) &&
                Objects.equals(kssj, that.kssj) &&
                Objects.equals(jssj, that.jssj) &&
                Objects.equals(sfdq, that.sfdq) &&
                Objects.equals(xq, that.xq) &&
                Objects.equals(xn, that.xn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xqbh, xqmc, kssj, jssj, sfdq, xq, xn);
    }
}

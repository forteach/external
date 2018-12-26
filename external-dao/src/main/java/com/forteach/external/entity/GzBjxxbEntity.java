package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:33
 * @Version: 1.0
 * @Description:　班级信息表
 */
@Entity
@Table(name = "GZ_BJXXB", schema = "SZXY", catalog = "")
public class GzBjxxbEntity implements Serializable {
    @Id
    private String bjbh;
    /**
     * 班级名称
     */
    private String bjmc;
    /**
     * 所属年级
     */
    private Long ssnj;
    /**
     * 专业代码
     */
    private String zydm;
    /**
     * 专业名称
     */
    private String zymc;
    /**
     * 学生人数
     */
    private Long xsrs;
    /**
     * 男生树
     */
    private Long nss;
    /**
     * 女生数
     */
    private Long nvss;
    /**
     * 班主任编号
     */
    private String bzrbh;
    /**
     * 部门编号
     */
    private String bmbh;

    @Basic
    @Column(name = "BJBH", nullable = false, length = 300)
    public String getBjbh() {
        return bjbh;
    }

    public void setBjbh(String bjbh) {
        this.bjbh = bjbh;
    }

    @Basic
    @Column(name = "BJMC", nullable = true, length = 300)
    public String getBjmc() {
        return bjmc;
    }

    public void setBjmc(String bjmc) {
        this.bjmc = bjmc;
    }

    @Basic
    @Column(name = "SSNJ", nullable = true, precision = 0)
    public Long getSsnj() {
        return ssnj;
    }

    public void setSsnj(Long ssnj) {
        this.ssnj = ssnj;
    }

    @Basic
    @Column(name = "ZYDM", nullable = true, length = 20)
    public String getZydm() {
        return zydm;
    }

    public void setZydm(String zydm) {
        this.zydm = zydm;
    }

    @Basic
    @Column(name = "ZYMC", nullable = true, length = 90)
    public String getZymc() {
        return zymc;
    }

    public void setZymc(String zymc) {
        this.zymc = zymc;
    }

    @Basic
    @Column(name = "XSRS", nullable = true, precision = 0)
    public Long getXsrs() {
        return xsrs;
    }

    public void setXsrs(Long xsrs) {
        this.xsrs = xsrs;
    }

    @Basic
    @Column(name = "NSS", nullable = true, precision = 0)
    public Long getNss() {
        return nss;
    }

    public void setNss(Long nss) {
        this.nss = nss;
    }

    @Basic
    @Column(name = "NVSS", nullable = true, precision = 0)
    public Long getNvss() {
        return nvss;
    }

    public void setNvss(Long nvss) {
        this.nvss = nvss;
    }

    @Basic
    @Column(name = "BZRBH", nullable = true, length = 0)
    public String getBzrbh() {
        return bzrbh;
    }

    public void setBzrbh(String bzrbh) {
        this.bzrbh = bzrbh;
    }

    @Basic
    @Column(name = "BMBH", nullable = true, length = 30)
    public String getBmbh() {
        return bmbh;
    }

    public void setBmbh(String bmbh) {
        this.bmbh = bmbh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzBjxxbEntity that = (GzBjxxbEntity) o;
        return Objects.equals(bjbh, that.bjbh) &&
                Objects.equals(bjmc, that.bjmc) &&
                Objects.equals(ssnj, that.ssnj) &&
                Objects.equals(zydm, that.zydm) &&
                Objects.equals(zymc, that.zymc) &&
                Objects.equals(xsrs, that.xsrs) &&
                Objects.equals(nss, that.nss) &&
                Objects.equals(nvss, that.nvss) &&
                Objects.equals(bzrbh, that.bzrbh) &&
                Objects.equals(bmbh, that.bmbh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bjbh, bjmc, ssnj, zydm, zymc, xsrs, nss, nvss, bzrbh, bmbh);
    }
}

package com.forteach.external.entity;

import lombok.ToString;

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
@ToString
@Table(name = "ZHXY_ZXFW_QJXX", schema = "SZXY", catalog = "")
public class ZhxyZxfwQjxxEntity implements Serializable {
    @Id
    private String id;
    private String xsbh;
    private String qjlx;
    private String qjsy;
    private String ksrq;
    private String jsrq;
    private String qjts;
    private String shzt;
    private String fdyyj;
    private String yxyj;
    private String xgbyj;
    private String spjb;
    private String sqrq;
    private String sqr;
    private String bz;
    private String xjzt;
    private String sjts;
    private String xjsy;
    private String fj;
    private String fjwz;
    private String fjmc;
    private String bzrshsj;
    private String fdyshsj;
    private String xyldshsj;
    private String xscshsj;
    private String bjyj;
    private Long qjxn;
    private String qjxq;
    private String dxsj;
    private String sffsyj;
    private String lxdh;
    private String bzrgh;
    private String bzrxm;
    private String fdygh;
    private String fdyxm;
    private String xyldgh;
    private String xyldxm;
    private String xscgh;
    private String xscxm;
    private String qx;
    private Long ksdjj;
    private Long jsdjj;
    private String lsh;
    private String wcmdd;

    @Basic
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "XSBH", nullable = false, length = 40)
    public String getXsbh() {
        return xsbh;
    }

    public void setXsbh(String xsbh) {
        this.xsbh = xsbh;
    }

    @Basic
    @Column(name = "QJLX", nullable = true, length = 10)
    public String getQjlx() {
        return qjlx;
    }

    public void setQjlx(String qjlx) {
        this.qjlx = qjlx;
    }

    @Basic
    @Column(name = "QJSY", nullable = true, length = 400)
    public String getQjsy() {
        return qjsy;
    }

    public void setQjsy(String qjsy) {
        this.qjsy = qjsy;
    }

    @Basic
    @Column(name = "KSRQ", nullable = false, length = 60)
    public String getKsrq() {
        return ksrq;
    }

    public void setKsrq(String ksrq) {
        this.ksrq = ksrq;
    }

    @Basic
    @Column(name = "JSRQ", nullable = false, length = 60)
    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    @Basic
    @Column(name = "QJTS", nullable = true, length = 200)
    public String getQjts() {
        return qjts;
    }

    public void setQjts(String qjts) {
        this.qjts = qjts;
    }

    @Basic
    @Column(name = "SHZT", nullable = true, length = 10)
    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt;
    }

    @Basic
    @Column(name = "FDYYJ", nullable = true, length = 200)
    public String getFdyyj() {
        return fdyyj;
    }

    public void setFdyyj(String fdyyj) {
        this.fdyyj = fdyyj;
    }

    @Basic
    @Column(name = "YXYJ", nullable = true, length = 200)
    public String getYxyj() {
        return yxyj;
    }

    public void setYxyj(String yxyj) {
        this.yxyj = yxyj;
    }

    @Basic
    @Column(name = "XGBYJ", nullable = true, length = 200)
    public String getXgbyj() {
        return xgbyj;
    }

    public void setXgbyj(String xgbyj) {
        this.xgbyj = xgbyj;
    }

    @Basic
    @Column(name = "SPJB", nullable = true, length = 10)
    public String getSpjb() {
        return spjb;
    }

    public void setSpjb(String spjb) {
        this.spjb = spjb;
    }

    @Basic
    @Column(name = "SQRQ", nullable = true, length = 30)
    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
    }

    @Basic
    @Column(name = "SQR", nullable = true, length = 20)
    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    @Basic
    @Column(name = "BZ", nullable = true, length = 400)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "XJZT", nullable = true, length = 10)
    public String getXjzt() {
        return xjzt;
    }

    public void setXjzt(String xjzt) {
        this.xjzt = xjzt;
    }

    @Basic
    @Column(name = "SJTS", nullable = true, length = 10)
    public String getSjts() {
        return sjts;
    }

    public void setSjts(String sjts) {
        this.sjts = sjts;
    }

    @Basic
    @Column(name = "XJSY", nullable = true, length = 400)
    public String getXjsy() {
        return xjsy;
    }

    public void setXjsy(String xjsy) {
        this.xjsy = xjsy;
    }

    @Basic
    @Column(name = "FJ", nullable = true, length = 300)
    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
    }

    @Basic
    @Column(name = "FJWZ", nullable = true, length = 300)
    public String getFjwz() {
        return fjwz;
    }

    public void setFjwz(String fjwz) {
        this.fjwz = fjwz;
    }

    @Basic
    @Column(name = "FJMC", nullable = true, length = 300)
    public String getFjmc() {
        return fjmc;
    }

    public void setFjmc(String fjmc) {
        this.fjmc = fjmc;
    }

    @Basic
    @Column(name = "BZRSHSJ", nullable = true, length = 30)
    public String getBzrshsj() {
        return bzrshsj;
    }

    public void setBzrshsj(String bzrshsj) {
        this.bzrshsj = bzrshsj;
    }

    @Basic
    @Column(name = "FDYSHSJ", nullable = true, length = 30)
    public String getFdyshsj() {
        return fdyshsj;
    }

    public void setFdyshsj(String fdyshsj) {
        this.fdyshsj = fdyshsj;
    }

    @Basic
    @Column(name = "XYLDSHSJ", nullable = true, length = 30)
    public String getXyldshsj() {
        return xyldshsj;
    }

    public void setXyldshsj(String xyldshsj) {
        this.xyldshsj = xyldshsj;
    }

    @Basic
    @Column(name = "XSCSHSJ", nullable = true, length = 30)
    public String getXscshsj() {
        return xscshsj;
    }

    public void setXscshsj(String xscshsj) {
        this.xscshsj = xscshsj;
    }

    @Basic
    @Column(name = "BJYJ", nullable = true, length = 200)
    public String getBjyj() {
        return bjyj;
    }

    public void setBjyj(String bjyj) {
        this.bjyj = bjyj;
    }

    @Basic
    @Column(name = "QJXN", nullable = true, precision = 0)
    public Long getQjxn() {
        return qjxn;
    }

    public void setQjxn(Long qjxn) {
        this.qjxn = qjxn;
    }

    @Basic
    @Column(name = "QJXQ", nullable = true, length = 10)
    public String getQjxq() {
        return qjxq;
    }

    public void setQjxq(String qjxq) {
        this.qjxq = qjxq;
    }

    @Basic
    @Column(name = "DXSJ", nullable = true, length = 30)
    public String getDxsj() {
        return dxsj;
    }

    public void setDxsj(String dxsj) {
        this.dxsj = dxsj;
    }

    @Basic
    @Column(name = "SFFSYJ", nullable = true, length = 1)
    public String getSffsyj() {
        return sffsyj;
    }

    public void setSffsyj(String sffsyj) {
        this.sffsyj = sffsyj;
    }

    @Basic
    @Column(name = "LXDH", nullable = true, length = 30)
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "BZRGH", nullable = true, length = 30)
    public String getBzrgh() {
        return bzrgh;
    }

    public void setBzrgh(String bzrgh) {
        this.bzrgh = bzrgh;
    }

    @Basic
    @Column(name = "BZRXM", nullable = true, length = 60)
    public String getBzrxm() {
        return bzrxm;
    }

    public void setBzrxm(String bzrxm) {
        this.bzrxm = bzrxm;
    }

    @Basic
    @Column(name = "FDYGH", nullable = true, length = 30)
    public String getFdygh() {
        return fdygh;
    }

    public void setFdygh(String fdygh) {
        this.fdygh = fdygh;
    }

    @Basic
    @Column(name = "FDYXM", nullable = true, length = 60)
    public String getFdyxm() {
        return fdyxm;
    }

    public void setFdyxm(String fdyxm) {
        this.fdyxm = fdyxm;
    }

    @Basic
    @Column(name = "XYLDGH", nullable = true, length = 30)
    public String getXyldgh() {
        return xyldgh;
    }

    public void setXyldgh(String xyldgh) {
        this.xyldgh = xyldgh;
    }

    @Basic
    @Column(name = "XYLDXM", nullable = true, length = 60)
    public String getXyldxm() {
        return xyldxm;
    }

    public void setXyldxm(String xyldxm) {
        this.xyldxm = xyldxm;
    }

    @Basic
    @Column(name = "XSCGH", nullable = true, length = 30)
    public String getXscgh() {
        return xscgh;
    }

    public void setXscgh(String xscgh) {
        this.xscgh = xscgh;
    }

    @Basic
    @Column(name = "XSCXM", nullable = true, length = 60)
    public String getXscxm() {
        return xscxm;
    }

    public void setXscxm(String xscxm) {
        this.xscxm = xscxm;
    }

    @Basic
    @Column(name = "QX", nullable = true, length = 400)
    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    @Basic
    @Column(name = "KSDJJ", nullable = true, precision = 0)
    public Long getKsdjj() {
        return ksdjj;
    }

    public void setKsdjj(Long ksdjj) {
        this.ksdjj = ksdjj;
    }

    @Basic
    @Column(name = "JSDJJ", nullable = true, precision = 0)
    public Long getJsdjj() {
        return jsdjj;
    }

    public void setJsdjj(Long jsdjj) {
        this.jsdjj = jsdjj;
    }

    @Basic
    @Column(name = "LSH", nullable = true, length = 20)
    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    @Basic
    @Column(name = "WCMDD", nullable = true, length = 200)
    public String getWcmdd() {
        return wcmdd;
    }

    public void setWcmdd(String wcmdd) {
        this.wcmdd = wcmdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyZxfwQjxxEntity that = (ZhxyZxfwQjxxEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(xsbh, that.xsbh) &&
                Objects.equals(qjlx, that.qjlx) &&
                Objects.equals(qjsy, that.qjsy) &&
                Objects.equals(ksrq, that.ksrq) &&
                Objects.equals(jsrq, that.jsrq) &&
                Objects.equals(qjts, that.qjts) &&
                Objects.equals(shzt, that.shzt) &&
                Objects.equals(fdyyj, that.fdyyj) &&
                Objects.equals(yxyj, that.yxyj) &&
                Objects.equals(xgbyj, that.xgbyj) &&
                Objects.equals(spjb, that.spjb) &&
                Objects.equals(sqrq, that.sqrq) &&
                Objects.equals(sqr, that.sqr) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(xjzt, that.xjzt) &&
                Objects.equals(sjts, that.sjts) &&
                Objects.equals(xjsy, that.xjsy) &&
                Objects.equals(fj, that.fj) &&
                Objects.equals(fjwz, that.fjwz) &&
                Objects.equals(fjmc, that.fjmc) &&
                Objects.equals(bzrshsj, that.bzrshsj) &&
                Objects.equals(fdyshsj, that.fdyshsj) &&
                Objects.equals(xyldshsj, that.xyldshsj) &&
                Objects.equals(xscshsj, that.xscshsj) &&
                Objects.equals(bjyj, that.bjyj) &&
                Objects.equals(qjxn, that.qjxn) &&
                Objects.equals(qjxq, that.qjxq) &&
                Objects.equals(dxsj, that.dxsj) &&
                Objects.equals(sffsyj, that.sffsyj) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(bzrgh, that.bzrgh) &&
                Objects.equals(bzrxm, that.bzrxm) &&
                Objects.equals(fdygh, that.fdygh) &&
                Objects.equals(fdyxm, that.fdyxm) &&
                Objects.equals(xyldgh, that.xyldgh) &&
                Objects.equals(xyldxm, that.xyldxm) &&
                Objects.equals(xscgh, that.xscgh) &&
                Objects.equals(xscxm, that.xscxm) &&
                Objects.equals(qx, that.qx) &&
                Objects.equals(ksdjj, that.ksdjj) &&
                Objects.equals(jsdjj, that.jsdjj) &&
                Objects.equals(lsh, that.lsh) &&
                Objects.equals(wcmdd, that.wcmdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, xsbh, qjlx, qjsy, ksrq, jsrq, qjts, shzt, fdyyj, yxyj, xgbyj, spjb, sqrq, sqr, bz, xjzt, sjts, xjsy, fj, fjwz, fjmc, bzrshsj, fdyshsj, xyldshsj, xscshsj, bjyj, qjxn, qjxq, dxsj, sffsyj, lxdh, bzrgh, bzrxm, fdygh, fdyxm, xyldgh, xyldxm, xscgh, xscxm, qx, ksdjj, jsdjj, lsh, wcmdd);
    }
}

package com.forteach.external.entity;

import lombok.ToString;

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
@Table(name = "GZ_DEPT", schema = "SZXY", catalog = "")
@ToString
public class GzDeptEntity implements Serializable {
    @Id
    private String gid;
    private String bmbh;
    private String bmmc;
    private String bmfzr;
    private String bmys;
    private String sjbm;
    private String sjbj;
    private String sffjd;
    private String pxxh;
    private String rtxbh;
    private String rtxpbh;

    @Basic
    @Column(name = "GID", nullable = false, length = 32)
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "BMBH", nullable = false, length = 32)
    public String getBmbh() {
        return bmbh;
    }

    public void setBmbh(String bmbh) {
        this.bmbh = bmbh;
    }

    @Basic
    @Column(name = "BMMC", nullable = false, length = 100)
    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    @Basic
    @Column(name = "BMFZR", nullable = true, length = 0)
    public String getBmfzr() {
        return bmfzr;
    }

    public void setBmfzr(String bmfzr) {
        this.bmfzr = bmfzr;
    }

    @Basic
    @Column(name = "BMYS", nullable = true, length = 0)
    public String getBmys() {
        return bmys;
    }

    public void setBmys(String bmys) {
        this.bmys = bmys;
    }

    @Basic
    @Column(name = "SJBM", nullable = true, length = 32)
    public String getSjbm() {
        return sjbm;
    }

    public void setSjbm(String sjbm) {
        this.sjbm = sjbm;
    }

    @Basic
    @Column(name = "SJBJ", nullable = true, length = 1)
    public String getSjbj() {
        return sjbj;
    }

    public void setSjbj(String sjbj) {
        this.sjbj = sjbj;
    }

    @Basic
    @Column(name = "SFFJD", nullable = true, length = 0)
    public String getSffjd() {
        return sffjd;
    }

    public void setSffjd(String sffjd) {
        this.sffjd = sffjd;
    }

    @Basic
    @Column(name = "PXXH", nullable = true, length = 5)
    public String getPxxh() {
        return pxxh;
    }

    public void setPxxh(String pxxh) {
        this.pxxh = pxxh;
    }

    @Basic
    @Column(name = "RTXBH", nullable = true, length = 0)
    public String getRtxbh() {
        return rtxbh;
    }

    public void setRtxbh(String rtxbh) {
        this.rtxbh = rtxbh;
    }

    @Basic
    @Column(name = "RTXPBH", nullable = true, length = 0)
    public String getRtxpbh() {
        return rtxpbh;
    }

    public void setRtxpbh(String rtxpbh) {
        this.rtxpbh = rtxpbh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzDeptEntity that = (GzDeptEntity) o;
        return Objects.equals(gid, that.gid) &&
                Objects.equals(bmbh, that.bmbh) &&
                Objects.equals(bmmc, that.bmmc) &&
                Objects.equals(bmfzr, that.bmfzr) &&
                Objects.equals(bmys, that.bmys) &&
                Objects.equals(sjbm, that.sjbm) &&
                Objects.equals(sjbj, that.sjbj) &&
                Objects.equals(sffjd, that.sffjd) &&
                Objects.equals(pxxh, that.pxxh) &&
                Objects.equals(rtxbh, that.rtxbh) &&
                Objects.equals(rtxpbh, that.rtxpbh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid, bmbh, bmmc, bmfzr, bmys, sjbm, sjbj, sffjd, pxxh, rtxbh, rtxpbh);
    }
}

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
@Table(name = "ZHXY_KCXX", schema = "SZXY", catalog = "")
public class ZhxyKcxxEntity implements Serializable {
    @Id
    private String kch;
    private String kcmc;
    private String kcywmc;
    private Long xf;
    private Long mzxs;
    private Long zxs;
    private String kcjj;
    private String jc;
    private String cksm;
    private String yxbz;
    private String bz;
    private String timestamp;
    private String kkyx;
    private String zs;
    private String kclb;
    private String yxid;
    private String sszy;

    @Basic
    @Column(name = "KCH", nullable = false, length = 50)
    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }

    @Basic
    @Column(name = "KCMC", nullable = true, length = 60)
    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }

    @Basic
    @Column(name = "KCYWMC", nullable = true, length = 180)
    public String getKcywmc() {
        return kcywmc;
    }

    public void setKcywmc(String kcywmc) {
        this.kcywmc = kcywmc;
    }

    @Basic
    @Column(name = "XF", nullable = true, precision = 1)
    public Long getXf() {
        return xf;
    }

    public void setXf(Long xf) {
        this.xf = xf;
    }

    @Basic
    @Column(name = "MZXS", nullable = true, precision = 1)
    public Long getMzxs() {
        return mzxs;
    }

    public void setMzxs(Long mzxs) {
        this.mzxs = mzxs;
    }

    @Basic
    @Column(name = "ZXS", nullable = true, precision = 0)
    public Long getZxs() {
        return zxs;
    }

    public void setZxs(Long zxs) {
        this.zxs = zxs;
    }

    @Basic
    @Column(name = "KCJJ", nullable = true, length = 200)
    public String getKcjj() {
        return kcjj;
    }

    public void setKcjj(String kcjj) {
        this.kcjj = kcjj;
    }

    @Basic
    @Column(name = "JC", nullable = true, length = 200)
    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc;
    }

    @Basic
    @Column(name = "CKSM", nullable = true, length = 200)
    public String getCksm() {
        return cksm;
    }

    public void setCksm(String cksm) {
        this.cksm = cksm;
    }

    @Basic
    @Column(name = "YXBZ", nullable = true, length = 1)
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    @Basic
    @Column(name = "BZ", nullable = true, length = 50)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "TIMESTAMP", nullable = true, length = 20)
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "KKYX", nullable = true, length = 200)
    public String getKkyx() {
        return kkyx;
    }

    public void setKkyx(String kkyx) {
        this.kkyx = kkyx;
    }

    @Basic
    @Column(name = "ZS", nullable = true, length = 10)
    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    @Basic
    @Column(name = "KCLB", nullable = true, length = 10)
    public String getKclb() {
        return kclb;
    }

    public void setKclb(String kclb) {
        this.kclb = kclb;
    }

    @Basic
    @Column(name = "YXID", nullable = true, length = 50)
    public String getYxid() {
        return yxid;
    }

    public void setYxid(String yxid) {
        this.yxid = yxid;
    }

    @Basic
    @Column(name = "SSZY", nullable = false, length = 40)
    public String getSszy() {
        return sszy;
    }

    public void setSszy(String sszy) {
        this.sszy = sszy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyKcxxEntity that = (ZhxyKcxxEntity) o;
        return Objects.equals(kch, that.kch) &&
                Objects.equals(kcmc, that.kcmc) &&
                Objects.equals(kcywmc, that.kcywmc) &&
                Objects.equals(xf, that.xf) &&
                Objects.equals(mzxs, that.mzxs) &&
                Objects.equals(zxs, that.zxs) &&
                Objects.equals(kcjj, that.kcjj) &&
                Objects.equals(jc, that.jc) &&
                Objects.equals(cksm, that.cksm) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(kkyx, that.kkyx) &&
                Objects.equals(zs, that.zs) &&
                Objects.equals(kclb, that.kclb) &&
                Objects.equals(yxid, that.yxid) &&
                Objects.equals(sszy, that.sszy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kch, kcmc, kcywmc, xf, mzxs, zxs, kcjj, jc, cksm, yxbz, bz, timestamp, kkyx, zs, kclb, yxid, sszy);
    }
}

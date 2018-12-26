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
@Table(name = "ZHXY_KCXX_PKXX", schema = "SZXY")
public class ZhxyKcxxPkxxEntity implements Serializable {
    /**
     * 序号ID
     */
    @Id
    private String xh;
    /**
     * 课程ID
     */
    private String kcId;
    /**
     * 课程名称
     */
    private String kcmc;
    /**
     * 学年
     */
    private String xn;
    /**
     * 学期ID
     */
    private String xqId;
    private Long zxs;
    private Long xf;
    private Long zzxs;
    private Long syxs;
    private Long sjxs;
    private Long qtxs;
    private String kclb;
    private String khfs;
    private Long jkksz;
    private Long jkjsz;
    private String tZjjs;
    private String tSkbj;
    private Long tRs;
    private Long tBs;
    private String pkms;
    private Long tJs;
    private Long tYcs;
    private String jxl;
    private String js;
    private String jslx;
    private String sxh;
    private String dzs;
    private String timezc;
    private String kclb1;
    private String kclb2;
    private String skbjzcjc;
    private String xm;
    private String zc;
    private String jc;
    private String zb;
    private String jsmc;
    private String xq;
    private String zq;
    private String zz;
    private String jq;
    private String jz;
    private String xqS;
    private String jsid;

    @Basic
    @Column(name = "XH", nullable = false, length = 100)
    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    @Basic
    @Column(name = "KC_ID", nullable = true, length = 100)
    public String getKcId() {
        return kcId;
    }

    public void setKcId(String kcId) {
        this.kcId = kcId;
    }

    @Basic
    @Column(name = "KCMC", nullable = true, length = 500)
    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }

    @Basic
    @Column(name = "XN", nullable = false, length = 4)
    public String getXn() {
        return xn;
    }

    public void setXn(String xn) {
        this.xn = xn;
    }

    @Basic
    @Column(name = "XQ_ID", nullable = false, length = 1)
    public String getXqId() {
        return xqId;
    }

    public void setXqId(String xqId) {
        this.xqId = xqId;
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
    @Column(name = "XF", nullable = true, precision = 1)
    public Long getXf() {
        return xf;
    }

    public void setXf(Long xf) {
        this.xf = xf;
    }

    @Basic
    @Column(name = "ZZXS", nullable = true, precision = 1)
    public Long getZzxs() {
        return zzxs;
    }

    public void setZzxs(Long zzxs) {
        this.zzxs = zzxs;
    }

    @Basic
    @Column(name = "SYXS", nullable = true, precision = 0)
    public Long getSyxs() {
        return syxs;
    }

    public void setSyxs(Long syxs) {
        this.syxs = syxs;
    }

    @Basic
    @Column(name = "SJXS", nullable = true, precision = 0)
    public Long getSjxs() {
        return sjxs;
    }

    public void setSjxs(Long sjxs) {
        this.sjxs = sjxs;
    }

    @Basic
    @Column(name = "QTXS", nullable = true, precision = 0)
    public Long getQtxs() {
        return qtxs;
    }

    public void setQtxs(Long qtxs) {
        this.qtxs = qtxs;
    }

    @Basic
    @Column(name = "KCLB", nullable = true, length = 2)
    public String getKclb() {
        return kclb;
    }

    public void setKclb(String kclb) {
        this.kclb = kclb;
    }

    @Basic
    @Column(name = "KHFS", nullable = true, length = 2)
    public String getKhfs() {
        return khfs;
    }

    public void setKhfs(String khfs) {
        this.khfs = khfs;
    }

    @Basic
    @Column(name = "JKKSZ", nullable = true, precision = 0)
    public Long getJkksz() {
        return jkksz;
    }

    public void setJkksz(Long jkksz) {
        this.jkksz = jkksz;
    }

    @Basic
    @Column(name = "JKJSZ", nullable = true, precision = 0)
    public Long getJkjsz() {
        return jkjsz;
    }

    public void setJkjsz(Long jkjsz) {
        this.jkjsz = jkjsz;
    }

    @Basic
    @Column(name = "T_ZJJS", nullable = true, length = 100)
    public String gettZjjs() {
        return tZjjs;
    }

    public void settZjjs(String tZjjs) {
        this.tZjjs = tZjjs;
    }

    @Basic
    @Column(name = "T_SKBJ", nullable = false, length = 100)
    public String gettSkbj() {
        return tSkbj;
    }

    public void settSkbj(String tSkbj) {
        this.tSkbj = tSkbj;
    }

    @Basic
    @Column(name = "T_RS", nullable = true, precision = 0)
    public Long gettRs() {
        return tRs;
    }

    public void settRs(Long tRs) {
        this.tRs = tRs;
    }

    @Basic
    @Column(name = "T_BS", nullable = true, precision = 0)
    public Long gettBs() {
        return tBs;
    }

    public void settBs(Long tBs) {
        this.tBs = tBs;
    }

    @Basic
    @Column(name = "PKMS", nullable = true, length = 1)
    public String getPkms() {
        return pkms;
    }

    public void setPkms(String pkms) {
        this.pkms = pkms;
    }

    @Basic
    @Column(name = "T_JS", nullable = true, precision = 0)
    public Long gettJs() {
        return tJs;
    }

    public void settJs(Long tJs) {
        this.tJs = tJs;
    }

    @Basic
    @Column(name = "T_YCS", nullable = true, precision = 0)
    public Long gettYcs() {
        return tYcs;
    }

    public void settYcs(Long tYcs) {
        this.tYcs = tYcs;
    }

    @Basic
    @Column(name = "JXL", nullable = true, length = 3)
    public String getJxl() {
        return jxl;
    }

    public void setJxl(String jxl) {
        this.jxl = jxl;
    }

    @Basic
    @Column(name = "JS", nullable = true, length = 50)
    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    @Basic
    @Column(name = "JSLX", nullable = true, length = 2)
    public String getJslx() {
        return jslx;
    }

    public void setJslx(String jslx) {
        this.jslx = jslx;
    }

    @Basic
    @Column(name = "SXH", nullable = true, length = 1)
    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }

    @Basic
    @Column(name = "DZS", nullable = true, length = 1)
    public String getDzs() {
        return dzs;
    }

    public void setDzs(String dzs) {
        this.dzs = dzs;
    }

    @Basic
    @Column(name = "TIMEZC", nullable = true, length = 50)
    public String getTimezc() {
        return timezc;
    }

    public void setTimezc(String timezc) {
        this.timezc = timezc;
    }

    @Basic
    @Column(name = "KCLB1", nullable = true, length = 2)
    public String getKclb1() {
        return kclb1;
    }

    public void setKclb1(String kclb1) {
        this.kclb1 = kclb1;
    }

    @Basic
    @Column(name = "KCLB2", nullable = true, length = 2)
    public String getKclb2() {
        return kclb2;
    }

    public void setKclb2(String kclb2) {
        this.kclb2 = kclb2;
    }

    @Basic
    @Column(name = "SKBJZCJC", nullable = true, length = 500)
    public String getSkbjzcjc() {
        return skbjzcjc;
    }

    public void setSkbjzcjc(String skbjzcjc) {
        this.skbjzcjc = skbjzcjc;
    }

    @Basic
    @Column(name = "XM", nullable = true, length = 50)
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "ZC", nullable = true, length = 50)
    public String getZc() {
        return zc;
    }

    public void setZc(String zc) {
        this.zc = zc;
    }

    @Basic
    @Column(name = "JC", nullable = true, length = 50)
    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc;
    }

    @Basic
    @Column(name = "ZB", nullable = true, length = 50)
    public String getZb() {
        return zb;
    }

    public void setZb(String zb) {
        this.zb = zb;
    }

    @Basic
    @Column(name = "JSMC", nullable = true, length = 1000)
    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc;
    }

    @Basic
    @Column(name = "XQ", nullable = true, length = 50)
    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq;
    }

    @Basic
    @Column(name = "ZQ", nullable = true, length = 20)
    public String getZq() {
        return zq;
    }

    public void setZq(String zq) {
        this.zq = zq;
    }

    @Basic
    @Column(name = "ZZ", nullable = true, length = 20)
    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    @Basic
    @Column(name = "JQ", nullable = true, length = 20)
    public String getJq() {
        return jq;
    }

    public void setJq(String jq) {
        this.jq = jq;
    }

    @Basic
    @Column(name = "JZ", nullable = true, length = 20)
    public String getJz() {
        return jz;
    }

    public void setJz(String jz) {
        this.jz = jz;
    }

    @Basic
    @Column(name = "XQ_S", nullable = true, length = 20)
    public String getXqS() {
        return xqS;
    }

    public void setXqS(String xqS) {
        this.xqS = xqS;
    }

    @Basic
    @Column(name = "JSID", nullable = true, length = 50)
    public String getJsid() {
        return jsid;
    }

    public void setJsid(String jsid) {
        this.jsid = jsid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyKcxxPkxxEntity that = (ZhxyKcxxPkxxEntity) o;
        return Objects.equals(xh, that.xh) &&
                Objects.equals(kcId, that.kcId) &&
                Objects.equals(kcmc, that.kcmc) &&
                Objects.equals(xn, that.xn) &&
                Objects.equals(xqId, that.xqId) &&
                Objects.equals(zxs, that.zxs) &&
                Objects.equals(xf, that.xf) &&
                Objects.equals(zzxs, that.zzxs) &&
                Objects.equals(syxs, that.syxs) &&
                Objects.equals(sjxs, that.sjxs) &&
                Objects.equals(qtxs, that.qtxs) &&
                Objects.equals(kclb, that.kclb) &&
                Objects.equals(khfs, that.khfs) &&
                Objects.equals(jkksz, that.jkksz) &&
                Objects.equals(jkjsz, that.jkjsz) &&
                Objects.equals(tZjjs, that.tZjjs) &&
                Objects.equals(tSkbj, that.tSkbj) &&
                Objects.equals(tRs, that.tRs) &&
                Objects.equals(tBs, that.tBs) &&
                Objects.equals(pkms, that.pkms) &&
                Objects.equals(tJs, that.tJs) &&
                Objects.equals(tYcs, that.tYcs) &&
                Objects.equals(jxl, that.jxl) &&
                Objects.equals(js, that.js) &&
                Objects.equals(jslx, that.jslx) &&
                Objects.equals(sxh, that.sxh) &&
                Objects.equals(dzs, that.dzs) &&
                Objects.equals(timezc, that.timezc) &&
                Objects.equals(kclb1, that.kclb1) &&
                Objects.equals(kclb2, that.kclb2) &&
                Objects.equals(skbjzcjc, that.skbjzcjc) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(zc, that.zc) &&
                Objects.equals(jc, that.jc) &&
                Objects.equals(zb, that.zb) &&
                Objects.equals(jsmc, that.jsmc) &&
                Objects.equals(xq, that.xq) &&
                Objects.equals(zq, that.zq) &&
                Objects.equals(zz, that.zz) &&
                Objects.equals(jq, that.jq) &&
                Objects.equals(jz, that.jz) &&
                Objects.equals(xqS, that.xqS) &&
                Objects.equals(jsid, that.jsid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xh,
                kcId, kcmc, xn, xqId, zxs, xf, zzxs, syxs, sjxs,
                qtxs, kclb, khfs, jkksz, jkjsz, tZjjs,
                tSkbj, tRs, tBs, pkms, tJs, tYcs, jxl, js, jslx,
                sxh, dzs, timezc, kclb1, kclb2,
                skbjzcjc, xm, zc, jc, zb, jsmc, xq, zq, zz, jq, jz, xqS, jsid);
    }
}

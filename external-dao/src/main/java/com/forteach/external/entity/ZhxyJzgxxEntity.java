package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "ZHXY_JZGXX", schema = "SZXY", catalog = "")
public class ZhxyJzgxxEntity implements Serializable {
    @Id
    private String jgh;
    private String dwh;
    private String xm;
    private String xmpy;
    private String cym;
    private String xbm;
    private String csrq;
    private String csdm;
    private String jg;
    private String mzm;
    private String gjm;
    private String sfzjlxm;
    private String sfzjh;
    private String hyzkm;
    private String gatqwm;
    private String jkzkm;
    private String zjxym;
    private String xxm;
    private String jtcsm;
    private String brcfm;
    private String whcdm;
    private String cjgzny;
    private String lxrq;
    private String qxrq;
    private String cjny;
    private String bzlbm;
    private String jzglbm;
    private String rkzkm;
    private String dabh;
    private String dawb;
    private String dqzt;
    private String yzbm;
    private String txdz;
    private String jtzz;
    private String xzz;
    private String hkszd;
    private String hkxzm;
    private String bgdh;
    private String zzdh;
    private String yddh;
    private String czhm;
    private String dzxx;
    private String zydz;
    private String tc;
    private String xqm;
    private String xklbm;
    private String yjxkm;
    private String ejxkm;
    private String yjfx;
    private String lsxy;
    private String lsyx;
    private String yxbz;
    private String zzmm;
    private byte[] zp;
    private String bz;
    private Timestamp timestamp;
    private String zc;
    private String bmmc;
    private String bgdz;
    private String id;
    private String rdtsj;
    private String ryfl;
    private String ryzt;
    private String ldzwjb;
    private String zclb;
    private String rbwh;
    private String rbrq;
    private String jrxs;
    private String qqh;
    private String wxh;
    private String xzzw;

    @Basic
    @Column(name = "JGH", nullable = false, length = 50)
    public String getJgh() {
        return jgh;
    }

    public void setJgh(String jgh) {
        this.jgh = jgh;
    }

    @Basic
    @Column(name = "DWH", nullable = true, length = 8)
    public String getDwh() {
        return dwh;
    }

    public void setDwh(String dwh) {
        this.dwh = dwh;
    }

    @Basic
    @Column(name = "XM", nullable = true, length = 30)
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "XMPY", nullable = true, length = 60)
    public String getXmpy() {
        return xmpy;
    }

    public void setXmpy(String xmpy) {
        this.xmpy = xmpy;
    }

    @Basic
    @Column(name = "CYM", nullable = true, length = 30)
    public String getCym() {
        return cym;
    }

    public void setCym(String cym) {
        this.cym = cym;
    }

    @Basic
    @Column(name = "XBM", nullable = true, length = 1)
    public String getXbm() {
        return xbm;
    }

    public void setXbm(String xbm) {
        this.xbm = xbm;
    }

    @Basic
    @Column(name = "CSRQ", nullable = true, length = 20)
    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "CSDM", nullable = true, length = 6)
    public String getCsdm() {
        return csdm;
    }

    public void setCsdm(String csdm) {
        this.csdm = csdm;
    }

    @Basic
    @Column(name = "JG", nullable = true, length = 20)
    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    @Basic
    @Column(name = "MZM", nullable = true, length = 2)
    public String getMzm() {
        return mzm;
    }

    public void setMzm(String mzm) {
        this.mzm = mzm;
    }

    @Basic
    @Column(name = "GJM", nullable = true, length = 3)
    public String getGjm() {
        return gjm;
    }

    public void setGjm(String gjm) {
        this.gjm = gjm;
    }

    @Basic
    @Column(name = "SFZJLXM", nullable = true, length = 1)
    public String getSfzjlxm() {
        return sfzjlxm;
    }

    public void setSfzjlxm(String sfzjlxm) {
        this.sfzjlxm = sfzjlxm;
    }

    @Basic
    @Column(name = "SFZJH", nullable = true, length = 20)
    public String getSfzjh() {
        return sfzjh;
    }

    public void setSfzjh(String sfzjh) {
        this.sfzjh = sfzjh;
    }

    @Basic
    @Column(name = "HYZKM", nullable = true, length = 2)
    public String getHyzkm() {
        return hyzkm;
    }

    public void setHyzkm(String hyzkm) {
        this.hyzkm = hyzkm;
    }

    @Basic
    @Column(name = "GATQWM", nullable = true, length = 2)
    public String getGatqwm() {
        return gatqwm;
    }

    public void setGatqwm(String gatqwm) {
        this.gatqwm = gatqwm;
    }

    @Basic
    @Column(name = "JKZKM", nullable = true, length = 1)
    public String getJkzkm() {
        return jkzkm;
    }

    public void setJkzkm(String jkzkm) {
        this.jkzkm = jkzkm;
    }

    @Basic
    @Column(name = "ZJXYM", nullable = true, length = 1)
    public String getZjxym() {
        return zjxym;
    }

    public void setZjxym(String zjxym) {
        this.zjxym = zjxym;
    }

    @Basic
    @Column(name = "XXM", nullable = true, length = 1)
    public String getXxm() {
        return xxm;
    }

    public void setXxm(String xxm) {
        this.xxm = xxm;
    }

    @Basic
    @Column(name = "JTCSM", nullable = true, length = 2)
    public String getJtcsm() {
        return jtcsm;
    }

    public void setJtcsm(String jtcsm) {
        this.jtcsm = jtcsm;
    }

    @Basic
    @Column(name = "BRCFM", nullable = true, length = 2)
    public String getBrcfm() {
        return brcfm;
    }

    public void setBrcfm(String brcfm) {
        this.brcfm = brcfm;
    }

    @Basic
    @Column(name = "WHCDM", nullable = true, length = 2)
    public String getWhcdm() {
        return whcdm;
    }

    public void setWhcdm(String whcdm) {
        this.whcdm = whcdm;
    }

    @Basic
    @Column(name = "CJGZNY", nullable = true, length = 60)
    public String getCjgzny() {
        return cjgzny;
    }

    public void setCjgzny(String cjgzny) {
        this.cjgzny = cjgzny;
    }

    @Basic
    @Column(name = "LXRQ", nullable = true, length = 80)
    public String getLxrq() {
        return lxrq;
    }

    public void setLxrq(String lxrq) {
        this.lxrq = lxrq;
    }

    @Basic
    @Column(name = "QXRQ", nullable = true, length = 10)
    public String getQxrq() {
        return qxrq;
    }

    public void setQxrq(String qxrq) {
        this.qxrq = qxrq;
    }

    @Basic
    @Column(name = "CJNY", nullable = true, length = 10)
    public String getCjny() {
        return cjny;
    }

    public void setCjny(String cjny) {
        this.cjny = cjny;
    }

    @Basic
    @Column(name = "BZLBM", nullable = true, length = 10)
    public String getBzlbm() {
        return bzlbm;
    }

    public void setBzlbm(String bzlbm) {
        this.bzlbm = bzlbm;
    }

    @Basic
    @Column(name = "JZGLBM", nullable = true, length = 2)
    public String getJzglbm() {
        return jzglbm;
    }

    public void setJzglbm(String jzglbm) {
        this.jzglbm = jzglbm;
    }

    @Basic
    @Column(name = "RKZKM", nullable = true, length = 2)
    public String getRkzkm() {
        return rkzkm;
    }

    public void setRkzkm(String rkzkm) {
        this.rkzkm = rkzkm;
    }

    @Basic
    @Column(name = "DABH", nullable = true, length = 10)
    public String getDabh() {
        return dabh;
    }

    public void setDabh(String dabh) {
        this.dabh = dabh;
    }

    @Basic
    @Column(name = "DAWB", nullable = true, length = 200)
    public String getDawb() {
        return dawb;
    }

    public void setDawb(String dawb) {
        this.dawb = dawb;
    }

    @Basic
    @Column(name = "DQZT", nullable = true, length = 3)
    public String getDqzt() {
        return dqzt;
    }

    public void setDqzt(String dqzt) {
        this.dqzt = dqzt;
    }

    @Basic
    @Column(name = "YZBM", nullable = true, length = 6)
    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    @Basic
    @Column(name = "TXDZ", nullable = true, length = 60)
    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    @Basic
    @Column(name = "JTZZ", nullable = true, length = 60)
    public String getJtzz() {
        return jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    @Basic
    @Column(name = "XZZ", nullable = true, length = 60)
    public String getXzz() {
        return xzz;
    }

    public void setXzz(String xzz) {
        this.xzz = xzz;
    }

    @Basic
    @Column(name = "HKSZD", nullable = true, length = 600)
    public String getHkszd() {
        return hkszd;
    }

    public void setHkszd(String hkszd) {
        this.hkszd = hkszd;
    }

    @Basic
    @Column(name = "HKXZM", nullable = true, length = 1)
    public String getHkxzm() {
        return hkxzm;
    }

    public void setHkxzm(String hkxzm) {
        this.hkxzm = hkxzm;
    }

    @Basic
    @Column(name = "BGDH", nullable = true, length = 30)
    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    @Basic
    @Column(name = "ZZDH", nullable = true, length = 30)
    public String getZzdh() {
        return zzdh;
    }

    public void setZzdh(String zzdh) {
        this.zzdh = zzdh;
    }

    @Basic
    @Column(name = "YDDH", nullable = true, length = 30)
    public String getYddh() {
        return yddh;
    }

    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    @Basic
    @Column(name = "CZHM", nullable = true, length = 30)
    public String getCzhm() {
        return czhm;
    }

    public void setCzhm(String czhm) {
        this.czhm = czhm;
    }

    @Basic
    @Column(name = "DZXX", nullable = true, length = 30)
    public String getDzxx() {
        return dzxx;
    }

    public void setDzxx(String dzxx) {
        this.dzxx = dzxx;
    }

    @Basic
    @Column(name = "ZYDZ", nullable = true, length = 60)
    public String getZydz() {
        return zydz;
    }

    public void setZydz(String zydz) {
        this.zydz = zydz;
    }

    @Basic
    @Column(name = "TC", nullable = true, length = 100)
    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    @Basic
    @Column(name = "XQM", nullable = true, length = 2)
    public String getXqm() {
        return xqm;
    }

    public void setXqm(String xqm) {
        this.xqm = xqm;
    }

    @Basic
    @Column(name = "XKLBM", nullable = true, length = 2)
    public String getXklbm() {
        return xklbm;
    }

    public void setXklbm(String xklbm) {
        this.xklbm = xklbm;
    }

    @Basic
    @Column(name = "YJXKM", nullable = true, length = 4)
    public String getYjxkm() {
        return yjxkm;
    }

    public void setYjxkm(String yjxkm) {
        this.yjxkm = yjxkm;
    }

    @Basic
    @Column(name = "EJXKM", nullable = true, length = 6)
    public String getEjxkm() {
        return ejxkm;
    }

    public void setEjxkm(String ejxkm) {
        this.ejxkm = ejxkm;
    }

    @Basic
    @Column(name = "YJFX", nullable = true, length = 60)
    public String getYjfx() {
        return yjfx;
    }

    public void setYjfx(String yjfx) {
        this.yjfx = yjfx;
    }

    @Basic
    @Column(name = "LSXY", nullable = true, length = 50)
    public String getLsxy() {
        return lsxy;
    }

    public void setLsxy(String lsxy) {
        this.lsxy = lsxy;
    }

    @Basic
    @Column(name = "LSYX", nullable = true, length = 50)
    public String getLsyx() {
        return lsyx;
    }

    public void setLsyx(String lsyx) {
        this.lsyx = lsyx;
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
    @Column(name = "ZZMM", nullable = true, length = 50)
    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    @Basic
    @Column(name = "ZP", nullable = true)
    public byte[] getZp() {
        return zp;
    }

    public void setZp(byte[] zp) {
        this.zp = zp;
    }

    @Basic
    @Column(name = "BZ", nullable = true, length = 4000)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "TIMESTAMP", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "ZC", nullable = true, length = 20)
    public String getZc() {
        return zc;
    }

    public void setZc(String zc) {
        this.zc = zc;
    }

    @Basic
    @Column(name = "BMMC", nullable = true, length = 20)
    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    @Basic
    @Column(name = "BGDZ", nullable = true, length = 20)
    public String getBgdz() {
        return bgdz;
    }

    public void setBgdz(String bgdz) {
        this.bgdz = bgdz;
    }

    @Basic
    @Column(name = "ID", nullable = true, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RDTSJ", nullable = true, length = 20)
    public String getRdtsj() {
        return rdtsj;
    }

    public void setRdtsj(String rdtsj) {
        this.rdtsj = rdtsj;
    }

    @Basic
    @Column(name = "RYFL", nullable = true, length = 20)
    public String getRyfl() {
        return ryfl;
    }

    public void setRyfl(String ryfl) {
        this.ryfl = ryfl;
    }

    @Basic
    @Column(name = "RYZT", nullable = true, length = 20)
    public String getRyzt() {
        return ryzt;
    }

    public void setRyzt(String ryzt) {
        this.ryzt = ryzt;
    }

    @Basic
    @Column(name = "LDZWJB", nullable = true, length = 20)
    public String getLdzwjb() {
        return ldzwjb;
    }

    public void setLdzwjb(String ldzwjb) {
        this.ldzwjb = ldzwjb;
    }

    @Basic
    @Column(name = "ZCLB", nullable = true, length = 50)
    public String getZclb() {
        return zclb;
    }

    public void setZclb(String zclb) {
        this.zclb = zclb;
    }

    @Basic
    @Column(name = "RBWH", nullable = true, length = 200)
    public String getRbwh() {
        return rbwh;
    }

    public void setRbwh(String rbwh) {
        this.rbwh = rbwh;
    }

    @Basic
    @Column(name = "RBRQ", nullable = true, length = 200)
    public String getRbrq() {
        return rbrq;
    }

    public void setRbrq(String rbrq) {
        this.rbrq = rbrq;
    }

    @Basic
    @Column(name = "JRXS", nullable = true, length = 200)
    public String getJrxs() {
        return jrxs;
    }

    public void setJrxs(String jrxs) {
        this.jrxs = jrxs;
    }

    @Basic
    @Column(name = "QQH", nullable = true, length = 50)
    public String getQqh() {
        return qqh;
    }

    public void setQqh(String qqh) {
        this.qqh = qqh;
    }

    @Basic
    @Column(name = "WXH", nullable = true, length = 50)
    public String getWxh() {
        return wxh;
    }

    public void setWxh(String wxh) {
        this.wxh = wxh;
    }

    @Basic
    @Column(name = "XZZW", nullable = true, length = 2)
    public String getXzzw() {
        return xzzw;
    }

    public void setXzzw(String xzzw) {
        this.xzzw = xzzw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyJzgxxEntity that = (ZhxyJzgxxEntity) o;
        return Objects.equals(jgh, that.jgh) &&
                Objects.equals(dwh, that.dwh) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(xmpy, that.xmpy) &&
                Objects.equals(cym, that.cym) &&
                Objects.equals(xbm, that.xbm) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(csdm, that.csdm) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(mzm, that.mzm) &&
                Objects.equals(gjm, that.gjm) &&
                Objects.equals(sfzjlxm, that.sfzjlxm) &&
                Objects.equals(sfzjh, that.sfzjh) &&
                Objects.equals(hyzkm, that.hyzkm) &&
                Objects.equals(gatqwm, that.gatqwm) &&
                Objects.equals(jkzkm, that.jkzkm) &&
                Objects.equals(zjxym, that.zjxym) &&
                Objects.equals(xxm, that.xxm) &&
                Objects.equals(jtcsm, that.jtcsm) &&
                Objects.equals(brcfm, that.brcfm) &&
                Objects.equals(whcdm, that.whcdm) &&
                Objects.equals(cjgzny, that.cjgzny) &&
                Objects.equals(lxrq, that.lxrq) &&
                Objects.equals(qxrq, that.qxrq) &&
                Objects.equals(cjny, that.cjny) &&
                Objects.equals(bzlbm, that.bzlbm) &&
                Objects.equals(jzglbm, that.jzglbm) &&
                Objects.equals(rkzkm, that.rkzkm) &&
                Objects.equals(dabh, that.dabh) &&
                Objects.equals(dawb, that.dawb) &&
                Objects.equals(dqzt, that.dqzt) &&
                Objects.equals(yzbm, that.yzbm) &&
                Objects.equals(txdz, that.txdz) &&
                Objects.equals(jtzz, that.jtzz) &&
                Objects.equals(xzz, that.xzz) &&
                Objects.equals(hkszd, that.hkszd) &&
                Objects.equals(hkxzm, that.hkxzm) &&
                Objects.equals(bgdh, that.bgdh) &&
                Objects.equals(zzdh, that.zzdh) &&
                Objects.equals(yddh, that.yddh) &&
                Objects.equals(czhm, that.czhm) &&
                Objects.equals(dzxx, that.dzxx) &&
                Objects.equals(zydz, that.zydz) &&
                Objects.equals(tc, that.tc) &&
                Objects.equals(xqm, that.xqm) &&
                Objects.equals(xklbm, that.xklbm) &&
                Objects.equals(yjxkm, that.yjxkm) &&
                Objects.equals(ejxkm, that.ejxkm) &&
                Objects.equals(yjfx, that.yjfx) &&
                Objects.equals(lsxy, that.lsxy) &&
                Objects.equals(lsyx, that.lsyx) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(zzmm, that.zzmm) &&
                Arrays.equals(zp, that.zp) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(zc, that.zc) &&
                Objects.equals(bmmc, that.bmmc) &&
                Objects.equals(bgdz, that.bgdz) &&
                Objects.equals(id, that.id) &&
                Objects.equals(rdtsj, that.rdtsj) &&
                Objects.equals(ryfl, that.ryfl) &&
                Objects.equals(ryzt, that.ryzt) &&
                Objects.equals(ldzwjb, that.ldzwjb) &&
                Objects.equals(zclb, that.zclb) &&
                Objects.equals(rbwh, that.rbwh) &&
                Objects.equals(rbrq, that.rbrq) &&
                Objects.equals(jrxs, that.jrxs) &&
                Objects.equals(qqh, that.qqh) &&
                Objects.equals(wxh, that.wxh) &&
                Objects.equals(xzzw, that.xzzw);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(jgh, dwh, xm, xmpy, cym, xbm, csrq, csdm, jg, mzm, gjm, sfzjlxm, sfzjh, hyzkm, gatqwm, jkzkm, zjxym, xxm, jtcsm, brcfm, whcdm, cjgzny, lxrq, qxrq, cjny, bzlbm, jzglbm, rkzkm, dabh, dawb, dqzt, yzbm, txdz, jtzz, xzz, hkszd, hkxzm, bgdh, zzdh, yddh, czhm, dzxx, zydz, tc, xqm, xklbm, yjxkm, ejxkm, yjfx, lsxy, lsyx, yxbz, zzmm, bz, timestamp, zc, bmmc, bgdz, id, rdtsj, ryfl, ryzt, ldzwjb, zclb, rbwh, rbrq, jrxs, qqh, wxh, xzzw);
        result = 31 * result + Arrays.hashCode(zp);
        return result;
    }
}

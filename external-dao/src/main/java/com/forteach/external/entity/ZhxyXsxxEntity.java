package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "ZHXY_XSXX", schema = "SZXY", catalog = "")
public class ZhxyXsxxEntity implements Serializable {
    private Date csrq;
    private byte[] zp;
    private Timestamp timestamp;
    private String isgraduate;
    private String xjzt;
    private String lqzy;
    private String gkksh;
    private String nj;
    @Id
    private String xsid;
    private String xsxm;
    private String lsxy;
    private String lsyx;
    private String lsbj;
    private String xmpy;
    private String lxrq;
    private String cym;
    private String xb;
    private String csdm;
    private String jg;
    private String gjm;
    private String sfzjlxm;
    private String sfzjh;
    private String hyztm;
    private String zzmm;
    private String xx;
    private String txdz;
    private String jtzz;
    private String xzz;
    private String hkszd;
    private String hkxzm;
    private String yddh;
    private String jtdh;
    private String dzxx;
    private String yxbz;
    private String bz;
    private String mzm;
    private String zpKtl;
    private String xz;

    @Basic
    @Column(name = "CSRQ", nullable = true)
    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
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
    @Column(name = "TIMESTAMP", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "ISGRADUATE", nullable = true, length = 1)
    public String getIsgraduate() {
        return isgraduate;
    }

    public void setIsgraduate(String isgraduate) {
        this.isgraduate = isgraduate;
    }

    @Basic
    @Column(name = "XJZT", nullable = true, length = 50)
    public String getXjzt() {
        return xjzt;
    }

    public void setXjzt(String xjzt) {
        this.xjzt = xjzt;
    }

    @Basic
    @Column(name = "LQZY", nullable = true, length = 500)
    public String getLqzy() {
        return lqzy;
    }

    public void setLqzy(String lqzy) {
        this.lqzy = lqzy;
    }

    @Basic
    @Column(name = "GKKSH", nullable = true, length = 500)
    public String getGkksh() {
        return gkksh;
    }

    public void setGkksh(String gkksh) {
        this.gkksh = gkksh;
    }

    @Basic
    @Column(name = "NJ", nullable = true, length = 50)
    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    @Basic
    @Column(name = "XSID", nullable = true, length = 40)
    public String getXsid() {
        return xsid;
    }

    public void setXsid(String xsid) {
        this.xsid = xsid;
    }

    @Basic
    @Column(name = "XSXM", nullable = true, length = 60)
    public String getXsxm() {
        return xsxm;
    }

    public void setXsxm(String xsxm) {
        this.xsxm = xsxm;
    }

    @Basic
    @Column(name = "LSXY", nullable = true, length = 20)
    public String getLsxy() {
        return lsxy;
    }

    public void setLsxy(String lsxy) {
        this.lsxy = lsxy;
    }

    @Basic
    @Column(name = "LSYX", nullable = true, length = 20)
    public String getLsyx() {
        return lsyx;
    }

    public void setLsyx(String lsyx) {
        this.lsyx = lsyx;
    }

    @Basic
    @Column(name = "LSBJ", nullable = true, length = 300)
    public String getLsbj() {
        return lsbj;
    }

    public void setLsbj(String lsbj) {
        this.lsbj = lsbj;
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
    @Column(name = "LXRQ", nullable = true, length = 30)
    public String getLxrq() {
        return lxrq;
    }

    public void setLxrq(String lxrq) {
        this.lxrq = lxrq;
    }

    @Basic
    @Column(name = "CYM", nullable = true, length = 60)
    public String getCym() {
        return cym;
    }

    public void setCym(String cym) {
        this.cym = cym;
    }

    @Basic
    @Column(name = "XB", nullable = true, length = 1)
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "CSDM", nullable = true, length = 2000)
    public String getCsdm() {
        return csdm;
    }

    public void setCsdm(String csdm) {
        this.csdm = csdm;
    }

    @Basic
    @Column(name = "JG", nullable = true, length = 6)
    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    @Basic
    @Column(name = "GJM", nullable = true, length = 10)
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
    @Column(name = "SFZJH", nullable = true, length = 60)
    public String getSfzjh() {
        return sfzjh;
    }

    public void setSfzjh(String sfzjh) {
        this.sfzjh = sfzjh;
    }

    @Basic
    @Column(name = "HYZTM", nullable = true, length = 2)
    public String getHyztm() {
        return hyztm;
    }

    public void setHyztm(String hyztm) {
        this.hyztm = hyztm;
    }

    @Basic
    @Column(name = "ZZMM", nullable = true, length = 2)
    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    @Basic
    @Column(name = "XX", nullable = true, length = 2000)
    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    @Basic
    @Column(name = "TXDZ", nullable = true, length = 2000)
    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    @Basic
    @Column(name = "JTZZ", nullable = true, length = 300)
    public String getJtzz() {
        return jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    @Basic
    @Column(name = "XZZ", nullable = true, length = 2000)
    public String getXzz() {
        return xzz;
    }

    public void setXzz(String xzz) {
        this.xzz = xzz;
    }

    @Basic
    @Column(name = "HKSZD", nullable = true, length = 300)
    public String getHkszd() {
        return hkszd;
    }

    public void setHkszd(String hkszd) {
        this.hkszd = hkszd;
    }

    @Basic
    @Column(name = "HKXZM", nullable = true, length = 2000)
    public String getHkxzm() {
        return hkxzm;
    }

    public void setHkxzm(String hkxzm) {
        this.hkxzm = hkxzm;
    }

    @Basic
    @Column(name = "YDDH", nullable = true, length = 300)
    public String getYddh() {
        return yddh;
    }

    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    @Basic
    @Column(name = "JTDH", nullable = true, length = 100)
    public String getJtdh() {
        return jtdh;
    }

    public void setJtdh(String jtdh) {
        this.jtdh = jtdh;
    }

    @Basic
    @Column(name = "DZXX", nullable = true, length = 100)
    public String getDzxx() {
        return dzxx;
    }

    public void setDzxx(String dzxx) {
        this.dzxx = dzxx;
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
    @Column(name = "BZ", nullable = true)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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
    @Column(name = "ZP_KTL", nullable = true, length = 2000)
    public String getZpKtl() {
        return zpKtl;
    }

    public void setZpKtl(String zpKtl) {
        this.zpKtl = zpKtl;
    }

    @Basic
    @Column(name = "XZ", nullable = true, length = 10)
    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyXsxxEntity that = (ZhxyXsxxEntity) o;
        return Objects.equals(csrq, that.csrq) &&
                Arrays.equals(zp, that.zp) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(isgraduate, that.isgraduate) &&
                Objects.equals(xjzt, that.xjzt) &&
                Objects.equals(lqzy, that.lqzy) &&
                Objects.equals(gkksh, that.gkksh) &&
                Objects.equals(nj, that.nj) &&
                Objects.equals(xsid, that.xsid) &&
                Objects.equals(xsxm, that.xsxm) &&
                Objects.equals(lsxy, that.lsxy) &&
                Objects.equals(lsyx, that.lsyx) &&
                Objects.equals(lsbj, that.lsbj) &&
                Objects.equals(xmpy, that.xmpy) &&
                Objects.equals(lxrq, that.lxrq) &&
                Objects.equals(cym, that.cym) &&
                Objects.equals(xb, that.xb) &&
                Objects.equals(csdm, that.csdm) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(gjm, that.gjm) &&
                Objects.equals(sfzjlxm, that.sfzjlxm) &&
                Objects.equals(sfzjh, that.sfzjh) &&
                Objects.equals(hyztm, that.hyztm) &&
                Objects.equals(zzmm, that.zzmm) &&
                Objects.equals(xx, that.xx) &&
                Objects.equals(txdz, that.txdz) &&
                Objects.equals(jtzz, that.jtzz) &&
                Objects.equals(xzz, that.xzz) &&
                Objects.equals(hkszd, that.hkszd) &&
                Objects.equals(hkxzm, that.hkxzm) &&
                Objects.equals(yddh, that.yddh) &&
                Objects.equals(jtdh, that.jtdh) &&
                Objects.equals(dzxx, that.dzxx) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(mzm, that.mzm) &&
                Objects.equals(zpKtl, that.zpKtl) &&
                Objects.equals(xz, that.xz);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(csrq, timestamp, isgraduate, xjzt, lqzy, gkksh, nj, xsid, xsxm, lsxy, lsyx, lsbj, xmpy, lxrq, cym, xb, csdm, jg, gjm, sfzjlxm, sfzjh, hyztm, zzmm, xx, txdz, jtzz, xzz, hkszd, hkxzm, yddh, jtdh, dzxx, yxbz, bz, mzm, zpKtl, xz);
        result = 31 * result + Arrays.hashCode(zp);
        return result;
    }
}

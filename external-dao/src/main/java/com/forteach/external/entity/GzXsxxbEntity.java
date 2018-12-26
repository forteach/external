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
@Table(name = "GZ_XSXXB", schema = "SZXY", catalog = "")
public class GzXsxxbEntity implements Serializable {
    @Id
    private String xh;
    private String xsxm;
    private String xxzy;
    private String ssbj;
    private String cym;
    private String sfzh;
    private String csrq;
    private String xb;
    private String jg;
    private String syd;
    private String hkszd;
    private String mz;
    private String xyzj;
    private String zzmm;
    private String lxdh;
    private String dzyx;
    private String jtzz;
    private String yzbm;
    private String lxr;
    private String xszp;
    private String rxfs;
    private String xszt;
    private String bz;
    private Long ssnj;
    private String sfdz;
    private String sfzz;
    private String sfgf;
    private String sfzd;
    private String xn;
    private String rxnj;
    private String bmsj;
    private String sfwd;
    private String sfjf;
    private String byxx;
    private String zspc;
    private String bmzy;
    private String bmbx;
    private String tzsbh;

    @Basic
    @Column(name = "XH", nullable = false, length = 20)
    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
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
    @Column(name = "XXZY", nullable = true, length = 40)
    public String getXxzy() {
        return xxzy;
    }

    public void setXxzy(String xxzy) {
        this.xxzy = xxzy;
    }

    @Basic
    @Column(name = "SSBJ", nullable = false, length = 300)
    public String getSsbj() {
        return ssbj;
    }

    public void setSsbj(String ssbj) {
        this.ssbj = ssbj;
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
    @Column(name = "SFZH", nullable = true, length = 60)
    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    @Basic
    @Column(name = "CSRQ", nullable = true, length = 30)
    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "XB", nullable = true, length = 100)
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "JG", nullable = true, length = 500)
    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    @Basic
    @Column(name = "SYD", nullable = true, length = 0)
    public String getSyd() {
        return syd;
    }

    public void setSyd(String syd) {
        this.syd = syd;
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
    @Column(name = "MZ", nullable = true, length = 30)
    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    @Basic
    @Column(name = "XYZJ", nullable = true, length = 1)
    public String getXyzj() {
        return xyzj;
    }

    public void setXyzj(String xyzj) {
        this.xyzj = xyzj;
    }

    @Basic
    @Column(name = "ZZMM", nullable = true, length = 60)
    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    @Basic
    @Column(name = "LXDH", nullable = true, length = 300)
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "DZYX", nullable = true, length = 100)
    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
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
    @Column(name = "YZBM", nullable = true, length = 6)
    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    @Basic
    @Column(name = "LXR", nullable = true, length = 60)
    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    @Basic
    @Column(name = "XSZP", nullable = true, length = 100)
    public String getXszp() {
        return xszp;
    }

    public void setXszp(String xszp) {
        this.xszp = xszp;
    }

    @Basic
    @Column(name = "RXFS", nullable = true, length = 10)
    public String getRxfs() {
        return rxfs;
    }

    public void setRxfs(String rxfs) {
        this.rxfs = rxfs;
    }

    @Basic
    @Column(name = "XSZT", nullable = true, length = 0)
    public String getXszt() {
        return xszt;
    }

    public void setXszt(String xszt) {
        this.xszt = xszt;
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
    @Column(name = "SSNJ", nullable = true, precision = 0)
    public Long getSsnj() {
        return ssnj;
    }

    public void setSsnj(Long ssnj) {
        this.ssnj = ssnj;
    }

    @Basic
    @Column(name = "SFDZ", nullable = true, length = 0)
    public String getSfdz() {
        return sfdz;
    }

    public void setSfdz(String sfdz) {
        this.sfdz = sfdz;
    }

    @Basic
    @Column(name = "SFZZ", nullable = true, length = 0)
    public String getSfzz() {
        return sfzz;
    }

    public void setSfzz(String sfzz) {
        this.sfzz = sfzz;
    }

    @Basic
    @Column(name = "SFGF", nullable = true, length = 0)
    public String getSfgf() {
        return sfgf;
    }

    public void setSfgf(String sfgf) {
        this.sfgf = sfgf;
    }

    @Basic
    @Column(name = "SFZD", nullable = true, length = 2)
    public String getSfzd() {
        return sfzd;
    }

    public void setSfzd(String sfzd) {
        this.sfzd = sfzd;
    }

    @Basic
    @Column(name = "XN", nullable = true, length = 0)
    public String getXn() {
        return xn;
    }

    public void setXn(String xn) {
        this.xn = xn;
    }

    @Basic
    @Column(name = "RXNJ", nullable = true, length = 40)
    public String getRxnj() {
        return rxnj;
    }

    public void setRxnj(String rxnj) {
        this.rxnj = rxnj;
    }

    @Basic
    @Column(name = "BMSJ", nullable = true, length = 0)
    public String getBmsj() {
        return bmsj;
    }

    public void setBmsj(String bmsj) {
        this.bmsj = bmsj;
    }

    @Basic
    @Column(name = "SFWD", nullable = true, length = 1)
    public String getSfwd() {
        return sfwd;
    }

    public void setSfwd(String sfwd) {
        this.sfwd = sfwd;
    }

    @Basic
    @Column(name = "SFJF", nullable = true, length = 0)
    public String getSfjf() {
        return sfjf;
    }

    public void setSfjf(String sfjf) {
        this.sfjf = sfjf;
    }

    @Basic
    @Column(name = "BYXX", nullable = true, length = 30)
    public String getByxx() {
        return byxx;
    }

    public void setByxx(String byxx) {
        this.byxx = byxx;
    }

    @Basic
    @Column(name = "ZSPC", nullable = true, length = 20)
    public String getZspc() {
        return zspc;
    }

    public void setZspc(String zspc) {
        this.zspc = zspc;
    }

    @Basic
    @Column(name = "BMZY", nullable = true, length = 0)
    public String getBmzy() {
        return bmzy;
    }

    public void setBmzy(String bmzy) {
        this.bmzy = bmzy;
    }

    @Basic
    @Column(name = "BMBX", nullable = true, length = 0)
    public String getBmbx() {
        return bmbx;
    }

    public void setBmbx(String bmbx) {
        this.bmbx = bmbx;
    }

    @Basic
    @Column(name = "TZSBH", nullable = true, length = 0)
    public String getTzsbh() {
        return tzsbh;
    }

    public void setTzsbh(String tzsbh) {
        this.tzsbh = tzsbh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzXsxxbEntity that = (GzXsxxbEntity) o;
        return Objects.equals(xh, that.xh) &&
                Objects.equals(xsxm, that.xsxm) &&
                Objects.equals(xxzy, that.xxzy) &&
                Objects.equals(ssbj, that.ssbj) &&
                Objects.equals(cym, that.cym) &&
                Objects.equals(sfzh, that.sfzh) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(xb, that.xb) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(syd, that.syd) &&
                Objects.equals(hkszd, that.hkszd) &&
                Objects.equals(mz, that.mz) &&
                Objects.equals(xyzj, that.xyzj) &&
                Objects.equals(zzmm, that.zzmm) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(dzyx, that.dzyx) &&
                Objects.equals(jtzz, that.jtzz) &&
                Objects.equals(yzbm, that.yzbm) &&
                Objects.equals(lxr, that.lxr) &&
                Objects.equals(xszp, that.xszp) &&
                Objects.equals(rxfs, that.rxfs) &&
                Objects.equals(xszt, that.xszt) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(ssnj, that.ssnj) &&
                Objects.equals(sfdz, that.sfdz) &&
                Objects.equals(sfzz, that.sfzz) &&
                Objects.equals(sfgf, that.sfgf) &&
                Objects.equals(sfzd, that.sfzd) &&
                Objects.equals(xn, that.xn) &&
                Objects.equals(rxnj, that.rxnj) &&
                Objects.equals(bmsj, that.bmsj) &&
                Objects.equals(sfwd, that.sfwd) &&
                Objects.equals(sfjf, that.sfjf) &&
                Objects.equals(byxx, that.byxx) &&
                Objects.equals(zspc, that.zspc) &&
                Objects.equals(bmzy, that.bmzy) &&
                Objects.equals(bmbx, that.bmbx) &&
                Objects.equals(tzsbh, that.tzsbh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xh, xsxm, xxzy, ssbj, cym, sfzh, csrq, xb, jg, syd, hkszd, mz, xyzj, zzmm, lxdh, dzyx, jtzz, yzbm, lxr, xszp, rxfs, xszt, bz, ssnj, sfdz, sfzz, sfgf, sfzd, xn, rxnj, bmsj, sfwd, sfjf, byxx, zspc, bmzy, bmbx, tzsbh);
    }
}

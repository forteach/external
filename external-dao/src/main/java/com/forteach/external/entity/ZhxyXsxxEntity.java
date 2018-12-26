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
 * @Description: 学生信息表
 */
@Entity
@Table(name = "ZHXY_XSXX", schema = "SZXY", catalog = "")
public class ZhxyXsxxEntity implements Serializable {
    /**
     * 出生日期
     */
    private Date csrq;
    /**
     * 照片
     */
    private byte[] zp;
    /**
     * 修改时间
     */
    private Timestamp timestamp;
    /**
     * 是否毕业
     */
    private String isgraduate;
    /**
     * 学籍状态
     */
    private String xjzt;
    /**
     * 录取专业
     */
    private String lqzy;
    /**
     * 高考考试号
     */
    private String gkksh;
    /**
     * 年级
     */
    private String nj;
    /**
     * 学生编号　学号
     */
    @Id
    private String xsid;
    /**
     * 学生姓名
     */
    private String xsxm;
    /**
     * 隶属学院　
     * 教研室代码
     */
    private String lsxy;
    /**
     * 隶属院系
     * 专业代码
     */
    private String lsyx;
    /**
     * 隶属班级
     * 班级代码
     */
    private String lsbj;
    /**
     * 姓名拼音
     */
    private String xmpy;
    /**
     * 来校日期
     */
    private String lxrq;
    /**
     * 曾用名
     */
    private String cym;
    /**
     * 性别
     * F 女 M 男
     */
    private String xb;
    /**
     * 出生地码
     */
    private String csdm;
    /**
     * 籍贯
     */
    private String jg;
    /**
     * 国籍码
     */
    private String gjm;
    /**
     * 身份证件类型
     */
    private String sfzjlxm;
    /**
     * 身份证件号
     */
    private String sfzjh;
    /**
     * 婚姻状态码
     */
    private String hyztm;
    /**
     * 政治面貌
     */
    private String zzmm;
    /**
     * 血型
     */
    private String xx;
    /**
     * 通信地址
     */
    private String txdz;
    /**
     * 家庭地址
     */
    private String jtzz;
    /**
     * 现住址
     */
    private String xzz;
    /**
     * 户口所在地
     */
    private String hkszd;
    /**
     * 户口性质码
     */
    private String hkxzm;
    /**
     * 移动电话
     */
    private String yddh;
    /**
     * 家庭电话
     */
    private String jtdh;
    /**
     * 电子信箱
     */
    private String dzxx;
    /**
     * 有效标志
     * 有效 Y
     * 无效 N
     */
    private String yxbz;
    /**
     * 备注
     */
    private String bz;
    /**
     * 民族码
     */
    private String mzm;
    /**
     * 
     */
    private String zpKtl;
    /**
     * 学制
     */
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

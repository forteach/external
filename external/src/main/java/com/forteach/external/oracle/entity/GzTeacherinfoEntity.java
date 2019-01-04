package com.forteach.external.oracle.entity;

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
@Table(name = "GZ_TEACHERINFO", schema = "SZXY", catalog = "")
public class GzTeacherinfoEntity implements Serializable {
    /**
     * 编号
     */
    @Id
    private String id;
    /**
     * 工号
     */
    private String gh;
    /**
     * 姓名
     */
    private String xm;
    /**
     * 研究方向
     */
    private String yjfx;
    /**
     * 身份证件号
     */
    private String sfzjh;
    /**
     * 职称
     */
    private String zc;
    /**
     * 国籍地区
     */
    private String gjdqm;
    /**
     * 所在部门id
     */
    private String organizationId;
    /**
     * 来校日期
     */
    private String lxrq;
    /**
     * 编制类别
     */
    private String bzlbm;
    /**
     * 港澳台侨外（代码）
     */
    private String gatqwm;
    /**
     * 性别（代码）
     */
    private String xbm;
    /**
     * 政治面貌代码
     */
    private String zzmmm;
    /**
     * 出生地
     */
    private String csdm;
    /**
     * 籍贯
     */
    private String jg;
    /**
     * 出生日期
     */
    private String csrq;
    /**
     * 民族(代码）
     */
    private String mzm;
    /**
     * 最高学历（代码）
     */
    private String zgxlm;
    /**
     * 文化程度
     */
    private String whcdm;
    /**
     * 婚姻状况（代码）
     */
    private String hyzkm;
    /**
     * 联系电话
     */
    private String lxdh;
    /**
     * 家庭地址
     */
    private String homeaddress;
    /**
     * 行政职务
     */
    private String job;
    /**
     * 是否班主任
     * 0 否
     * 1 是
     */
    private String classleader;
    /**
     * 电子邮箱
     */
    private String email;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GH", nullable = false, length = 20)
    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
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
    @Column(name = "YJFX", nullable = true, length = 60)
    public String getYjfx() {
        return yjfx;
    }

    public void setYjfx(String yjfx) {
        this.yjfx = yjfx;
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
    @Column(name = "ZC", nullable = true, length = 20)
    public String getZc() {
        return zc;
    }

    public void setZc(String zc) {
        this.zc = zc;
    }

    @Basic
    @Column(name = "GJDQM", nullable = true, length = 3)
    public String getGjdqm() {
        return gjdqm;
    }

    public void setGjdqm(String gjdqm) {
        this.gjdqm = gjdqm;
    }

    @Basic
    @Column(name = "ORGANIZATION_ID", nullable = true, length = 50)
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
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
    @Column(name = "BZLBM", nullable = true, length = 10)
    public String getBzlbm() {
        return bzlbm;
    }

    public void setBzlbm(String bzlbm) {
        this.bzlbm = bzlbm;
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
    @Column(name = "XBM", nullable = true, length = 1)
    public String getXbm() {
        return xbm;
    }

    public void setXbm(String xbm) {
        this.xbm = xbm;
    }

    @Basic
    @Column(name = "ZZMMM", nullable = true, length = 50)
    public String getZzmmm() {
        return zzmmm;
    }

    public void setZzmmm(String zzmmm) {
        this.zzmmm = zzmmm;
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
    @Column(name = "CSRQ", nullable = true, length = 20)
    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
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
    @Column(name = "ZGXLM", nullable = true, length = 0)
    public String getZgxlm() {
        return zgxlm;
    }

    public void setZgxlm(String zgxlm) {
        this.zgxlm = zgxlm;
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
    @Column(name = "HYZKM", nullable = true, length = 2)
    public String getHyzkm() {
        return hyzkm;
    }

    public void setHyzkm(String hyzkm) {
        this.hyzkm = hyzkm;
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
    @Column(name = "HOMEADDRESS", nullable = true, length = 60)
    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    @Basic
    @Column(name = "JOB", nullable = true, length = 0)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "CLASSLEADER", nullable = true, length = 0)
    public String getClassleader() {
        return classleader;
    }

    public void setClassleader(String classleader) {
        this.classleader = classleader;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzTeacherinfoEntity that = (GzTeacherinfoEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(gh, that.gh) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(yjfx, that.yjfx) &&
                Objects.equals(sfzjh, that.sfzjh) &&
                Objects.equals(zc, that.zc) &&
                Objects.equals(gjdqm, that.gjdqm) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(lxrq, that.lxrq) &&
                Objects.equals(bzlbm, that.bzlbm) &&
                Objects.equals(gatqwm, that.gatqwm) &&
                Objects.equals(xbm, that.xbm) &&
                Objects.equals(zzmmm, that.zzmmm) &&
                Objects.equals(csdm, that.csdm) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(mzm, that.mzm) &&
                Objects.equals(zgxlm, that.zgxlm) &&
                Objects.equals(whcdm, that.whcdm) &&
                Objects.equals(hyzkm, that.hyzkm) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(homeaddress, that.homeaddress) &&
                Objects.equals(job, that.job) &&
                Objects.equals(classleader, that.classleader) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gh, xm, yjfx, sfzjh, zc, gjdqm, organizationId, lxrq, bzlbm, gatqwm, xbm, zzmmm, csdm, jg, csrq, mzm, zgxlm, whcdm, hyzkm, lxdh, homeaddress, job, classleader, email);
    }
}

package com.forteach.external.entity;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
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
@Table(name = "T_S_USER", schema = "SZXY")
@ToString
public class TSUserEntity implements Serializable {

    @Id
    private String id;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 移动电话
     */
    private String mobilephone;
    /**
     * 办公电话
     */
    private String officephone;
    /**
     * 签名文件
     */
    private String signaturefile;
    /**
     * 修改人姓名
     */
    private String updateName;
    /**
     * 修改日期
     */
    private Date updateDate;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 创建人姓名
     */
    private String createName;
    /**
     * 修改日期
     */
    private Date createDate;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 肖像
     */
    private String portrait;
    /**
     *
     */
    private String imsign;
    /**
     * 开发标记
     */
    private String devFlag;
    /**
     * 办公地点
     */
    private String officeAdd;
    /**
     * 姓名
     */
    private String xm;
    /**
     * 性别
     * 1 男
     * 2 女
     */
    private String xbdm;
    /**
     * 出生年月
     */
    private String csrq;
    /**
     * 现职称
     */
    private String xzc;
    /**
     * 取得时间
     */
    private String xzcqdsj;
    /**
     * 第一学历
     */
    private String firstEdu;
    /**
     * 第一学历毕业时间
     */
    private String firstDate;
    /**
     * 第一学位
     */
    private String firstDegree;
    /**
     * 最高学历
     */
    private String highestEdu;
    /**
     * 最高学历毕业时间
     */
    private String highestDate;
    /**
     * 最高学位
     */
    private String highestDegree;
    /**
     * 参加工作时间
     */
    private String workingHours;
    /**
     * 教师资格证
     */
    private String jszgz;
    /**
     * 职称外语等级
     */
    private String zcwydj;
    /**
     * 外语等级取得时间
     */
    private String wydjqdsj;
    /**
     * 外语类型
     */
    private String wylx;
    /**
     * 第一学历毕业院校
     */
    private String firstColleges;
    /**
     * 最高学历毕业院校
     */
    private String highestColleges;

    @Basic
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "MOBILEPHONE", nullable = true, length = 30)
    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    @Basic
    @Column(name = "OFFICEPHONE", nullable = true, length = 20)
    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    @Basic
    @Column(name = "SIGNATUREFILE", nullable = true, length = 100)
    public String getSignaturefile() {
        return signaturefile;
    }

    public void setSignaturefile(String signaturefile) {
        this.signaturefile = signaturefile;
    }

    @Basic
    @Column(name = "UPDATE_NAME", nullable = true, length = 32)
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Basic
    @Column(name = "UPDATE_DATE", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "UPDATE_BY", nullable = true, length = 32)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "CREATE_NAME", nullable = true, length = 32)
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "CREATE_BY", nullable = true, length = 32)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "PORTRAIT", nullable = true, length = 100)
    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @Basic
    @Column(name = "IMSIGN", nullable = true, length = 255)
    public String getImsign() {
        return imsign;
    }

    public void setImsign(String imsign) {
        this.imsign = imsign;
    }

    @Basic
    @Column(name = "DEV_FLAG", nullable = false, length = 2)
    public String getDevFlag() {
        return devFlag;
    }

    public void setDevFlag(String devFlag) {
        this.devFlag = devFlag;
    }

    @Basic
    @Column(name = "OFFICE_ADD", nullable = true, length = 50)
    public String getOfficeAdd() {
        return officeAdd;
    }

    public void setOfficeAdd(String officeAdd) {
        this.officeAdd = officeAdd;
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
    @Column(name = "XBDM", nullable = true, length = 1)
    public String getXbdm() {
        return xbdm;
    }

    public void setXbdm(String xbdm) {
        this.xbdm = xbdm;
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
    @Column(name = "XZC", nullable = true, length = 200)
    public String getXzc() {
        return xzc;
    }

    public void setXzc(String xzc) {
        this.xzc = xzc;
    }

    @Basic
    @Column(name = "XZCQDSJ", nullable = true, length = 30)
    public String getXzcqdsj() {
        return xzcqdsj;
    }

    public void setXzcqdsj(String xzcqdsj) {
        this.xzcqdsj = xzcqdsj;
    }

    @Basic
    @Column(name = "FIRST_EDU", nullable = true, length = 200)
    public String getFirstEdu() {
        return firstEdu;
    }

    public void setFirstEdu(String firstEdu) {
        this.firstEdu = firstEdu;
    }

    @Basic
    @Column(name = "FIRST_DATE", nullable = true, length = 30)
    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    @Basic
    @Column(name = "FIRST_DEGREE", nullable = true, length = 200)
    public String getFirstDegree() {
        return firstDegree;
    }

    public void setFirstDegree(String firstDegree) {
        this.firstDegree = firstDegree;
    }

    @Basic
    @Column(name = "HIGHEST_EDU", nullable = true, length = 200)
    public String getHighestEdu() {
        return highestEdu;
    }

    public void setHighestEdu(String highestEdu) {
        this.highestEdu = highestEdu;
    }

    @Basic
    @Column(name = "HIGHEST_DATE", nullable = true, length = 30)
    public String getHighestDate() {
        return highestDate;
    }

    public void setHighestDate(String highestDate) {
        this.highestDate = highestDate;
    }

    @Basic
    @Column(name = "HIGHEST_DEGREE", nullable = true, length = 200)
    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    @Basic
    @Column(name = "WORKING_HOURS", nullable = true, length = 30)
    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @Basic
    @Column(name = "JSZGZ", nullable = true, length = 200)
    public String getJszgz() {
        return jszgz;
    }

    public void setJszgz(String jszgz) {
        this.jszgz = jszgz;
    }

    @Basic
    @Column(name = "ZCWYDJ", nullable = true, length = 50)
    public String getZcwydj() {
        return zcwydj;
    }

    public void setZcwydj(String zcwydj) {
        this.zcwydj = zcwydj;
    }

    @Basic
    @Column(name = "WYDJQDSJ", nullable = true, length = 30)
    public String getWydjqdsj() {
        return wydjqdsj;
    }

    public void setWydjqdsj(String wydjqdsj) {
        this.wydjqdsj = wydjqdsj;
    }

    @Basic
    @Column(name = "WYLX", nullable = true, length = 2)
    public String getWylx() {
        return wylx;
    }

    public void setWylx(String wylx) {
        this.wylx = wylx;
    }

    @Basic
    @Column(name = "FIRST_COLLEGES", nullable = true, length = 200)
    public String getFirstColleges() {
        return firstColleges;
    }

    public void setFirstColleges(String firstColleges) {
        this.firstColleges = firstColleges;
    }

    @Basic
    @Column(name = "HIGHEST_COLLEGES", nullable = true, length = 200)
    public String getHighestColleges() {
        return highestColleges;
    }

    public void setHighestColleges(String highestColleges) {
        this.highestColleges = highestColleges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSUserEntity that = (TSUserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobilephone, that.mobilephone) &&
                Objects.equals(officephone, that.officephone) &&
                Objects.equals(signaturefile, that.signaturefile) &&
                Objects.equals(updateName, that.updateName) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(createName, that.createName) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(portrait, that.portrait) &&
                Objects.equals(imsign, that.imsign) &&
                Objects.equals(devFlag, that.devFlag) &&
                Objects.equals(officeAdd, that.officeAdd) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(xbdm, that.xbdm) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(xzc, that.xzc) &&
                Objects.equals(xzcqdsj, that.xzcqdsj) &&
                Objects.equals(firstEdu, that.firstEdu) &&
                Objects.equals(firstDate, that.firstDate) &&
                Objects.equals(firstDegree, that.firstDegree) &&
                Objects.equals(highestEdu, that.highestEdu) &&
                Objects.equals(highestDate, that.highestDate) &&
                Objects.equals(highestDegree, that.highestDegree) &&
                Objects.equals(workingHours, that.workingHours) &&
                Objects.equals(jszgz, that.jszgz) &&
                Objects.equals(zcwydj, that.zcwydj) &&
                Objects.equals(wydjqdsj, that.wydjqdsj) &&
                Objects.equals(wylx, that.wylx) &&
                Objects.equals(firstColleges, that.firstColleges) &&
                Objects.equals(highestColleges, that.highestColleges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, mobilephone, officephone, signaturefile, updateName, updateDate, updateBy, createName, createDate, createBy, portrait, imsign, devFlag, officeAdd, xm, xbdm, csrq, xzc, xzcqdsj, firstEdu, firstDate, firstDegree, highestEdu, highestDate, highestDegree, workingHours, jszgz, zcwydj, wydjqdsj, wylx, firstColleges, highestColleges);
    }

    public TSUserEntity(String id, String email, String mobilephone, String officephone, String signaturefile, String updateName, Date updateDate, String updateBy, String createName, Date createDate, String createBy, String portrait, String imsign, String devFlag, String officeAdd, String xm, String xbdm, String csrq, String xzc, String xzcqdsj, String firstEdu, String firstDate, String firstDegree, String highestEdu, String highestDate, String highestDegree, String workingHours, String jszgz, String zcwydj, String wydjqdsj, String wylx, String firstColleges, String highestColleges) {
        this.id = id;
        this.email = email;
        this.mobilephone = mobilephone;
        this.officephone = officephone;
        this.signaturefile = signaturefile;
        this.updateName = updateName;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.createName = createName;
        this.createDate = createDate;
        this.createBy = createBy;
        this.portrait = portrait;
        this.imsign = imsign;
        this.devFlag = devFlag;
        this.officeAdd = officeAdd;
        this.xm = xm;
        this.xbdm = xbdm;
        this.csrq = csrq;
        this.xzc = xzc;
        this.xzcqdsj = xzcqdsj;
        this.firstEdu = firstEdu;
        this.firstDate = firstDate;
        this.firstDegree = firstDegree;
        this.highestEdu = highestEdu;
        this.highestDate = highestDate;
        this.highestDegree = highestDegree;
        this.workingHours = workingHours;
        this.jszgz = jszgz;
        this.zcwydj = zcwydj;
        this.wydjqdsj = wydjqdsj;
        this.wylx = wylx;
        this.firstColleges = firstColleges;
        this.highestColleges = highestColleges;
    }

    public TSUserEntity() {
    }
}

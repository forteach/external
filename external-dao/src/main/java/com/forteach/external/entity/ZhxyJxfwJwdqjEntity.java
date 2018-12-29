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
@Table(name = "ZHXY_JXFW_JWDQJ", schema = "SZXY", catalog = "")
public class ZhxyJxfwJwdqjEntity implements Serializable {
    /**
     * 编号
     */
    @Id
    private String id;
    /**
     * 标题
     */
    private String bt;
    /**
     * 教工号
     */
    private String jgh;
    /**
     * 请假开始时间
     */
    private String qjkssj;
    /**
     * 请假结束时间
     */
    private String qjjssj;
    /**
     * 请假小时数
     */
    private String qjxss;
    /**
     * 请假类型
     */
    private String qjlx;
    /**
     * 请假事由
     */
    private String qjsy;
    /**
     * 有效标示
     */
    private String yxbz;
    /**
     * 修改时间
     */
    private String timestamp;
    /**
     * 备注
     */
    private String bz;
    /**
     * 未调课节次
     */
    private String wtkjc;
    /**
     * 请假项目
     * ｔk 调课
     * zb 坐班
     * bzr 班主任
     */
    private String qjxm;
    /**
     * 请假细类
     */
    private String qjxl;

    @Basic
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BT", nullable = true, length = 500)
    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    @Basic
    @Column(name = "JGH", nullable = true, length = 50)
    public String getJgh() {
        return jgh;
    }

    public void setJgh(String jgh) {
        this.jgh = jgh;
    }

    @Basic
    @Column(name = "QJKSSJ", nullable = true, length = 50)
    public String getQjkssj() {
        return qjkssj;
    }

    public void setQjkssj(String qjkssj) {
        this.qjkssj = qjkssj;
    }

    @Basic
    @Column(name = "QJJSSJ", nullable = true, length = 50)
    public String getQjjssj() {
        return qjjssj;
    }

    public void setQjjssj(String qjjssj) {
        this.qjjssj = qjjssj;
    }

    @Basic
    @Column(name = "QJXSS", nullable = true, length = 50)
    public String getQjxss() {
        return qjxss;
    }

    public void setQjxss(String qjxss) {
        this.qjxss = qjxss;
    }

    @Basic
    @Column(name = "QJLX", nullable = true, length = 50)
    public String getQjlx() {
        return qjlx;
    }

    public void setQjlx(String qjlx) {
        this.qjlx = qjlx;
    }

    @Basic
    @Column(name = "QJSY", nullable = true, length = 1000)
    public String getQjsy() {
        return qjsy;
    }

    public void setQjsy(String qjsy) {
        this.qjsy = qjsy;
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
    @Column(name = "TIMESTAMP", nullable = true, length = 20)
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "BZ", nullable = true, length = 1000)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "WTKJC", nullable = true, length = 500)
    public String getWtkjc() {
        return wtkjc;
    }

    public void setWtkjc(String wtkjc) {
        this.wtkjc = wtkjc;
    }

    @Basic
    @Column(name = "QJXM", nullable = true, length = 50)
    public String getQjxm() {
        return qjxm;
    }

    public void setQjxm(String qjxm) {
        this.qjxm = qjxm;
    }

    @Basic
    @Column(name = "QJXL", nullable = true, length = 50)
    public String getQjxl() {
        return qjxl;
    }

    public void setQjxl(String qjxl) {
        this.qjxl = qjxl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyJxfwJwdqjEntity that = (ZhxyJxfwJwdqjEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(bt, that.bt) &&
                Objects.equals(jgh, that.jgh) &&
                Objects.equals(qjkssj, that.qjkssj) &&
                Objects.equals(qjjssj, that.qjjssj) &&
                Objects.equals(qjxss, that.qjxss) &&
                Objects.equals(qjlx, that.qjlx) &&
                Objects.equals(qjsy, that.qjsy) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(wtkjc, that.wtkjc) &&
                Objects.equals(qjxm, that.qjxm) &&
                Objects.equals(qjxl, that.qjxl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bt, jgh, qjkssj, qjjssj, qjxss, qjlx, qjsy, yxbz, timestamp, bz, wtkjc, qjxm, qjxl);
    }
}

package com.forteach.external.entity;

import lombok.ToString;

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
@ToString
@Table(name = "ZHXY_JSXX", schema = "SZXY", catalog = "")
public class ZhxyJsxxEntity implements Serializable {
    @Id
    private String jsh;
    private String xqh;
    private String jxlh;
    private String szlc;
    private String jsyt;
    private Long zws;
    private Long yxzws;
    private Long kszws;
    private String jslxm;
    private String jsms;
    private String jsglbm;
    private String yxbz;
    private String bz;
    private String jsmc;
    private String timestamp;

    @Basic
    @Column(name = "JSH", nullable = false, length = 50)
    public String getJsh() {
        return jsh;
    }

    public void setJsh(String jsh) {
        this.jsh = jsh;
    }

    @Basic
    @Column(name = "XQH", nullable = true, length = 50)
    public String getXqh() {
        return xqh;
    }

    public void setXqh(String xqh) {
        this.xqh = xqh;
    }

    @Basic
    @Column(name = "JXLH", nullable = true, length = 600)
    public String getJxlh() {
        return jxlh;
    }

    public void setJxlh(String jxlh) {
        this.jxlh = jxlh;
    }

    @Basic
    @Column(name = "SZLC", nullable = true, length = 2)
    public String getSzlc() {
        return szlc;
    }

    public void setSzlc(String szlc) {
        this.szlc = szlc;
    }

    @Basic
    @Column(name = "JSYT", nullable = true, length = 2000)
    public String getJsyt() {
        return jsyt;
    }

    public void setJsyt(String jsyt) {
        this.jsyt = jsyt;
    }

    @Basic
    @Column(name = "ZWS", nullable = true, precision = 2)
    public Long getZws() {
        return zws;
    }

    public void setZws(Long zws) {
        this.zws = zws;
    }

    @Basic
    @Column(name = "YXZWS", nullable = true, precision = 2)
    public Long getYxzws() {
        return yxzws;
    }

    public void setYxzws(Long yxzws) {
        this.yxzws = yxzws;
    }

    @Basic
    @Column(name = "KSZWS", nullable = true, precision = 2)
    public Long getKszws() {
        return kszws;
    }

    public void setKszws(Long kszws) {
        this.kszws = kszws;
    }

    @Basic
    @Column(name = "JSLXM", nullable = true, length = 2)
    public String getJslxm() {
        return jslxm;
    }

    public void setJslxm(String jslxm) {
        this.jslxm = jslxm;
    }

    @Basic
    @Column(name = "JSMS", nullable = true, length = 200)
    public String getJsms() {
        return jsms;
    }

    public void setJsms(String jsms) {
        this.jsms = jsms;
    }

    @Basic
    @Column(name = "JSGLBM", nullable = true, length = 60)
    public String getJsglbm() {
        return jsglbm;
    }

    public void setJsglbm(String jsglbm) {
        this.jsglbm = jsglbm;
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
    @Column(name = "JSMC", nullable = true, length = 50)
    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc;
    }

    @Basic
    @Column(name = "TIMESTAMP", nullable = true, length = 20)
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhxyJsxxEntity that = (ZhxyJsxxEntity) o;
        return Objects.equals(jsh, that.jsh) &&
                Objects.equals(xqh, that.xqh) &&
                Objects.equals(jxlh, that.jxlh) &&
                Objects.equals(szlc, that.szlc) &&
                Objects.equals(jsyt, that.jsyt) &&
                Objects.equals(zws, that.zws) &&
                Objects.equals(yxzws, that.yxzws) &&
                Objects.equals(kszws, that.kszws) &&
                Objects.equals(jslxm, that.jslxm) &&
                Objects.equals(jsms, that.jsms) &&
                Objects.equals(jsglbm, that.jsglbm) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(jsmc, that.jsmc) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsh, xqh, jxlh, szlc, jsyt, zws, yxzws, kszws, jslxm, jsms, jsglbm, yxbz, bz, jsmc, timestamp);
    }
}

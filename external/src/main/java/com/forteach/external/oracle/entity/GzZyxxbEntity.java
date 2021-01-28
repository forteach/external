package com.forteach.external.oracle.entity;

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
@Table(name = "GZ_ZYXXB", schema = "SZXY", catalog = "")
public class GzZyxxbEntity implements Serializable {
    /**
     * 专业编号
     */
    @Id
    private String zybh;
    /**
     * 专业名称
     */
    private String zymc;
    /**
     * 培养目标
     */
    private String pymb;
    /**
     * 就业方向
     */
    private String jyfx;
    /**
     * 开办时间
     */
    private String kbsj;
    /**
     *
     */
    private String dwdm;

    @Basic
    @Column(name = "ZYBH", nullable = false, length = 40)
    public String getZybh() {
        return zybh;
    }

    public void setZybh(String zybh) {
        this.zybh = zybh;
    }

    @Basic
    @Column(name = "ZYMC", nullable = false, length = 90)
    public String getZymc() {
        return zymc;
    }

    public void setZymc(String zymc) {
        this.zymc = zymc;
    }

    @Basic
    @Column(name = "PYMB", nullable = true, length = 0)
    public String getPymb() {
        return pymb;
    }

    public void setPymb(String pymb) {
        this.pymb = pymb;
    }

    @Basic
    @Column(name = "JYFX", nullable = true, length = 0)
    public String getJyfx() {
        return jyfx;
    }

    public void setJyfx(String jyfx) {
        this.jyfx = jyfx;
    }

    @Basic
    @Column(name = "KBSJ", nullable = true, length = 0)
    public String getKbsj() {
        return kbsj;
    }

    public void setKbsj(String kbsj) {
        this.kbsj = kbsj;
    }

    @Basic
    @Column(name = "DWDM", nullable = true, length = 30)
    public String getDwdm() {
        return dwdm;
    }

    public void setDwdm(String dwdm) {
        this.dwdm = dwdm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzZyxxbEntity that = (GzZyxxbEntity) o;
        return Objects.equals(zybh, that.zybh) &&
                Objects.equals(zymc, that.zymc) &&
                Objects.equals(pymb, that.pymb) &&
                Objects.equals(jyfx, that.jyfx) &&
                Objects.equals(kbsj, that.kbsj) &&
                Objects.equals(dwdm, that.dwdm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zybh, zymc, pymb, jyfx, kbsj, dwdm);
    }
}

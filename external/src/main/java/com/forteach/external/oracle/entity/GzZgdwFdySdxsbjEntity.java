package com.forteach.external.oracle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:33
 * @Version: 1.0
 * @Description:　班主任信息表
 */
@Entity
@Table(name = "GZ_ZGDW_FDY_SDXSBJ", schema = "SZXY", catalog = "")
public class GzZgdwFdySdxsbjEntity implements Serializable {

    @Id
    private String id;
    /**
     * 班级代码
     * 关联班级信息表　bjdm
     */
    private String sdbjdm;
    /**
     * 上岗日期
     */
    private String sgrq;
    /**
     * 离岗日期
     */
    private String lgrq;
    /**
     * 教工号
     * 关联教职工信息表jgh
     */
    private String zgh;
    /**
     * 类别
     * 1 辅导员
     * 2 班主任
     */
    private String sslb;

    @Basic
    @Column(name = "ID", nullable = true, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SDBJDM", nullable = true, length = 500)
    public String getSdbjdm() {
        return sdbjdm;
    }

    public void setSdbjdm(String sdbjdm) {
        this.sdbjdm = sdbjdm;
    }

    @Basic
    @Column(name = "SGRQ", nullable = true, length = 30)
    public String getSgrq() {
        return sgrq;
    }

    public void setSgrq(String sgrq) {
        this.sgrq = sgrq;
    }

    @Basic
    @Column(name = "LGRQ", nullable = true, length = 30)
    public String getLgrq() {
        return lgrq;
    }

    public void setLgrq(String lgrq) {
        this.lgrq = lgrq;
    }

    @Basic
    @Column(name = "ZGH", nullable = true, length = 30)
    public String getZgh() {
        return zgh;
    }

    public void setZgh(String zgh) {
        this.zgh = zgh;
    }

    @Basic
    @Column(name = "SSLB", nullable = true, length = 10)
    public String getSslb() {
        return sslb;
    }

    public void setSslb(String sslb) {
        this.sslb = sslb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GzZgdwFdySdxsbjEntity that = (GzZgdwFdySdxsbjEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sdbjdm, that.sdbjdm) &&
                Objects.equals(sgrq, that.sgrq) &&
                Objects.equals(lgrq, that.lgrq) &&
                Objects.equals(zgh, that.zgh) &&
                Objects.equals(sslb, that.sslb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sdbjdm, sgrq, lgrq, zgh, sslb);
    }
}

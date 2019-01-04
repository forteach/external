package com.forteach.external.oracle.entity;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:33
 * @Version: 1.0
 * @Description:　建筑信息表
 */
@Entity
@Table(name = "BUILDING", schema = "SZXY", catalog = "")
@ToString
public class BuildingEntity implements Serializable {
    @Id
    private String id;
    /**
     * 建筑名称
     */
    private String dxmc;

    @Basic
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DXMC", nullable = true, length = 50)
    public String getDxmc() {
        return dxmc;
    }

    public void setDxmc(String dxmc) {
        this.dxmc = dxmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingEntity that = (BuildingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dxmc, that.dxmc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dxmc);
    }
}

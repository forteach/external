package com.forteach.external.oracle.entity;

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
@Table(name = "ROOM", schema = "SZXY", catalog = "")
@ToString
public class RoomEntity implements Serializable {
    @Id
    private String id;
    /**
     * 房间名称
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
    @Column(name = "DXMC", nullable = true, length = 100)
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
        RoomEntity that = (RoomEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dxmc, that.dxmc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dxmc);
    }
}

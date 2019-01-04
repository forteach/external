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
 * @Description:　楼层信息
 */
@Entity
@ToString
@Table(name = "FLOOR", schema = "SZXY", catalog = "")
public class FloorEntity implements Serializable {
    @Id
    private String id;
    /**
     * 建筑ID
     */
    private String parentId;
    /**
     * 楼层名称
     */
    private String floorName;

    @Basic
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PARENT_ID", nullable = true, length = 50)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "FLOOR_NAME", nullable = true, length = 50)
    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FloorEntity that = (FloorEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(floorName, that.floorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, floorName);
    }
}

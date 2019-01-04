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
@Table(name = "FLOOR_ROOM", schema = "SZXY", catalog = "")
public class FloorRoomEntity implements Serializable {
    /**
     * 楼层id
     */
    @Id
    private String floorId;
    /**
     * 房间id
     */
    private String mapobjectId;

    @Basic
    @Column(name = "FLOOR_ID", nullable = true, length = 50)
    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    @Basic
    @Column(name = "MAPOBJECT_ID", nullable = true, length = 50)
    public String getMapobjectId() {
        return mapobjectId;
    }

    public void setMapobjectId(String mapobjectId) {
        this.mapobjectId = mapobjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FloorRoomEntity that = (FloorRoomEntity) o;
        return Objects.equals(floorId, that.floorId) &&
                Objects.equals(mapobjectId, that.mapobjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorId, mapobjectId);
    }
}

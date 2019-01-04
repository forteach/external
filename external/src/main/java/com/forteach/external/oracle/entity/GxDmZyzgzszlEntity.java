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
@Table(name = "GX_DM_ZYZGZSZL", schema = "SZXY", catalog = "")
public class GxDmZyzgzszlEntity implements Serializable {
    @Id
    private String code;
    private String codeName;

    @Basic
    @Column(name = "CODE", nullable = true, length = 20)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "CODE_NAME", nullable = true, length = 80)
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GxDmZyzgzszlEntity that = (GxDmZyzgzszlEntity) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(codeName, that.codeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, codeName);
    }
}

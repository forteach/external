package com.forteach.external.mysql.domain;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2018/11/17 14:25
 * @Version: 1.0
 * @Description: 班级
 */
@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "classes", indexes = {@Index(columnList = "class_id", name = "class_id_index")})
@org.hibernate.annotations.Table(appliesTo = "classes", comment = "班级")
@DynamicInsert
@DynamicUpdate
public class Classes extends Entitys implements Serializable {

    @Id
    @Column(name = "class_id", columnDefinition = "VARCHAR(32) COMMENT '班级编号'")
    private String classId;

    @Column(name = "class_name", columnDefinition = "VARCHAR(60) COMMENT '班级名称'")
    private String className;

    public Classes() {
    }

    public Classes(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }
}

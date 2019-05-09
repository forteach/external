package com.forteach.external.mysql.domain;


import com.forteach.external.mysql.domain.base.Entitys;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description: 科目　从oracle 数据库查询的数据保存到　mysql　对应的表
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2018/11/6 16:42
 */
@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@Table(name = "o_course", indexes = {
        @Index(columnList = "course_id", name = "course_id_index")
})
@EqualsAndHashCode(callSuper = true)
@org.hibernate.annotations.Table(appliesTo = "o_course", comment = "科目课程信息,从数字化校园查询的")
public class CourseEntitys extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "course_id", columnDefinition = "VARCHAR(32) COMMENT '科目编号'")
    private String courseId;

    @Column(name = "course_name", columnDefinition = "VARCHAR(40) COMMENT '科目名称'")
    private String courseName;

    @Column(name = "course_describe", columnDefinition = "MEDIUMTEXT COMMENT'课程描述'" )
    private String courseDescribe;

    public CourseEntitys() {
    }

    public CourseEntitys(String courseId, String courseName, String courseDescribe) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescribe = courseDescribe;
    }
}
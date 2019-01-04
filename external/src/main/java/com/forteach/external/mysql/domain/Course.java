package com.forteach.external.mysql.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description: 科目
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2018/11/6 16:42
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course", indexes = {@Index(columnList = "course_id"), @Index(columnList = "specialty_id")})
@EqualsAndHashCode(callSuper = true)
@org.hibernate.annotations.Table(appliesTo = "course", comment = "科目课程")
public class Course extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "course_id", columnDefinition = "VARCHAR(32) COMMENT '科目编号'")
    private String courseId;

    @Column(name = "specialty_id", columnDefinition = "VARCHAR(32) COMMENT '专业号'")
    private String specialtyId;

    @Column(name = "course_name", columnDefinition = "VARCHAR(40) COMMENT '科目名称'")
    private String courseName;

    @Column(name = "course_number", columnDefinition = "VARCHAR(32) COMMENT '课程编号'")
    private String courseNumber;

    @Column(name = "share_type", columnDefinition = "INT DEFAULT 1 COMMENT '分享类型：１.私有 2.协作 ３.公开'")
    private Integer shareType;

    @Column(name = "teaching_type", columnDefinition = "VARCHAR(32) COMMENT '1、录播课程 2、直播课程 3、线下课堂'")
    private String teachingType;

    @Column(name = "top_pic_src", columnDefinition = "VARCHAR(255) COMMENT'封面图片路径'")
    private String topPicSrc;

    @Column(name = "course_describe", columnDefinition = "MEDIUMTEXT COMMENT'课程描述'")
    private String courseDescribe;
}

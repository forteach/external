package com.forteach.external.mysql.domain;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description:　教师
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2018/11/6 14:11
 */
@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
@DynamicInsert
@DynamicUpdate
@GenericGenerator(name = "system-uuid", strategy = "uuid")
@Table(name = "teacher",indexes = {@Index(columnList = "teacher_id", name = "teacher_id_index"), @Index(columnList = "specialty_id", name = "specialty_id_index")})
@org.hibernate.annotations.Table(appliesTo = "teacher", comment = "老师")
public class Teacher extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "teacher_id", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '老师id uuid'")
    private String teacherId;

    @Column(name = "specialty_id", columnDefinition = "VARCHAR(32) COMMENT '专业号'")
    private String specialtyId;

    @NotNull(message = "教师名称不能为空")
    @Column(name = "teacher_name", columnDefinition = "VARCHAR(40) COMMENT '教师名称'")
    private String teacherName;

    @NotNull(message = "教师编号不能为空")
    @Column(name = "teacher_code", columnDefinition = "VARCHAR(32) COMMENT '教师编号'")
    private String teacherCode;

    public Teacher() {
    }

    public Teacher(String teacherId, String specialtyId, @NotNull(message = "教师名称不能为空") String teacherName, @NotNull(message = "教师编号不能为空") String teacherCode) {
        this.teacherId = teacherId;
        this.specialtyId = specialtyId;
        this.teacherName = teacherName;
        this.teacherCode = teacherCode;
    }
}

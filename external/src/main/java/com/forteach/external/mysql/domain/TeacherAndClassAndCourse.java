package com.forteach.external.mysql.domain;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 14:27
 * @version: 1.0
 * @description:　教师对应的班级信息
 */
@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@IdClass(TeacherClassCoursePrimarykey.class)
@Table(name = "teacher_class_course", indexes = {
        @Index(columnList = "teacher_id", name = "teacher_id_index"),
        @Index(columnList = "class_id", name = "class_id_index"),
        @Index(columnList = "course_id", name = "course_id_index")})
@org.hibernate.annotations.Table(appliesTo = "teacher_class_course", comment = "老师授课的班级和课程信息")
public class TeacherAndClassAndCourse extends Entitys implements Serializable {

    private String teacherId;

    private String classId;

    private String courseId;

}

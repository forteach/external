package com.forteach.external.mysql.domain;

import com.forteach.external.mysql.domain.base.Entitys;
import com.forteach.external.mysql.domain.primarykey.TeacherClassCoursePrimaryKey;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
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
@EqualsAndHashCode(callSuper = true)
@IdClass(TeacherClassCoursePrimaryKey.class)
@Table(name = "teacher_class_course", indexes = {
        @Index(columnList = "teacher_id", name = "teacher_id_index"),
        @Index(columnList = "class_id", name = "class_id_index"),
        @Index(columnList = "course_id", name = "course_id_index")
})
@AllArgsConstructor
@NoArgsConstructor
@org.hibernate.annotations.Table(appliesTo = "teacher_class_course", comment = "老师授课的班级和课程信息")
public class TeacherClassCourse extends Entitys implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private TeacherClassCoursePrimaryKey teacherClassCoursePrimarykey;

    private String teacherId;

    private String classId;

    private String courseId;

}

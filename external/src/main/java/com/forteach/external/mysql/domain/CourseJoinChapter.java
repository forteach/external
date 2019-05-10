package com.forteach.external.mysql.domain;

import com.forteach.external.mysql.domain.base.Entitys;
import com.forteach.external.mysql.domain.primarykey.CourseJoinChapterPrimaryKey;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-6 13:46
 * @version: 1.0
 * @description:
 */
@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CourseJoinChapterPrimaryKey.class)
@Table(name = "course_join_chapter", indexes = {
        @Index(columnList = "chapter_id", name = "chapter_id_index"),
        @Index(columnList = "course_id", name = "course_id_index"),
        @Index(columnList = "circle_id", name = "circle_id_index")
})
@org.hibernate.annotations.Table(appliesTo = "course_join_chapter", comment = "加入课堂的学生对应的章节信息")
public class CourseJoinChapter extends Entitys {

    @EmbeddedId
    private CourseJoinChapterPrimaryKey courseJoinChapterPrimaryKey;

    private String courseId;

    private String chapterId;

    private String circleId;

    @Column(name = "class_id", columnDefinition = "VARCHAR(32) COMMENT '班级id'")
    private String classId;

    @Column(name = "teacher_id", columnDefinition = "VARCHAR(32) COMMENT '创建课堂的教师id'")
    private String teacherId;

    @Column(name = "join_number", columnDefinition = "INT(11) DEFAULT 0 COMMENT '加入课堂的人数'")
    private Integer joinNumber;

    @Column(name = "join_students", columnDefinition = "TEXT(10000) COMMENT '加入课堂的学生id,逗号分割'")
    private String students;

}

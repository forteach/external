package com.forteach.external.mysql.domain.description;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.forteach.external.mysql.domain.base.BaseCourseDescription;
import com.forteach.external.mysql.domain.pk.CourseJoinChapterPk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-15 16:46
 * @version: 1.0
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "course_join_chapter_description", indexes = {
        @Index(name = "course_id_index", columnList = "course_id"),
        @Index(name = "chapter_id_index", columnList = "chapter_id"),
        @Index(name = "class_id_index", columnList = "class_id"),
        @Index(name = "circle_id_index", columnList = "circle_id"),
        @Index(name = "student_id_index", columnList = "student_id")
})
@IdClass(CourseJoinChapterPk.class)
@org.hibernate.annotations.Table(appliesTo = "course_join_chapter_description", comment = "课堂章节加入学生详情表")
public class CourseJoinChapterDescription extends BaseCourseDescription implements Serializable {

    @EmbeddedId
    @JsonIgnore
    private CourseJoinChapterPk courseJoinChapterPk;

    private String courseId;

    private String chapterId;

    private String classId;

    @Column(name = "circle_Id", columnDefinition = "VARCHAR(32) COMMENT '课堂id'")
    private String circleId;

    public String studentId;

}

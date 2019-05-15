package com.forteach.external.mysql.domain.base;

import com.forteach.external.mysql.domain.pk.CourseJoinChapterPk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-15 15:52
 * @version: 1.0
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@IdClass(CourseJoinChapterPk.class)
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseCourseDescription extends Entitys {

    @EmbeddedId
    private CourseJoinChapterPk courseJoinChapterPk;

    private String courseId;

    private String chapterId;

    private String classId;

    private String circleId;

    public String studentId;

    @Column(name = "grade", columnDefinition = "VARCHAR(11) COMMENT '评分'")
    private String grade;
}

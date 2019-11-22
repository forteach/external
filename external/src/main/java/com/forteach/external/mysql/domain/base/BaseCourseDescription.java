package com.forteach.external.mysql.domain.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.forteach.external.mysql.domain.pk.CourseCountPk;
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
@IdClass(CourseCountPk.class)
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseCourseDescription extends Entitys {

    @EmbeddedId
    @JsonIgnore
    private CourseCountPk courseCountPk;

    private String courseId;

    private String chapterId;

    private String classId;

}

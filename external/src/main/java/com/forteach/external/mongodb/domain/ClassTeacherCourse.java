package com.forteach.external.mongodb.domain;

import com.forteach.external.mongodb.domain.base.BaseEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 18:06
 * @version: 1.0
 * @description:　教师班级课程关联关系信息表记录
 */
@Data
@Builder
@Document(collection = "classTeacherCourse")
public class ClassTeacherCourse extends BaseEntity {

    /**
     * 班级id
     */
    @Indexed
    private String classId;

    /**
     *　教师id
     */
    @Indexed
    private String teacherId;
    /**
     * 课程id
     */
    @Indexed
    private String courseId;

}

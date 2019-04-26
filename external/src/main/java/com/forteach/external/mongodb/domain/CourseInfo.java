package com.forteach.external.mongodb.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 19:27
 * @version: 1.0
 * @description:
 */
@Data
@Builder
@Document(collection = "courseInfo")
public class CourseInfo extends BaseEntity{
    /**
     * 课程id
     */
    private String courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 描述
     */
    private String courseDescribe;
}

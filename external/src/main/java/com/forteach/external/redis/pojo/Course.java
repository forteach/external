package com.forteach.external.redis.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-1-17 09:20
 * @version: 1.0
 * @description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Course extends RedisBash{
    /**
     * 课程id
     */
    private String courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程描述
     */
    private String courseDescribe;
}

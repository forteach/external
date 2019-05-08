package com.forteach.external.mongodb.domain;

import com.forteach.external.mongodb.domain.base.BaseEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 16:10
 * @version: 1.0
 * @description: 教师信息
 */
@Data
@Builder
@Document(collection = "teacherInfo")
public class TeacherInfo extends BaseEntity {

    /**
     * teacherId　教师id
     */
    @Indexed
    private String teacherId;

    /**
     * teacherName 教师代码
     */
    private String teacherCode;

    /**
     * 教师名称
     */
    private String teacherName;
}

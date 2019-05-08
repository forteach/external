package com.forteach.external.mongodb.domain;

import com.forteach.external.mongodb.domain.base.BaseEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 19:24
 * @version: 1.0
 * @description:
 */
@Data
@Builder
@Document(collection = "classInfo")
public class ClassesInfo extends BaseEntity {
    /**
     * 班级id
     */
    @Indexed
    private String classId;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 年级
     */
    private Long grade;
}

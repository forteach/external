package com.forteach.external.mongodb.domain;

import com.forteach.external.mongodb.domain.base.BaseEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 18:04
 * @version: 1.0
 * @description:　学生信息记录表
 */
@Data
@Builder
@Document(collection = "classStudents")
public class ClassStudents extends BaseEntity {

    /**
     * 班级id
     */
    @Indexed
    private String classId;
    /**
     * 学生信息
     */
    private List<String> students;
}

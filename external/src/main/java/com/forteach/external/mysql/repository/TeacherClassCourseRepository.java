package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.TeacherAndClassAndCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 15:03
 * @version: 1.0
 * @description: 教师对应的班级信息
 */
public interface TeacherClassCourseRepository extends JpaRepository<TeacherAndClassAndCourse, String> {

}

package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.CourseStudy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-28 11:35
 * @version: 1.0
 * @description:
 */
public interface CourseStudyRepository extends JpaRepository<CourseStudy, String> {

    List<CourseStudy> findByIsValidatedEqualsAndCourseIdAndStudentId(String isValidated, String courseId, String studentId);

}

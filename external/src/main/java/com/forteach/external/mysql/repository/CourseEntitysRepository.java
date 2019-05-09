package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-30 18:13
 * @version: 1.0
 * @description:
 */
public interface CourseEntitysRepository extends JpaRepository<Course, String> {

}

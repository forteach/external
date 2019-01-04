package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:33
 * @Version: 1.0
 * @Description:
 */

public interface CourseRepository extends JpaRepository<Course, String> {

}

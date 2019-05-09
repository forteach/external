package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.CourseEntitys;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:33
 * @Version: 1.0
 * @Description:
 */

public interface CourseRepository extends JpaRepository<CourseEntitys, String> {

}

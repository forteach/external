package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-2 18:28
 * @Version: 1.0
 * @Description:
 */
public interface TeacherRepository extends JpaRepository<Teacher, String> {
}

package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.StudentEntitys;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-2-14 10:59
 * @version: 1.0
 * @description:
 */
public interface StudentRepository extends JpaRepository<StudentEntitys, String> {

//    List<StudentEntitys> findByIsValidatedEqualsAndIDCardNo();
}

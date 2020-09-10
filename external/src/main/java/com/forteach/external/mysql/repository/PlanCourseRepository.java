package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.PlanCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/9/8 16:48
 * @Version: v1.0
 * @Modified：排课信息
 * @Description:
 */
public interface PlanCourseRepository extends JpaRepository<PlanCourse, String> {

}
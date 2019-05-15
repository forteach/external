package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.CourseChapterCount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-15 17:27
 * @version: 1.0
 * @description:
 */
public interface CourseChapterCountRepository extends JpaRepository<CourseChapterCount, String> {

}

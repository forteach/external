package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.TeacherClassCourseDto;
import com.forteach.external.oracle.entity.ZhxyKcxxPkxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 17:52
 * @Version: 1.0
 * @Description:
 */
public interface ZhxyKcxxPkxxRepository extends JpaRepository<ZhxyKcxxPkxxEntity, String> {

    @Query(value = "select tZjjs as teacherId, tSkbj as classId, kcId as courseId from ZhxyKcxxPkxxEntity")
    List<TeacherClassCourseDto> findByClassIdAndCourse();
}

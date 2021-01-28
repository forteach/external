package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.IPlanCourseDto;
import com.forteach.external.oracle.dto.ITeacherClassCourseDto;
import com.forteach.external.oracle.entity.ZhxyKcxxPkxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 17:52
 * @Version: 1.0
 * @Description:
 */
public interface ZhxyKcxxPkxxRepository extends JpaRepository<ZhxyKcxxPkxxEntity, String> {

    /**
     * 查询排课信息
     *
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Query(value = "SELECT tZjjs AS teacherId, tSkbj AS classId, kcId AS courseId FROM ZhxyKcxxPkxxEntity")
    List<ITeacherClassCourseDto> findCourse();

    /**
     * 查询排课信息
     *
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = "select " +
            " xh AS id, " +
            " kcId as courseId, " +
            " kcmc as courseName, " +
            " xn as year, " +
            " xqId as semester, " +
            " tZjjs as teacherId, " +
            " xm as teacherName, " +
            " jc as classRoomNum, " +
            " kclb as courseType, " +
            " zb as weekType, " +
            " tSkbj as classId, " +
            " jsid as classRoomId, " +
            " jsmc as classRoomName, " +
            " xqS as weekNum, " +
            " pkms as planCourseDesc, " +
            " zc as classRoomWeekNum " +
            " from ZhxyKcxxPkxxEntity")
    List<IPlanCourseDto> findPlanCourse();
}

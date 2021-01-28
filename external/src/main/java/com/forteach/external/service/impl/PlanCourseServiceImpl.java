package com.forteach.external.service.impl;

import com.forteach.external.mysql.domain.PlanCourse;
import com.forteach.external.mysql.repository.PlanCourseRepository;
import com.forteach.external.oracle.dto.IPlanCourseDto;
import com.forteach.external.oracle.repository.ZhxyKcxxPkxxRepository;
import com.forteach.external.service.PlanCourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/9/9 10:17
 * @Version: v1.0
 * @Modified：排课信息
 * @Description:
 */
@Service
@Slf4j
public class PlanCourseServiceImpl implements PlanCourseService {
    private final PlanCourseRepository planCourseRepository;
    private final ZhxyKcxxPkxxRepository zhxyKcxxPkxxRepository;

    public PlanCourseServiceImpl(PlanCourseRepository planCourseRepository, ZhxyKcxxPkxxRepository zhxyKcxxPkxxRepository) {
        this.planCourseRepository = planCourseRepository;
        this.zhxyKcxxPkxxRepository = zhxyKcxxPkxxRepository;
    }

    @Async
    @Override
    public void saveAll() {
        List<PlanCourse> list = findAll().parallelStream().map(p -> {
            PlanCourse planCourse = new PlanCourse();
            planCourse.setId(p.getId());
            planCourse.setCourseId(p.getCourseId());
            planCourse.setCourseName(p.getCourseName());
            planCourse.setYear(p.getYear());
            //学期查出来，是 0 的话要设置学期为 1，1 要设置学期为 2
            String semester = "1".equals(p.getSemester()) ? "2" : "1";
            planCourse.setSemester(semester);
            planCourse.setTeacherId(p.getTeacherId());
            planCourse.setTeacherName(p.getTeacherName());
            planCourse.setClassId(p.getClassId());
            planCourse.setClassRoomId(p.getClassRoomId());
            planCourse.setClassRoomName(p.getClassRoomName());
            planCourse.setClassRoomWeekNum(p.getClassRoomWeekNum());
            planCourse.setClassRoomNum(p.getClassRoomNum());
            planCourse.setCourseType(p.getCourseType());
            planCourse.setPlanCourseDesc(p.getPlanCourseDesc());
            planCourse.setWeekNum(p.getWeekNum());
            planCourse.setWeekType(p.getWeekType());
            return planCourse;
        }).collect(Collectors.toList());
        if (!list.isEmpty()) {
            planCourseRepository.saveAll(list);
        }
    }

    private List<IPlanCourseDto> findAll() {
        return zhxyKcxxPkxxRepository.findPlanCourse();
    }
}

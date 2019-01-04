package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.ICourseDto;
import com.forteach.external.oracle.entity.ZhxyKcxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-1 18:50
 * @Version: 1.0
 * @Description: 课程信息
 */
public interface ZhxyKcxxRepository extends JpaRepository<ZhxyKcxxEntity, String> {

    @Transactional(readOnly = true)
    @Query(value = "SELECT kch AS courseId, kcmc AS courseName, kcjj AS courseDescribe, sszy AS spcialtyId FROM ZhxyKcxxEntity WHERE yxbz = ?1")
    List<ICourseDto> findAllDto(String isValidated);

    @Transactional(readOnly = true)
    @Query(value = "SELECT kch AS courseId, kcmc AS courseName, kcjj AS courseDescribe, sszy AS spcialtyId FROM ZhxyKcxxEntity WHERE yxbz = ?1 AND timestamp >= ?2")
    List<ICourseDto> findAllDtoByTimestamp(String isValidated, String timeStamp);
}

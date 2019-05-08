package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.ICourseDto;
import com.forteach.external.oracle.entity.ZhxyKcxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    /**
     * 查询是有效状态的教师信息
     * @param isValidated
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = "SELECT kch AS courseId, kcmc AS courseName, kcjj AS courseDescribe, yxbz AS isValidated FROM ZhxyKcxxEntity WHERE yxbz = ?1")
    List<ICourseDto> findAllDto(String isValidated);

    /**
     * 查询最近修改的教师信息
     * @param timeStamp
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = "SELECT kch AS courseId, kcmc AS courseName, kcjj AS courseDescribe, yxbz AS isValidated FROM ZhxyKcxxEntity WHERE timestamp >= ?1")
    List<ICourseDto> findAllDtoByTimestamp(String timeStamp);
}

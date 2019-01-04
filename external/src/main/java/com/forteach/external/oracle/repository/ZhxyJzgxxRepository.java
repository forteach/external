package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.ITeacherDto;
import com.forteach.external.oracle.entity.ZhxyJzgxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-2 09:44
 * @Version: 1.0
 * @Description: 教职工信息
 */
public interface ZhxyJzgxxRepository extends JpaRepository<ZhxyJzgxxEntity, String> {

    @Transactional(readOnly = true)
    @Query(value = "select z.id as teacherId, z.jgh as teacherCode, z.xm as teacherName, z.ryzt as idValidated from ZhxyJzgxxEntity as z where z.yxbz = ?1")
    List<ITeacherDto> findAllByDto(String isValidated);

    @Transactional(readOnly = true)
    @Query(value = "select z.id as teacherId, z.jgh as teacherCode, z.xm as teacherName, z.ryzt as idValidated from ZhxyJzgxxEntity as z where z.yxbz = ?1 and z.timestamp >= ?2")
    List<ITeacherDto> findAllByDtoByTimestamp(String isValidated, Timestamp timestamp);

}

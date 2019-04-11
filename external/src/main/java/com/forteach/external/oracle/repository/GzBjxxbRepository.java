package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.IClassesDto;
import com.forteach.external.oracle.entity.GzBjxxbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-1 18:40
 * @Version: 1.0
 * @Description: 班级信息
 */
public interface GzBjxxbRepository extends JpaRepository<GzBjxxbEntity, String> {

    /**
     * 查询需要的班级信息
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = "select bjbh as classId, bjmc as className, ssnj as grade from GzBjxxbEntity ")
    List<IClassesDto> findAllDto();
}

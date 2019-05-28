package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.StudentEntitys;
import com.forteach.external.mysql.dto.IStudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-2-14 10:59
 * @version: 1.0
 * @description:
 */
public interface StudentRepository extends JpaRepository<StudentEntitys, String> {


    /**
     * 查询班级学生信息
     * @return
     */
    @Query(value = "select " +
            " id as studentId," +
            " classId as classId " +
            " from StudentEntitys " +
            " where isValidated = '0' and classId in " +
            " (select distinct classId from StudentEntitys where isValidated = '0')")
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    List<IStudentDto> findByIsValidatedEqualsAndClassId();
}

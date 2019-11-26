package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.IStudentDto;
import com.forteach.external.oracle.entity.ZhxyXsxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 10:03
 * @Version: 1.0
 * @Description:
 */
public interface ZhxyXsxxRepository extends JpaRepository<ZhxyXsxxEntity, String> {

    /**
     * 查询有效的学生信息需要保存到　redis 缓存
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = "select " +
            " xsid as id, " +
            " xsxm as name, " +
            " sfzjh AS IDCardNo, " +
            " lsbj as classId, " +
            " yddh as phone, " +
            " csrq as birthDate, " +
            " nj as grade, " +
            " xb as gender, " +
            " isgraduate as isGraduate, " +
            " xjzt as studentStatus, " +
            " yxbz as isValidated " +
            " from ZhxyXsxxEntity where yxbz = 'Y'")
    List<IStudentDto> findAllRedisDto();

    /**
     * 查询近期修改的学生信息
     * @param timeStamp
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = "select " +
            " xsid as id, " +
            " xsxm as name, " +
            " sfzjh AS IDCardNo, " +
            " lsbj as classId, " +
            " yddh as phone, " +
            " csrq as birthDate, " +
            " nj as grade, " +
            " xb as gender, " +
            " isgraduate as isGraduate, " +
            " xjzt as studentStatus, " +
            " yxbz AS isValidated " +
            " from ZhxyXsxxEntity where timestamp >= ?1")
    List<IStudentDto> findAllDtoByTimeStamp(Timestamp timeStamp);
}

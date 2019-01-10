package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.dto.ISysUserDto;
import com.forteach.external.oracle.entity.TSUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-25 14:54
 * @Version: 1.0
 * @Description:
 */
public interface TSUserRepository extends JpaRepository<TSUserEntity, String> {

    /**
     * 查询有效的用户信息
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = " SELECT u.id AS id, u.xm AS userName, u.mobilephone AS registerPhone, u.email AS email, u.xbdm AS genders, u.createDate AS cTime," +
            " u.updateDate AS uTime, u.createBy AS cUser,  u.updateBy AS uUser FROM TSUserEntity AS u ")
    List<ISysUserDto> findAllUserDto();


    /**
     * 根据时间查询对应的dto信息
     * @param updateDate
     * @return
     */
    @Transactional(readOnly = true)
    @Query(value = " SELECT u.id AS id, u.xm AS userName, u.mobilephone AS registerPhone, u.email AS email, u.xbdm AS genders, u.createDate AS cTime," +
            " u.updateDate AS uTime, u.createBy AS cUser,  u.updateBy AS uUser FROM TSUserEntity AS u WHERE updateDate >= :updateDate ")
    List<ISysUserDto> findDtoUpdateDate(@Param("updateDate") Date updateDate);
}

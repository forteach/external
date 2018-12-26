package com.forteach.external.repository;

import com.forteach.external.dto.IUserDto;
import com.forteach.external.entity.TSUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-25 14:54
 * @Version: 1.0
 * @Description:
 */
public interface TSUserRepository extends JpaRepository<TSUserEntity, String> {

    @Transactional(readOnly = true)
    @Query(value = " SELECT u.id AS id, u.xm AS userName, u.mobilephone AS registerPhone, u.email AS email, u.xbdm AS genders, u.createDate AS cTime," +
            " u.updateDate AS uTime, u.createBy AS cUser,  u.updateBy AS uUser FROM TSUserEntity AS u ")
    List<IUserDto> findAllUserDto();
}

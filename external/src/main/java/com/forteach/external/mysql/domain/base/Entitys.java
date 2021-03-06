package com.forteach.external.mysql.domain.base;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


/**
 * @Description:　表的基本信息
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2018/10/30 15:53
 */

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Entitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "is_validated", columnDefinition = "CHAR(1) DEFAULT 0 COMMENT '生效标识 0生效 1失效'", nullable = false)
    private String isValidated = "0";


    @Column(name = "u_time", columnDefinition = "VARCHAR(32)  COMMENT '更新时间'")
    private String updateTime = DateUtil.now();

    @Column(updatable = false, name = "c_time", columnDefinition = "VARCHAR(32) COMMENT '创建时间'")
    private String createTime = StrUtil.isBlank(this.createTime) ? DateUtil.now() : this.createTime;

    @Column(updatable = false, name = "c_user", columnDefinition = "VARCHAR(32) COMMENT '创建人'")
    private String createUser;

    @Column(name = "u_user", columnDefinition = "VARCHAR(32) COMMENT '修改人'")
    private String updateUser;

}

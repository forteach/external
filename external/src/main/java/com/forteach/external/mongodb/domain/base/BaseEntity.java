package com.forteach.external.mongodb.domain.base;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-26 18:00
 * @version: 1.0
 * @description:
 */
@Data
public abstract class BaseEntity implements Serializable {
    /**
     * mongodb 主键
     */
    @Id
    protected String id;

    /**
     * mongodb 更新日期
     */
    protected String uDate;
}

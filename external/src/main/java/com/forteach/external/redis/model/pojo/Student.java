package com.forteach.external.redis.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 09:39
 * @Version: 1.0
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
public class Student extends RedisBash {
    private String id;
    private String name;

}

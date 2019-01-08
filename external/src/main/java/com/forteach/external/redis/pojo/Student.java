package com.forteach.external.redis.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
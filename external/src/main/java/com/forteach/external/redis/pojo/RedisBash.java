package com.forteach.external.redis.pojo;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 12:44
 * @Version: 1.0
 * @Description:
 */
public abstract class RedisBash implements Serializable {
    private String key;
    private HashMap<String, String> map;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }
}

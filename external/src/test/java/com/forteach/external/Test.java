package com.forteach.external;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 15:58
 * @Version: 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(DateUtil.date(new Date()).toTimestamp());
        System.out.println(DateUtil.offsetDay(new Date(), -1).toTimestamp());
        System.out.println("a422d4e3b9b64226844952e7e658a880".length());
    }
}

package com.forteach.external.util;

import static com.forteach.external.common.Dic.*;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-2-15 12:01
 * @version: 1.0
 * @description:
 */
public class StringUtil {
    /**
     * 将 Orache  数据库的 'Y' 转换为　'0'
     * @param isValidated
     * @return
     */
    public static String changeIsValidated(String isValidated){
        if(ISVALIDATED_N.equals(isValidated)){
            return ISVALIDATED_1;
        }
        return ISVALIDATED_0;
    }

    public static String changeGender(String gender){
        if (GENDER_F.equals(gender)){
            return "女";
        }
        return "男";
    }
}

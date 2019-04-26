package com.forteach.external.common;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 14:43
 * @Version: 1.0
 * @Description:
 */
public class Dic {

    /**
     * oracle 数据库有效字段
     */
    public final static String ISVALIDATED_Y = "Y";

    /**
     * mysql 有效字段
     */
    public final static String ISVALIDATED_0 = "0";

    /**
     * oracle 无效字段
     */
    public final static String ISVALIDATED_N = "N";

    /**
     * oracle 无效字段
     */
    public final static String ISVALIDATED_1 = "1";

    /**
     * 学生信息前缀
     */
    public static final String STUDENT_ADO = "studentsData$";

    /**
     * 课程redis 前缀
     */
    public static final String COURSE_PREFIX = "course#";
    /**
     * 班级redis 前缀
     */
    private static final String CLASS_PREFIX = "class#";
}

package com.forteach.external.oracle.dto;

import java.io.Serializable;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-1 17:46
 * @Version: 1.0
 * @Description:　科目课程先关的信息
 */
public interface ICourseDto extends Serializable {
    /**
     * 课程id
     * @return
     */
    public String getCourseId();

    /**
     * 课程名称
     * @return
     */
    public String getCourseName();
    /**
     * 课程描述
     */
    public String getCourseDescribe();

    /**
     * 有效标识
     * @return
     */
    public String getIsValidated();
}

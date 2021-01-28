package com.forteach.external.oracle.dto;

import java.io.Serializable;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-1 17:58
 * @Version: 1.0
 * @Description:　班级信息
 */
public interface IClassesDto extends Serializable {
    /**
     * 班级编号id
     *
     * @return
     */
    public String getClassId();

    /**
     * 班级名称
     *
     * @return
     */
    public String getClassName();

    /**
     * 年级
     *
     * @return
     */
    public Long getGrade();

    /**
     * 班级生效标识
     //     * @return
     */
//    public String getIsValidated();

}

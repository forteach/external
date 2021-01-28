package com.forteach.external.mysql.dto;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-6 16:18
 * @version: 1.0
 * @description:　章节对应的课程
 */
public interface ICourseChapterDto {

    /**
     * 课程id
     *
     * @return
     */
    public String getCourseId();

    /**
     * 章节id
     *
     * @return
     */
    public String getChapterId();
}

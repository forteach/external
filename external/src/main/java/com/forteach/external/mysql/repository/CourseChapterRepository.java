package com.forteach.external.mysql.repository;

import com.forteach.external.mysql.domain.CourseChapter;
import com.forteach.external.mysql.dto.ICourseChapterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-11-19 10:41
 * @Version: 1.0
 * @Description:　科目章节
 */
@Repository("courseChapterRepository")
public interface CourseChapterRepository extends JpaRepository<CourseChapter, String>, JpaSpecificationExecutor<CourseChapterRepository> {

    /**
     * 通过章节信息查询课程信息
     *
     * @param chapterIds
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Query(value = "select courseId AS courseId, chapterId AS chapterId FROM CourseChapter WHERE chapterId IN ?1")
    List<ICourseChapterDto> findByChapterIdIn(Set<String> chapterIds);

}

package com.forteach.external.mysql.domain.builder;

import com.forteach.external.mysql.domain.CourseJoinChapterDescription;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-5-15 17:48
 * @version: 1.0
 * @description:
 */
public final class CourseJoinChapterDescriptionBuilder {
    private String studentId;
    private String courseId;
    private String chapterId;
    private String classId;
    private String circleId;
    private String grade;

    private CourseJoinChapterDescriptionBuilder() {
    }

    public static CourseJoinChapterDescriptionBuilder aCourseJoinChapterDescription() {
        return new CourseJoinChapterDescriptionBuilder();
    }


    public CourseJoinChapterDescriptionBuilder withCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseJoinChapterDescriptionBuilder withChapterId(String chapterId) {
        this.chapterId = chapterId;
        return this;
    }

    public CourseJoinChapterDescriptionBuilder withClassId(String classId) {
        this.classId = classId;
        return this;
    }

    public CourseJoinChapterDescriptionBuilder withCircleId(String circleId) {
        this.circleId = circleId;
        return this;
    }

    public CourseJoinChapterDescriptionBuilder withStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }

    public CourseJoinChapterDescriptionBuilder withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public CourseJoinChapterDescription build() {
        CourseJoinChapterDescription courseJoinChapterDescription = new CourseJoinChapterDescription();
        courseJoinChapterDescription.setCourseId(courseId);
        courseJoinChapterDescription.setChapterId(chapterId);
        courseJoinChapterDescription.setClassId(classId);
        courseJoinChapterDescription.setCircleId(circleId);
        courseJoinChapterDescription.setStudentId(studentId);
        courseJoinChapterDescription.setGrade(grade);
        return courseJoinChapterDescription;
    }
}

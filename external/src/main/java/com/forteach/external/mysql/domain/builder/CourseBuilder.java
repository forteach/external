package com.forteach.external.mysql.domain.builder;

import com.forteach.external.mysql.domain.Course;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-5 17:16
 * @Version: 1.0
 * @Description:
 */
public final class CourseBuilder {
    private String courseId;
    private String isValidated;
    private String courseName;
    private String courseDescribe;

    private CourseBuilder() {
    }

    public static CourseBuilder aCourse() {
        return new CourseBuilder();
    }

    public CourseBuilder withCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseBuilder withIsValidated(String isValidated) {
        this.isValidated = isValidated;
        return this;
    }

    public CourseBuilder withCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }


    public CourseBuilder withCourseDescribe(String courseDescribe) {
        this.courseDescribe = courseDescribe;
        return this;
    }

    public Course build() {
        Course course = new Course();
        course.setCourseId(courseId);
        course.setIsValidated(isValidated);
        course.setCourseName(courseName);
        course.setCourseDescribe(courseDescribe);
        return course;
    }
}

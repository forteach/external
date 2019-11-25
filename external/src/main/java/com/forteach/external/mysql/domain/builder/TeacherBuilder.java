package com.forteach.external.mysql.domain.builder;

import com.forteach.external.mysql.domain.Teacher;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-5 16:50
 * @Version: 1.0
 * @Description:
 */
public final class TeacherBuilder {
    /**
     * 是否有效 0 有效　1 无效
     */
    private String isValidated;
    /**
     * 教师id
     */
    private String teacherId;
    /**
     * 教师姓名
     */
    private String teacherName;
    /**
     * 教师代码
     */
    private String teacherCode;

    private String phone;

    private TeacherBuilder() {
    }

    public static TeacherBuilder aTeacher() {
        return new TeacherBuilder();
    }

    public TeacherBuilder withIsValidated(String isValidated) {
        this.isValidated = isValidated;
        return this;
    }

    public TeacherBuilder withTeacherId(String teacherId) {
        this.teacherId = teacherId;
        return this;
    }

    public TeacherBuilder withTeacherName(String teacherName) {
        this.teacherName = teacherName;
        return this;
    }

    public TeacherBuilder withTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
        return this;
    }
    public TeacherBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Teacher build() {
        Teacher teacher = new Teacher();
        teacher.setIsValidated(isValidated);
        teacher.setTeacherId(teacherId);
        teacher.setTeacherName(teacherName);
        teacher.setTeacherCode(teacherCode);
        teacher.setPhone(phone);
        return teacher;
    }
}

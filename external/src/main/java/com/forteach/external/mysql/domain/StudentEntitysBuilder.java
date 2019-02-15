package com.forteach.external.mysql.domain;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-2-15 11:04
 * @version: 1.0
 * @description:
 */
public final class StudentEntitysBuilder {
    private String isValidated;
    private String id;
    private String userName;
    private String IDCardNo;

    private StudentEntitysBuilder() {
    }

    public static StudentEntitysBuilder aStudentEntitys() {
        return new StudentEntitysBuilder();
    }

    public StudentEntitysBuilder isValidated(String isValidated) {
        this.isValidated = isValidated;
        return this;
    }

    public StudentEntitysBuilder id(String id) {
        this.id = id;
        return this;
    }

    public StudentEntitysBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }

    public StudentEntitysBuilder IDCardNo(String IDCardNo) {
        this.IDCardNo = IDCardNo;
        return this;
    }

    public StudentEntitys build() {
        StudentEntitys studentEntitys = new StudentEntitys(id, userName, IDCardNo);
        studentEntitys.setIsValidated(isValidated);
        return studentEntitys;
    }
}

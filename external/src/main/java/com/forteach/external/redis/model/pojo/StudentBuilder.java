package com.forteach.external.redis.model.pojo;

import java.util.HashMap;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 13:12
 * @Version: 1.0
 * @Description:
 */
public final class StudentBuilder {
    private String key;
    private HashMap map;
    private String id;
    private String name;

    private StudentBuilder() {
    }

    public static StudentBuilder aStudent() {
        return new StudentBuilder();
    }

    public StudentBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public StudentBuilder withMap(HashMap map) {
        this.map = map;
        return this;
    }

    public StudentBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Student build() {
        Student student = new Student(id, name);
        student.setKey(key);
        student.setMap(map);
        return student;
    }
}

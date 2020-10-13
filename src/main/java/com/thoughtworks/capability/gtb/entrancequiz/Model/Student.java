package com.thoughtworks.capability.gtb.entrancequiz.Model;

public class Student {
    public String name;
    public Integer Id;

    public Student() {}

    public Student(String name, Integer id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}

package com.thoughtworks.capability.gtb.entrancequiz.Model;

public class Student {
    public String name;
    //TODO GTB：属性命名，首字母一般小写
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

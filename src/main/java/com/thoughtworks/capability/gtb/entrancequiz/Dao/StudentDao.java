package com.thoughtworks.capability.gtb.entrancequiz.Dao;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
//TODO GTB：大量重复代码，需要进行重构
public class StudentDao {

    List<Student> studentList = new ArrayList<>();
    List<List> studentListList = new ArrayList<>();
    List<Student> studentList1 = new ArrayList<>();
    List<Student> studentList2 = new ArrayList<>();
    List<Student> studentList3 = new ArrayList<>();
    List<Student> studentList4 = new ArrayList<>();
    List<Student> studentList5 = new ArrayList<>();
    List<Student> studentList6 = new ArrayList<>();

    public StudentDao() {
        this.studentList.add(new Student("成吉思汗",1));
        this.studentList.add(new Student("鲁班七号",2));
        this.studentList.add(new Student("太乙真人",3));
        this.studentList.add(new Student("钟无艳",4));
        this.studentList.add(new Student("花木兰",5));
        this.studentList.add(new Student("雅典娜",6));
        this.studentList.add(new Student("芈月",7));
        this.studentList.add(new Student("白起",8));
        this.studentList.add(new Student("刘禅",9));
        this.studentList.add(new Student("庄周",10));
        this.studentList.add(new Student("马超",11));
        this.studentList.add(new Student("刘备",12));
        this.studentList.add(new Student("哪吒",13));
        this.studentList.add(new Student("大乔",14));
        this.studentList.add(new Student("蔡文姬",15));
    }

    public List<Student> getAllRandomstudents() {

        // 洗牌在这里
        Collections.shuffle(studentList);
        return studentList;
    }

    // 返回1，2，3，4，5，6组的总列表
    public List<List> getStudentListList() {
        studentListList.add(studentList1);
        studentListList.add(studentList2);
        studentListList.add(studentList3);
        studentListList.add(studentList4);
        studentListList.add(studentList5);
        studentListList.add(studentList6);
        return studentListList;
    }



}

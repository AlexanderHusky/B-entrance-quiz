package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Dao.StudentDao;
import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentInfo) {
        this.studentDao = studentInfo;
    }

    // 创建学生对象，并添加到list当中
    public void AddStudent() {
        Student student = new Student();
        // 从前端接收到的学生名字
        String name = "从前端接收过来";
        // TODO: 2020/10/13
        // 顺序的数字ID

        // TODO: 2020/10/13
        student.setName(name);

        studentDao.getAllRandomstudents().add(student);
    }

    public List<Student> StudentInfo() {
        return studentDao.getAllRandomstudents();
    }

    public void calculateEachGroupStudentNumber() {
        // 
    }
}

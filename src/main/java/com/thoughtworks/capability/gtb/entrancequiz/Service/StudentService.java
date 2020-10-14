package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Dao.StudentDao;
import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentInfo) {
        this.studentDao = studentInfo;
    }
//TODO GTB: 如果命名足够表意，不实用注释，这些简单的步骤也是能够看懂的
//TODO GTB: 方法名应该是驼峰形式，首字母小写
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

    public List<Integer> calculateEachGroupStudentNumber() {
        /* 计算每一个Group中应该有的人数 */
        List<Integer> eachGroupAllocatedNumberList = new ArrayList();
        int totalStudentNumber = studentDao.getAllRandomstudents().size();
        //TODO GTB：Magic number 6
        int temp = totalStudentNumber % 6;
        int turn = (totalStudentNumber - temp) / 6;
        for(int i=1; i<= temp; i++) {
            eachGroupAllocatedNumberList.add(turn + 1);
        }
        for(int i = 1; i<= 6-temp; i++) {
            eachGroupAllocatedNumberList.add(turn);
        }
        return eachGroupAllocatedNumberList;
    }
}

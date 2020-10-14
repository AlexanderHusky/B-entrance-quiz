package com.thoughtworks.capability.gtb.entrancequiz.Controller;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO GTB：缺少添加学员接口，缺少查找分组接口
@RestController
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    //TODO GTB：按照REST风格，path至少应该指明操作的是什么资源
    //TODO GTB：需求是返回所有排序好的学员信息，而非打乱的
    @GetMapping("/")
    public List<Student> findAll(){
        return service.StudentInfo();
    }
    //TODO GTB：一般path命名不为动词，应该是指定资源名称的名词。可以了解RESTful API规范
    //TODO GTB：这个API提供的功能跟需求不符
    @GetMapping("/calculate")
    public List<Integer> findEachGroupStudentNumber() {
        return service.calculateEachGroupStudentNumber();
    }
}



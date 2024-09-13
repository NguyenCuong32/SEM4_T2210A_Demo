package org.fai.example.spring_boot_example_01.controller;

import org.fai.example.spring_boot_example_01.entity.Student;
import org.fai.example.spring_boot_example_01.entity.StudentClass;
import org.fai.example.spring_boot_example_01.service.IStudentService;
import org.fai.example.spring_boot_example_01.service.StudentClassService;
import org.fai.example.spring_boot_example_01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/api/student")
public class StudentController {

    private final StudentClassService studentClassService;
    private IStudentService studentService;

    public StudentController(IStudentService studentService, StudentClassService studentClassService) {
        this.studentService = studentService;
        this.studentClassService = studentClassService;
    }

    @GetMapping("/getstudents")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students = studentService.getAllStudents();
        return students;
    }

    @GetMapping("/getstudentclass")
    public List<StudentClass> getStudentClass() {
        List<StudentClass> students = new ArrayList<>();
        students = studentClassService.getAllStudentClasses();
        return students;
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }
}

package org.fai.example.spring_boot_example_01.service;

import org.fai.example.spring_boot_example_01.entity.Student;
import org.fai.example.spring_boot_example_01.entity.StudentClass;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();
    void saveStudent(Student student);
    List<StudentClass> getAllStudentClasses();
}

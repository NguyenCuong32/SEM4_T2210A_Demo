package org.fai.example.spring_boot_example_01.service;

import org.fai.example.spring_boot_example_01.dao.IStudentClassRepostitory;
import org.fai.example.spring_boot_example_01.dao.IStudentRepository;
import org.fai.example.spring_boot_example_01.entity.Student;
import org.fai.example.spring_boot_example_01.entity.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {
    private final IStudentRepository studentRepository;
    private final IStudentClassRepostitory studentClassRepostitory;

    @Autowired
    public StudentService(IStudentRepository studentRepository, IStudentClassRepostitory studentClassRepostitory) {
        this.studentRepository = studentRepository;
        this.studentClassRepostitory = studentClassRepostitory;
    }

    @Override
    public List<Student> getAllStudents() {
        var students = studentRepository.findAll();
        return students;
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<StudentClass> getAllStudentClasses() {
        var students = studentClassRepostitory.getAllStudentClassName();
        return students;
    }
}

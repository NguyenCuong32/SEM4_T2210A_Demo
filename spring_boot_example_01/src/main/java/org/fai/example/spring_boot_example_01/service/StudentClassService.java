package org.fai.example.spring_boot_example_01.service;

import org.fai.example.spring_boot_example_01.dao.IStudentClassRepostitory;
import org.fai.example.spring_boot_example_01.entity.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentClassService implements IStudentClassService {
    private final IStudentClassRepostitory studentClassRepostitory;
    @Autowired
    public StudentClassService(IStudentClassRepostitory studentClassRepostitory) {
        this.studentClassRepostitory = studentClassRepostitory;
    }



    @Override
    public List<StudentClass> getAllStudentClasses() {
       var studentClass = this.studentClassRepostitory.getAllStudentClassName();
       return studentClass;
    }
}

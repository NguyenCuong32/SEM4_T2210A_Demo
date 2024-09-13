package org.fai.example.spring_boot_example_01.dao;

import org.fai.example.spring_boot_example_01.entity.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStudentClassRepostitory extends JpaRepository <StudentClass, Long> {
    @Procedure(name = "SP_GET_ALL_STUDENTS")
    List<StudentClass> getAllStudentClassName();
}

package org.fai.example.spring_boot_example_01.dao;

import org.fai.example.spring_boot_example_01.entity.Student;
import org.fai.example.spring_boot_example_01.entity.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Long> {

}

package org.fai.example.spring_boot_example_01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.StoredProcedureParameter;


@Entity
@NamedStoredProcedureQuery(
        name = "SP_GET_ALL_STUDENTS",
        procedureName = "SP_GET_ALL_STUDENTS",
        resultClasses = { StudentClass.class }
)
public class StudentClass {
    private String first_name;
    private String last_name;
    private String class_name;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
}

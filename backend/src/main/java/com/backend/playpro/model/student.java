package com.backend.playpro.model;

import lombok.AllArgsConstructor;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
public class student {
    private String studentId;
    private String studentName;
    private int studentAge;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}

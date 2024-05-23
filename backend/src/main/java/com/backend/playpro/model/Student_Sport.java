package com.backend.playpro.model;

import javax.persistence.Entity;

@Entity
public class Student_Sport {
    private int studentId;
    private int sportId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }
}

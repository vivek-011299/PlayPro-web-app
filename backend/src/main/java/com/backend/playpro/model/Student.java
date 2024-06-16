package com.backend.playpro.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentId;
    @Column(nullable = false)
    private String studentName;
    @Column(nullable = false)
    private int studentAge;


}

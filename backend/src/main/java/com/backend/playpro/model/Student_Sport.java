package com.backend.playpro.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student_Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(nullable = false)
    private int studentId;
    @Column(nullable = false)
    private int sportId;

}

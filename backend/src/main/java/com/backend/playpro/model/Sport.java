package com.backend.playpro.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
public class Sport {
    private int sportId;
    private String sportName;

}

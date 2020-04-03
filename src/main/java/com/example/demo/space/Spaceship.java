package com.example.demo.space;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Spaceship {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Float fuel;
}

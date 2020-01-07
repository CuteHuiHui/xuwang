package com.xw.xuwang.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class EmployeeCopy1 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    public EmployeeCopy1() {
    }

    public EmployeeCopy1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
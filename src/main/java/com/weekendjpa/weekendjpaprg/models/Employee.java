package com.weekendjpa.weekendjpaprg.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    @ManyToOne
    @JoinColumn(name = "dept_id",nullable = false)
    private Department department;

}

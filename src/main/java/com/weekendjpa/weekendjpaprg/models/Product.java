package com.weekendjpa.weekendjpaprg.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;

    @ManyToMany(mappedBy = "productSet")
    private Set<Customer> customerSet;

}

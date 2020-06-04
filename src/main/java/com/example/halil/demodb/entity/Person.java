package com.example.halil.demodb.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity  // you belong to database
@Table(name = "t_person")
public class Person {

    @Id
    public Integer id;

    @NotNull
    private String name;





}

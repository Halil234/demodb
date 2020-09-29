package com.example.halil.demodb.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity  // you belong to database
@Table(name = "t_notes")
public class Notes {

    @Id
    public Integer id;

    public LocalDateTime generate_date;

    public String notes;

    public String title;

    public String owner;

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
}

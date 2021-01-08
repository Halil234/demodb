package com.example.halil.demodb.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity  // you belong to database
@Table(name = "t_notes")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public LocalDateTime generate_date;

    public String notes;

    public String title;

    public String owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notebook_id")
    private NoteBook notebook;

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
}

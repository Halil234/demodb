package com.example.halil.demodb.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity  // you belong to database
@Table(name = "t_notes")
@Builder
@AllArgsConstructor
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public LocalDateTime generate_date;

    public String notes;

    public String title;

    public String owner;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "notebook_id")
    private NoteBook notebook;

    public Notes() {

    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

}

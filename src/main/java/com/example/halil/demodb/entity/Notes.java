package com.example.halil.demodb.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
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
    @JsonBackReference
    private NoteBook notebook;

    public Notes() {

    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notes )) return false;
        return id != null && id.equals(((Notes) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}

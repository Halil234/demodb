package com.example.halil.demodb.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity  // you belong to database
@Table(name = "t_notebook")
public class NoteBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany( mappedBy = "notebook", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Notes> notes = new ArrayList<>();

    public void addNote(Notes note) {
        notes.add(note);
        note.setNotebook(this);
    }

    public void removeNote(Notes note) {
        notes.remove(note);
        note.setNotebook(null);
    }
}

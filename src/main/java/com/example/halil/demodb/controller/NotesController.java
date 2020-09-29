package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.Notes;
import com.example.halil.demodb.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class NotesController {

    @Autowired
    NotesRepository notesRepository;

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/notes",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Notes> getNotes() {

        return notesRepository.findAll();

    }
}

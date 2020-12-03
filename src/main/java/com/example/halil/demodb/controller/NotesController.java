package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.Notes;
import com.example.halil.demodb.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/notesSave",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void saveNotesOne(@RequestBody Map<String,String> body) {
        System.out.printf("Debug 2 this is the post of notes " + body );

        Notes notes = new Notes();
        // get the latestID
        notes.setGenerate_date(LocalDateTime.now());
        notes.setNotes(body.get("notes"));
        notes.setTitle("default title");
        notes.setOwner("default user");

        List<Notes> notesList = new ArrayList<Notes>(Arrays.asList(notes));

        notesRepository.saveAll(notesList);
    }
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/notestitleSave",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void saveNotesTitle(@RequestBody Map<String,String> body) {
        System.out.printf("Debug 2 this is the post of notes " + body );

        Notes notes = new Notes();
        // get the latestID
        notes.setGenerate_date(LocalDateTime.now());
        notes.setNotes(body.get("notes"));
        notes.setTitle(body.get("title"));
        notes.setOwner("default user");

        List<Notes> notesList = new ArrayList<Notes>(Arrays.asList(notes));

        notesRepository.saveAll(notesList);
    }

}

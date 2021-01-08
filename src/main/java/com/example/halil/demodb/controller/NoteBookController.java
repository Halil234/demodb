package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.NoteBook;
import com.example.halil.demodb.entity.Notes;
import com.example.halil.demodb.repository.NoteBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NegativeOrZero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NoteBookController {

    @Autowired
    NoteBookRepository noteBookRepository;

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/notebook",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<NoteBook> getNotes() {

        return noteBookRepository.findAll();

    }
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/savenotebook",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void saveNoteBook(@RequestBody Map<String,String> body) {
        System.out.printf("Debug 2 this is the post of notes " + body );

        NoteBook noteBook = new NoteBook();
        // get the latestID

        noteBook.setName(body.get("name"));
        noteBook.setNotes(null);

        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));

        noteBookRepository.saveAll(notesList);
    }
}

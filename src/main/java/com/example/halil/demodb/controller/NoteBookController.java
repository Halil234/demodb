package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.NoteBook;
import com.example.halil.demodb.entity.Notes;
import com.example.halil.demodb.repository.NoteBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.*;

@RestController
public class NoteBookController {

    @Autowired
    NoteBookRepository noteBookRepository;

    @Autowired
    NotesController notesController;

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
        noteBook.setName(body.get("name"));
        noteBook.setNotes(null);

        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));

        noteBookRepository.saveAll(notesList);
    }
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/savenotebooknotes",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void saveNoteBookNotes(@RequestBody Map<String,String> body) {
        System.out.printf("Debug 2 this is the post of notes " + body );

        NoteBook noteBook = new NoteBook();
        noteBook.setName(body.get("name"));

        // Generate an new Note and add it to the Notebook
        Notes notes = new Notes();
        notes.setGenerate_date(LocalDateTime.now());
        notes.setNotes(body.get("notes"));
        notes.setTitle(body.get("title"));
        notes.setOwner("default user");
        noteBook.addNote(notes);


        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));

        noteBookRepository.saveAll(notesList);

    }
}

package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.NoteBook;
import com.example.halil.demodb.entity.Notes;
import com.example.halil.demodb.repository.NoteBookRepository;
import com.example.halil.demodb.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.swing.text.html.parser.Parser;
import java.time.LocalDateTime;
import java.util.*;

@RestController
public class NoteBookController {

    @Autowired
    NoteBookRepository noteBookRepository;

    @Autowired
    NotesRepository notesRepository;

    @Autowired
    NotesController notesController;

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/notebookget",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<NoteBook> noteBookGet() {

        return noteBookRepository.findAll();

    }
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/notebooksave",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void noteBookSave(@RequestBody Map<String,String> body) {
        logger(body);

        NoteBook noteBook = new NoteBook();
        noteBook.setName(body.get("name"));
        noteBook.setNotes(null);
        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));

        noteBookRepository.saveAll(notesList);
    }

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/notebookaddnotes",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void noteBookAddNotes(@RequestBody Map<String,String> body) {

        Integer noteBookId = Integer.parseInt(body.get("NotebookId"));
        Integer noteId = Integer.parseInt(body.get("NoteId"));
        NoteBook noteBook = new NoteBook();
        Notes notes = new Notes();

        // Get the Entrys in the db
        noteBook =  noteBookRepository.findById(noteBookId).get();
        notes = notesRepository.findById(noteId).get();

        // Move the notes in the Notebook and Save in DB
        noteBook.addNote(notes) ;
        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));
        noteBookRepository.saveAll(notesList);
    }
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/notebookrename",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void noteBookRename(@RequestBody Map<String,String> body) {

        Integer noteBookId = Integer.parseInt(body.get("NotebookId"));
        String notebookName = body.get("NotebookName");
        NoteBook noteBook = new NoteBook();


        // Get the Entrys in the db
        noteBook =  noteBookRepository.findById(noteBookId).get();

        // Set the new Name and Store in the Database
        noteBook.setName(notebookName); ;
        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));
        noteBookRepository.saveAll(notesList);
    }

    private void logger(@RequestBody Map<String, String> body) {
        System.out.printf("Debug 2 this is the post of notes " + body);
    }


}

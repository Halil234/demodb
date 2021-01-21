package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.NoteBook;
import com.example.halil.demodb.entity.Notes;
import com.example.halil.demodb.repository.NoteBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

        // Get the id of needed Note and add it to the Notebook
        int idNote = Integer.parseInt(body.get("notesId"));
        Optional<Notes> notes = notesController.getNotesOne(idNote);

        Notes notesraw ;

        notesraw = notes.get();

        notesraw.setId("100");


        System.out.printf("Debug 2 this is the post of notes !!!!!" + notes.toString() );
        noteBook.setNotes(Collections.singletonList(notesraw));

        List<NoteBook> notesList = new ArrayList<NoteBook>(Arrays.asList(noteBook));

        noteBookRepository.saveAll(notesList);

        System.out.println("Debug 8 " + noteBook.getNotes());
    }
}

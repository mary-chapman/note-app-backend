package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Note;
import com.example.noteappbackend.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/notes")
    public Iterable<Note> findAllNotes () {
        return noteRepository.findAll();
    }

}

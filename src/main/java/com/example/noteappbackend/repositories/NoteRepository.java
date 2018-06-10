package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
    Note findById(String note);
}

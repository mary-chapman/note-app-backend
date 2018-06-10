package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Title;
import com.example.noteappbackend.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    @GetMapping("/titles")
    public Iterable<Title> findAllTitles() {
        return titleRepository.findAll();
    }



}

package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Header;
import com.example.noteappbackend.repositories.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HeaderController {
    @Autowired
    private HeaderRepository headerRepository;

    @GetMapping("/headers")
    public Iterable<Header> findAllHeaders() {
        return headerRepository.findAll();
    }

}

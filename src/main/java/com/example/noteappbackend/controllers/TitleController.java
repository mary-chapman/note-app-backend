package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Title;
import com.example.noteappbackend.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    @GetMapping("/titles")
    public Iterable<Title> findAllTitles() {
        return titleRepository.findAll();
    }

    @GetMapping("{userId}/titles/{titleName}")
    public Iterable<Title> getTitleByName(@PathVariable Long userId, @PathVariable String titleName) {
        return titleRepository.findByUserIdAndText(userId, titleName);
    }

    @DeleteMapping("{userId}/titles/{titleId}")
    public HttpStatus deleteTitleById(@PathVariable Long userId, @PathVariable Long titleId) {
        titleRepository.deleteById(titleId);
        return HttpStatus.OK;
    }
}

package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Title;
import com.example.noteappbackend.models.User;
import com.example.noteappbackend.repositories.TitleRepository;
import com.example.noteappbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;





@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;
    private UserRepository userRepository;

    @GetMapping("/titles")
    public Iterable<Title> findAllTitles() {
        return titleRepository.findAll();
    }

    @GetMapping("{userId}/titles/{titleName}")
    public Iterable<Title> getTitleByName(@PathVariable Long userId, @PathVariable String titleName) {
        return titleRepository.findByUserIdAndText(userId, titleName);
    }

    @DeleteMapping("titles/{titleId}")
    public HttpStatus deleteTitleById(@PathVariable Long titleId) {
        titleRepository.deleteById(titleId);
        return HttpStatus.OK;
    }

    @PostMapping("/titles")
    public Title createNewTitle(@RequestBody Title newTitle) {
        return titleRepository.save(newTitle);
    }

    @PatchMapping("/titles/{titleId}")
    public Title updateUserById(@PathVariable Long titleId, @RequestBody Title titleRequest) {
        Title titleFromDb = titleRepository.findById(titleId).get();
        titleFromDb.setText(titleRequest.getText());
        return titleRepository.save(titleFromDb);
    }

}

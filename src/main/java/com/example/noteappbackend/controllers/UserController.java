package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.User;
import com.example.noteappbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public User getBookById(@PathVariable Long userId) {
        return userRepository.findById(userId).get();
    }

//    @DeleteMapping("/users/{userId}")
//    public HttpStatus deleteUserById(@PathVariable Long userId) {
//        userRepository.deleteById(userId);
//        return HttpStatus.OK;
//    }

//    @DeleteMapping("/users/{userId}/{titleId}")
//    public HttpStatus deleteTitleByUserId(@PathVariable Long userId, @PathVariable Long titleId) {
//        userRepository.deleteById(findByUserIdAndTitle);
//        return HttpStatus.OK;
//    }

}

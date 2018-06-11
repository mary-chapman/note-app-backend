package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Header;
import com.example.noteappbackend.repositories.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HeaderController {
    @Autowired
    private HeaderRepository headerRepository;

    @GetMapping("/headers")
    public Iterable<Header> findAllHeaders() {
        return headerRepository.findAll();
    }

    @GetMapping("/headers/{headerId}")
    public Header getHeaderById(@PathVariable Long headerId) {
        return headerRepository.findById(headerId).get();
    }

    @PostMapping("/headers")
    public Header createNewUser(@RequestBody Header newHeader) {
        return headerRepository.save(newHeader);
    }

    @DeleteMapping("/headers/{headerId}")
    public HttpStatus deleteHeaderById(@PathVariable Long headerId) {
        headerRepository.deleteById(headerId);
        return HttpStatus.OK;
    }

    @PatchMapping("/headers/{headerId}")
    public Header updateHeaderById(@PathVariable Long headerId, @RequestBody Header headerRequest) {

        Header headerFromDb = headerRepository.findById(headerId).get();
        headerFromDb.setText(headerRequest.getText());
        return headerRepository.save(headerFromDb);

    }

}

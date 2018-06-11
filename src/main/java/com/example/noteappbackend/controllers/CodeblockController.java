package com.example.noteappbackend.controllers;

import com.example.noteappbackend.models.Codeblock;
import com.example.noteappbackend.repositories.CodeblockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CodeblockController {
    @Autowired
    private CodeblockRepository codeblockRepository;

    @GetMapping("/codeblocks")
    public Iterable<Codeblock> findAllCodeblocks() {
        return codeblockRepository.findAll();
    }

    @GetMapping("/codeblocks/{codeblockId}")
    public Codeblock getCodeblockById(@PathVariable Long codeblockId) {
        return codeblockRepository.findById(codeblockId).get();
    }

    @DeleteMapping("/codeblocks/{codeblockId}")
    public HttpStatus deleteCodeblockById(@PathVariable Long codeblockId) {
        codeblockRepository.deleteById(codeblockId);
        return HttpStatus.OK;
    }

    @PatchMapping("/codeblocks/{codeblockId}")
    public Codeblock updateUserById(@PathVariable Long codeblockId, @RequestBody Codeblock codeblockRequest) {

        Codeblock codeblockFromDb = codeblockRepository.findById(codeblockId).get();
        codeblockFromDb.setText(codeblockRequest.getText());
        return codeblockRepository.save(codeblockFromDb);
    }

    @PostMapping("/codeblocks")
    public Codeblock createCodeblock(@RequestBody Codeblock newCodeblock) {
        return codeblockRepository.save(newCodeblock);
    }


}

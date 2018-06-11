package com.example.noteappbackend.controllers;


import com.example.noteappbackend.models.Para;
import com.example.noteappbackend.repositories.ParaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ParaController {
    @Autowired
    private ParaRepository paraRepository;

    @GetMapping("/paras")
    public Iterable<Para> findAllUsers() {
        return paraRepository.findAll();
    }

    @GetMapping("/paras/{paraId}")
    public Para getParaById(@PathVariable Long paraId) {
        return paraRepository.findById(paraId).get();
    }

    @DeleteMapping("/paras/{paraId}")
    public HttpStatus deleteParaById(@PathVariable Long paraId) {
        paraRepository.deleteById(paraId);
        return HttpStatus.OK;
    }

    @PatchMapping("/paras/{paraId}")
    public Para updateParaById(@PathVariable Long paraId, @RequestBody Para paraRequest) {

        Para paraFromDb = paraRepository.findById(paraId).get();
        paraFromDb.setText(paraRequest.getText());
        return paraRepository.save(paraFromDb);
    }

    @PostMapping("/paras")
    public Para createNewPara(@RequestBody Para newPara) {
        return paraRepository.save(newPara);
    }


}

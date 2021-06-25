package com.crdmuni.crdmuni.controller;

import com.crdmuni.crdmuni.model.Patrulha;
import com.crdmuni.crdmuni.repository.PatrulhaRepository;
import com.crdmuni.crdmuni.service.PatrulhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/patrulha")

public class PatrulhaController {

    @Autowired
    PatrulhaService patrulhaService;
    @Autowired
    PatrulhaRepository patrulhaRepository;

    @PostMapping
    public Patrulha savePatrulha(@RequestBody Patrulha patrulha){
        System.out.println("New patrulha saved sucessfully");
        return patrulhaService.save(patrulha);
    }

    @GetMapping
    public List<Patrulha> buscarTodas(){
        return patrulhaService.list();
    }

    @GetMapping("/patrulha/{id}")
    public Patrulha getPatrulhaById(@PathVariable Long id){
        return patrulhaRepository.findById(id).get();
    }


    /*
    @DeleteMapping("/patrulha/{id}")
    public void delete(@PathVariable(name="id") Long id){
        patrulhaService.delete(id);
    }*/

}


package com.crdmuni.crdmuni.controller;

import com.crdmuni.crdmuni.model.Called;
import com.crdmuni.crdmuni.repository.CalledRepository;
import com.crdmuni.crdmuni.service.CalledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/called")

public class CalledController {

    @Autowired
    CalledService calledService;
    @Autowired
    CalledRepository calledRepository;


    @PostMapping
    public Called saveCalled(@RequestBody Called called){
        System.out.println("New called saved sucessfully");
        return calledService.save(called);
    }

    @GetMapping

    public List <Called> buscarTodas(){
        return calledService.list();
    }

    @GetMapping("/called/{id}")
    public Called getCalledById(@PathVariable Long id){
        return calledRepository.findById(id).get();
    }


    /*@DeleteMapping("/called/{id}")
    public void delete(@PathVariable(name="id") Long id){
        calledService.delete(id);
    }*/

}

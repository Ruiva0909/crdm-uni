package com.crdmuni.crdmuni.service;


import com.crdmuni.crdmuni.model.Patrulha;
import com.crdmuni.crdmuni.repository.PatrulhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrulhaService {

    @Autowired
    PatrulhaRepository patrulharepository;

    public Patrulha save (Patrulha patrulha ){
        System.out.println("save sucessfully");
        return patrulharepository.save(patrulha);
    }
    public List<Patrulha> list (){
        return patrulharepository.findAll();
    }

    public Patrulha get(Long id){
        return patrulharepository.findById(id).get();
    }

    /*
    public void delete(Long id){
        patrulharepository.deleteById(id);
    }*/
}

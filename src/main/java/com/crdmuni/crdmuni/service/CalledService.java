package com.crdmuni.crdmuni.service;

import com.crdmuni.crdmuni.model.Called;
import com.crdmuni.crdmuni.repository.CalledRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalledService {

    @Autowired
    CalledRepository calledrepository;

    public Called save (Called called){
        System.out.println("save sucessfully");
        return calledrepository.save(called);
    }
    public List<Called> list (){
        return calledrepository.findAll();
    }

   public Called get(Long id){
        return calledrepository.findById(id).get();
   }

   /*
   public void delete(Long id){
        calledrepository.deleteById(id);
   }*/
}

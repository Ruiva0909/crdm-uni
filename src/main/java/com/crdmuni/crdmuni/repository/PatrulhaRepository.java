package com.crdmuni.crdmuni.repository;

import com.crdmuni.crdmuni.model.Patrulha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrulhaRepository extends JpaRepository<Patrulha, Long> {
    //void deleteById();
}

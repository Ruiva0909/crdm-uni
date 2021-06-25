package com.crdmuni.crdmuni.repository;

import com.crdmuni.crdmuni.model.Called;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalledRepository extends JpaRepository<Called, Long> {

    //void deleteById();
}

package com.crdmuni.crdmuni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patrulha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String localizaçao;

    @OneToMany(mappedBy = "patrulha", cascade = CascadeType.ALL)
    private List<Called> called;


}

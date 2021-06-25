package com.crdmuni.crdmuni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Called {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer nChamado;
    private String local;
    private Time horario;
    private Integer timeEstimated;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "id_patrulha", referencedColumnName = "id")
    private Patrulha patrulha;


}

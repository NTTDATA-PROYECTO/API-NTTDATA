package org.example.nttdata.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "planta")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planta")
    private Integer idPlanta;

    @Column(name = "id_sucursal")
    private Integer idSucursal;
}

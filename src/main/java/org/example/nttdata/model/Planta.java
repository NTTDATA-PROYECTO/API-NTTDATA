package org.example.nttdata.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "planta")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planta")
    private Integer idPlanta;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @OneToMany(mappedBy = "planta")
    private List<Sala> salas;

    @OneToMany(mappedBy = "planta")
    private List<PuestoTrabajo> puestosTrabajo;
}

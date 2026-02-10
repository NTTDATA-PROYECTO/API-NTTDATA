package org.example.nttdata.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    private Integer idSala;

    @Column(name = "id_planta")
    private Integer idPlanta;

    @Column(name = "cantidad_asientos")
    private Integer cantidadAsientos;

    private Boolean proyector;
}

package org.example.nttdata.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    private Integer idSala;

    @Column(name = "cantidad_asientos")
    private Integer cantidadAsientos;

    private Boolean proyector;

    @ManyToOne
    @JoinColumn(name = "id_planta")
    private Planta planta;

    @OneToMany(mappedBy = "sala")
    private List<ReservaSala> reservasSala;
}

package org.example.nttdata.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "puesto_trabajo")
public class PuestoTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_puesto")
    private Integer idPuesto;

    @Column(name = "tiene_ordenador")
    private Boolean tieneOrdenador;

    @ManyToOne
    @JoinColumn(name = "id_planta")
    private Planta planta;

    @OneToMany(mappedBy = "puestoTrabajo")
    private List<ReservaPuesto> reservasPuesto;
}

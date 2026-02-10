package org.example.nttdata.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "puesto_trabajo")
public class PuestoTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_puesto")
    private Integer idPuesto;

    @Column(name = "id_planta")
    private Integer idPlanta;

    @Column(name = "tiene_ordenador")
    private Boolean tieneOrdenador;
}

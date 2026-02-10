package org.example.nttdata.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "reserva_puesto")
public class ReservaPuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Integer idReserva;

    @Column(name = "id_puesto")
    private Integer idPuesto;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    private LocalDate fecha;

    @Column(name = "hora_inicio")
    private Time horaInicio;

    @Column(name = "hora_fin")
    private Time horaFin;
}
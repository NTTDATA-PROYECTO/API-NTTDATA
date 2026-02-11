package org.example.nttdata.dto;

import lombok.Data;
import org.example.nttdata.model.Planta;
import org.example.nttdata.model.ReservaPuesto;

import java.util.List;

@Data
public class PuestoTrabajoDTO {
    private Integer idPuesto;
    private Boolean tieneOrdenador;
    private Planta planta;
    private List<ReservaPuesto> reservaPuestos;
}

package org.example.nttdata.dto;

import lombok.Data;
import org.example.nttdata.model.PuestoTrabajo;
import org.example.nttdata.model.Sala;
import org.example.nttdata.model.Sucursal;

import java.util.List;

@Data
public class PlantaDTO {
    private Integer idPlanta;
    private Sucursal sucursal;
    private List<Sala> salas;
    private List<PuestoTrabajo> puestosTrabajo;
}

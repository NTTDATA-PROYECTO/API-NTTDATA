package org.example.nttdata.mapper;

import jdk.jfr.Label;
import org.example.nttdata.dto.PlantaDTO;
import org.example.nttdata.model.Planta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
public class PlantaMapper {

    private final SucursalMapper sucursalMapper;

    @Autowired
    @Lazy
    public PlantaMapper(SucursalMapper sucursalMapper) {
        this.sucursalMapper = sucursalMapper;
    }

    public PlantaDTO toDto(Planta planta) {
        if (planta == null) return null;

        PlantaDTO dto = new PlantaDTO();
        dto.setIdPlanta(planta.getIdPlanta());

        dto.setSucursal(sucursalMapper.toDto(planta.getSucursal()));
        dto.setSalas(planta.getSalas());
        dto.setPuestosTrabajo(planta.getPuestosTrabajo());

//        // Mapeo de las listas de salas y puestos
//        if (planta.getSalas() != null) {
//            dto.setSalas(planta.getSalas().stream()
//                    .map(salaMapper::toDto)
//                    .collect(Collectors.toList()));
//        }
//
//        if (planta.getPuestosTrabajo() != null) {
//            dto.setPuestosTrabajo(planta.getPuestosTrabajo().stream()
//                    .map(puestoMapper::toDto)
//                    .collect(Collectors.toList()));
//        }

        return dto;
    }
}

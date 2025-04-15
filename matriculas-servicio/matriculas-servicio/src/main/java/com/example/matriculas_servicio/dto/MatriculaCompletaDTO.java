package com.example.matriculas_servicio.dto;

import com.example.matriculas_servicio.model.Matricula;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MatriculaCompletaDTO {
    private Matricula matricula;
    private Usuario usuario;
    private Asignatura asignatura;
}

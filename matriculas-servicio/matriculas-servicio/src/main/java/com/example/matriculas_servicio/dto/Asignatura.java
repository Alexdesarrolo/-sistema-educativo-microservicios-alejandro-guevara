package com.example.matriculas_servicio.dto;

import lombok.Data;

@Data
public class Asignatura {
    private Long id;
    private String nombre;
    private String codigo;
    private int creditos;
}

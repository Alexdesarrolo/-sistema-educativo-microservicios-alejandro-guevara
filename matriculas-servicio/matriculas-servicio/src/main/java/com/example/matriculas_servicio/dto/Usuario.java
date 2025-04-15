package com.example.matriculas_servicio.dto;

import lombok.Data;

@Data
public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private String rol;
}

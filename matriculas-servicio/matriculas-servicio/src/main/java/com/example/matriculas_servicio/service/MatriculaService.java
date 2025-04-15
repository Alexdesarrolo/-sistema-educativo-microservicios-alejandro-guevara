package com.example.matriculas_servicio.service;

import java.util.List;

import com.example.matriculas_servicio.dto.MatriculaCompletaDTO;
import com.example.matriculas_servicio.model.Matricula;

public interface MatriculaService {
    Matricula guardar(Matricula m);
    List<Matricula> listar();
    MatriculaCompletaDTO obtenerCompleta(Long id);
}
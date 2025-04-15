package com.example.asignaturas_servicio.service;

import java.util.List;

import com.example.asignaturas_servicio.model.Asignatura;

public interface AsignaturaService {
    Asignatura guardar(Asignatura asignatura);
    List<Asignatura> obtenerTodas();
    Asignatura obtenerPorId(Long id);
    void eliminar(Long id);
}

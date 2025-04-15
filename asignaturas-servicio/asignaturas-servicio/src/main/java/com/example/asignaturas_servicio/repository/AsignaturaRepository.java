package com.example.asignaturas_servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asignaturas_servicio.model.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}

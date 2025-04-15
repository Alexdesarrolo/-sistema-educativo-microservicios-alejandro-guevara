package com.example.matriculas_servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.matriculas_servicio.model.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}

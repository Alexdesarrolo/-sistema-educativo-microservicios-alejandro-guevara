package com.example.matriculas_servicio.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.matriculas_servicio.dto.Asignatura;

@FeignClient(name = "asignaturas-servicio")
public interface AsignaturaClient {

    @GetMapping("/api/asignaturas/{id}")
    Asignatura obtenerAsignatura(@PathVariable Long id);
}

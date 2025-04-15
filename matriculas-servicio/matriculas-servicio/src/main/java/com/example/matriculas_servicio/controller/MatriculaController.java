package com.example.matriculas_servicio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.matriculas_servicio.dto.MatriculaCompletaDTO;
import com.example.matriculas_servicio.model.Matricula;
import com.example.matriculas_servicio.service.MatriculaService;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @PostMapping
    public Matricula crear(@RequestBody Matricula m) {
        return service.guardar(m);
    }

    @GetMapping
    public List<Matricula> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public MatriculaCompletaDTO obtener(@PathVariable Long id) {
        return service.obtenerCompleta(id);
    }
}

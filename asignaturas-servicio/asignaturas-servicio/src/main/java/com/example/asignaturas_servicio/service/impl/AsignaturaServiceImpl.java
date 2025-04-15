package com.example.asignaturas_servicio.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.asignaturas_servicio.model.Asignatura;
import com.example.asignaturas_servicio.repository.AsignaturaRepository;
import com.example.asignaturas_servicio.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    private final AsignaturaRepository asignaturaRepository;

    public AsignaturaServiceImpl(AsignaturaRepository asignaturaRepository) {
        this.asignaturaRepository = asignaturaRepository;
    }

    @Override
    public Asignatura guardar(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public List<Asignatura> obtenerTodas() {
        return asignaturaRepository.findAll();
    }

    @Override
    public Asignatura obtenerPorId(Long id) {
        return asignaturaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        asignaturaRepository.deleteById(id);
    }
}

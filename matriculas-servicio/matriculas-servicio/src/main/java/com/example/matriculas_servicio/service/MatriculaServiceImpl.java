package com.example.matriculas_servicio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.matriculas_servicio.client.AsignaturaClient;
import com.example.matriculas_servicio.client.UsuarioClient;
import com.example.matriculas_servicio.dto.MatriculaCompletaDTO;
import com.example.matriculas_servicio.model.Matricula;
import com.example.matriculas_servicio.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    private final MatriculaRepository repo;
    private final UsuarioClient usuarioClient;
    private final AsignaturaClient asignaturaClient;

    public MatriculaServiceImpl(MatriculaRepository repo, UsuarioClient usuarioClient, AsignaturaClient asignaturaClient) {
        this.repo = repo;
        this.usuarioClient = usuarioClient;
        this.asignaturaClient = asignaturaClient;
    }

    @Override
    public Matricula guardar(Matricula m) {
        return repo.save(m);
    }

    @Override
    public List<Matricula> listar() {
        return repo.findAll();
    }

    @Override
    public MatriculaCompletaDTO obtenerCompleta(Long id) {
        Matricula m = repo.findById(id).orElseThrow();
        return new MatriculaCompletaDTO(m,
                usuarioClient.obtenerUsuario(m.getUsuarioId()),
                asignaturaClient.obtenerAsignatura(m.getAsignaturaId()));
    }
}

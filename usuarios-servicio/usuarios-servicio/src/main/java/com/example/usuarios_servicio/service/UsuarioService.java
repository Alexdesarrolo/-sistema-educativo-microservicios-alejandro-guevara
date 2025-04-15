package com.example.usuarios_servicio.service;

import java.util.List;

import com.example.usuarios_servicio.model.Usuario;

public interface UsuarioService {
    Usuario guardarUsuario(Usuario usuario);
    List<Usuario> obtenerTodos();
    Usuario obtenerPorId(Long id);
    void eliminarUsuario(Long id);
}

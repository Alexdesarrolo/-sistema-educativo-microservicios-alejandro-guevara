package com.example.usuarios_servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usuarios_servicio.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}

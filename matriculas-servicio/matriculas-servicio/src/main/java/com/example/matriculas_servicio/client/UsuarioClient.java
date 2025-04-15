package com.example.matriculas_servicio.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.matriculas_servicio.dto.Usuario;

@FeignClient(name = "usuarios-servicio")
public interface UsuarioClient {

    @GetMapping("/api/usuarios/{id}")
    Usuario obtenerUsuario(@PathVariable Long id);
}

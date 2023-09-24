package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public VIagensDioApplication.Usuario registrarUsuario(@RequestBody VIagensDioApplication.Usuario usuario) {
        return usuarioService.registrarUsuario(usuario);

    }
}
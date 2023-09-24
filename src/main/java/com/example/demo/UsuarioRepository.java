package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public class UsuarioRepository {
    public VIagensDioApplication.Usuario save(VIagensDioApplication.Usuario usuario) {
        return usuario;
    }

    public boolean existsByEmail(String email) {
        return false;
    }

    public interface UsuarioReposito extends JpaRepository<VIagensDioApplication.Usuario, Long> {
        boolean existsByEmail(String email);

    }

}
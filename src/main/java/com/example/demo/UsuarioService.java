package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public VIagensDioApplication.Usuario criarUsuario(VIagensDioApplication.Usuario usuario) {
        // Verifique se o e-mail já está cadastrado
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("E-mail já cadastrado");
        }

        // Salve o usuário no banco de dados
        return usuarioRepository.save(usuario);
    }

    public VIagensDioApplication.Usuario registrarUsuario(VIagensDioApplication.Usuario usuario) {
        // Validação de campos obrigatórios
        if (usuario.getNome() == null || usuario.getNome().isEmpty() ||
                usuario.getEmail() == null || usuario.getEmail().isEmpty() ||
                usuario.getSenha() == null || usuario.getSenha().isEmpty()) {
            throw new RuntimeException("Todos os campos são obrigatórios");
        }

        // Chame o método criarUsuario para salvar o usuário
        return criarUsuario(usuario);
    }
}

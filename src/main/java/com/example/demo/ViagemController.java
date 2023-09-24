package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ViagemController {
    @Autowired
    private ViagemService viagemService;

    @GetMapping
    public List<VIagensDioApplication.Viagem> listarViagens() {
        return viagemService.listarViagens();
    }

    @PostMapping
    public VIagensDioApplication.Viagem criarViagem(@RequestBody VIagensDioApplication.Viagem viagem) {
        return viagemService.criarViagem(String.valueOf(viagem));
    }
}
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ViagemService {
    @Autowired
    private ViagemRepository viagemRepository;

    public VIagensDioApplication.Viagem criarViagem(String destino) {
        VIagensDioApplication.Viagem viagem = new VIagensDioApplication.Viagem();
        viagem.setDestino(destino);
        return viagemRepository.save(viagem);
    }

    public VIagensDioApplication.Viagem obterViagemPorId(Long id) {
        return viagemRepository.findById(id).orElse(null);
    }

    public void associarReservaAViagem(VIagensDioApplication.Viagem viagem, Reserva reserva) {
        viagem.setReserva(reserva);
        reserva.setViagem(viagem);
        viagemRepository.save(viagem);
    }

    public List<VIagensDioApplication.Viagem> listarViagens() {
        return viagemRepository.findAll();

    }
}
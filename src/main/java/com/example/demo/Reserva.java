package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private VIagensDioApplication.Viagem viagem;
    @ManyToOne
    private VIagensDioApplication.Usuario usuario;
    private int quantidadePessoas;

    public void setViagem(VIagensDioApplication.Viagem viagem) {
    }
}

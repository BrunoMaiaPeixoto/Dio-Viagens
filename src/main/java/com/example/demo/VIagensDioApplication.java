package com.example.demo;

import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class VIagensDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(VIagensDioApplication.class, args);
	}
	@Entity
	public static class Viagem {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String destino;
		private LocalDate dataPartida;
		private double preco;

		private Reserva reserva;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public LocalDate getDataPartida() {
			return dataPartida;
		}

		public void setDataPartida(LocalDate dataPartida) {
			this.dataPartida = dataPartida;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public Reserva getReserva() {
			return reserva;
		}

		public void setReserva(Reserva reserva) {
			this.reserva = reserva;
		}
	}

	@Entity
	public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		private String email;
		private String senha;
		public Usuario() {}

		public Usuario(String nome, String email, String senha) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	}
}


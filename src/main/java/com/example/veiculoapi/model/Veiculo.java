package com.example.veiculoapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Placa não pode ser vazia")
    private String placa;

    @NotBlank(message = "Marca não pode ser vazia")
    private String marca;

    @NotBlank(message = "Modelo não pode ser vazio")
    private String modelo;

    @NotBlank(message = "Ano não pode ser vazio")
    private String ano;

    @NotBlank(message = "CPF não pode ser vazio")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter 11 dígitos numéricos")
    private String cpf;

    public Veiculo() {}

    public Veiculo(String placa, String marca, String modelo, String ano, String cpf) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cpf = cpf;
    }

    // Getters e Setters
}

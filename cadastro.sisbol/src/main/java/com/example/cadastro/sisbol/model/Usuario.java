package com.example.cadastro.sisbol.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "6rm")
@Data
public class Usuario {

    @Id
    @Column(length = 15, unique = true, nullable = false )
    private String ip;

    @Column(length = 17, nullable = false)
    private String macaddress;

    @Column(length = 50, nullable = false)
    private String hostname;

    @Column(length = 200, nullable = false)
    private String nomecompleto;

    @Column(length = 10, nullable = false)
    private String posto_grad;

    @Column(length = 11, nullable = false)
    private String cpf;

    @Column(length = 1, nullable = false)
    private String lna;

}

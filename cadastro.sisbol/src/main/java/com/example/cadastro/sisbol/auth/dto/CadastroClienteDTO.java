package com.example.cadastro.sisbol.auth.dto;

import lombok.Data;

import java.util.Set;

@Data
public class CadastroClienteDTO {

    private String username;
    private String password;
    private Set<String> perfis;
}

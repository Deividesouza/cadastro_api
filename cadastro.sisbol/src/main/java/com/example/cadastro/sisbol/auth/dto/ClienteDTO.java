package com.example.cadastro.sisbol.auth.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ClienteDTO {
    private String username;
    private Set<String> perfis;
}

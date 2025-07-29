package com.example.cadastro.sisbol.domain.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class UsuarioDTO {

    @NotBlank
    @Size(max = 15)
    private String ip;

    @NotBlank
    @Size(max = 17)
    private String macaddress;

    @NotBlank
    @Size(max = 50)
    private String hostname;

    @NotBlank
    @Size(max = 200)
    private String nomecompleto;

    @NotBlank
    @Size(max = 10)
    private String posto_grade;

    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    @Size(max = 1)
    private String lna;

}

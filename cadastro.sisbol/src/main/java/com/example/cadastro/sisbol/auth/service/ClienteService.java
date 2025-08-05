package com.example.cadastro.sisbol.auth.service;

import com.example.cadastro.sisbol.auth.dto.CadastroClienteDTO;
import com.example.cadastro.sisbol.auth.dto.ClienteDTO;

import java.util.List;

public interface ClienteSerivce {
    ClienteDTO criar (CadastroClienteDTO dto);
    List<ClienteDTO> listarTodos();
    ClienteDTO buscarPorUsername(String username);
    ClienteDTO atualizar(String username, CadastroClienteDTO dto);
    void deletar(String username);
}

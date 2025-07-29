package com.example.cadastro.sisbol.domain.service;

import com.example.cadastro.sisbol.domain.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO salvar(UsuarioDTO dto);
    List<UsuarioDTO> listarTodos();
    UsuarioDTO buscarPorIp(String ip);
    void deletarPorIp(String ip);
}


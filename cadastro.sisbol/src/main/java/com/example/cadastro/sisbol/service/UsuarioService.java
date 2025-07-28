package com.example.cadastro.sisbol.service;

import com.example.cadastro.sisbol.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO salvar(UsuarioDTO dto);
    List<UsuarioDTO> listarTodos();
    UsuarioDTO buscarPorIp(String ip);
    void deletarPorIp(String ip);
}


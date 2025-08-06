package com.example.cadastro.sisbol.controller;

import com.example.cadastro.sisbol.domain.dto.UsuarioDTO;
import com.example.cadastro.sisbol.domain.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping("/cadastrar")
    public UsuarioDTO criar(@RequestBody @Valid UsuarioDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{ip}")
    public UsuarioDTO buscarPorIp(@PathVariable String ip) {
        return service.buscarPorIp(ip);
    }

    @DeleteMapping("/{ip}")
    public void deletar(@PathVariable String ip) {
        service.deletarPorIp(ip);
    }
}

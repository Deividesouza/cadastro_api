package com.example.cadastro.sisbol.controller;

import com.example.cadastro.sisbol.auth.dto.CadastroClienteDTO;
import com.example.cadastro.sisbol.auth.dto.ClienteDTO;
import com.example.cadastro.sisbol.auth.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/cadastro")
    public ClienteDTO criar(@RequestBody CadastroClienteDTO dto) {
        return clienteService.criar(dto);
    }

    @GetMapping
    public List<ClienteDTO> listar() {
        return clienteService.listarTodos();
    }

    @GetMapping("/{username}")
    public ClienteDTO buscar(@PathVariable String username) {
        return clienteService.buscarPorUsername(username);
    }

    @PutMapping("/{username}")
    public ClienteDTO atualizar(@PathVariable String username, @RequestBody CadastroClienteDTO dto) {
        return clienteService.atualizar(username, dto);
    }

    @DeleteMapping("/{username}")
    public void deletar(@PathVariable String username) {
        clienteService.deletar(username);
    }

}
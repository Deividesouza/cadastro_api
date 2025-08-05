package com.example.cadastro.sisbol.auth.service;

import com.example.cadastro.sisbol.auth.dto.CadastroClienteDTO;
import com.example.cadastro.sisbol.auth.dto.ClienteDTO;
import com.example.cadastro.sisbol.auth.entity.Cliente;
import com.example.cadastro.sisbol.auth.entity.Perfil;
import com.example.cadastro.sisbol.auth.repository.ClienteRepository;
import com.example.cadastro.sisbol.auth.repository.PerfilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final PerfilRepository perfilRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public ClienteDTO criar(CadastroClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setUsername(dto.getUsername());
        cliente.setPassword(passwordEncoder.encode(dto.getPassword()));
        cliente.setPerfis(buscarPerfis(dto.getPerfis()));
        clienteRepository.save(cliente);
        return mapToDto(cliente);
    }

    @Override
    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll().stream()
                .map(this::mapToDto)
                .toList();
    }

    @Override
    public ClienteDTO buscarPorUsername(String username) {
        Cliente cliente = clienteRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        return mapToDto(cliente);
    }

    @Override
    public ClienteDTO atualizar(String username, CadastroClienteDTO dto) {
        Cliente cliente = clienteRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        cliente.setPassword(passwordEncoder.encode(dto.getPassword()));
        cliente.setPerfis(buscarPerfis(dto.getPerfis()));
        clienteRepository.save(cliente);
        return mapToDto(cliente);
    }

    @Override
    public void deletar(String username) {
        clienteRepository.deleteById(username);
    }

    private ClienteDTO mapToDto(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setUsername(cliente.getUsername());
        dto.setPerfis(cliente.getPerfis()
                .stream().map(Perfil::getNome).collect(Collectors.toSet()));
        return dto;
    }

    private Set<Perfil> buscarPerfis(Set<String> nomes) {
        return nomes.stream()
                .map(nome -> perfilRepository.findByNome(nome)
                        .orElseThrow(() -> new RuntimeException("Perfil não encontrado: " + nome)))
                .collect(Collectors.toSet());
    }
}

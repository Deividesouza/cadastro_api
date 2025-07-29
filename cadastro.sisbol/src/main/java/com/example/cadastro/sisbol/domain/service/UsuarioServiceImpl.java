package com.example.cadastro.sisbol.service;

import com.example.cadastro.sisbol.dto.UsuarioDTO;
import com.example.cadastro.sisbol.mapper.UsuarioMapper;
import com.example.cadastro.sisbol.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor // Lombok injeta os campos finais automaticamente
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    @Override
    public UsuarioDTO salvar(UsuarioDTO dto) {
        var usuario = UsuarioMapper.toEntity(dto);
        return UsuarioMapper.toDTO(repository.save(usuario));
    }

    @Override
    public List<UsuarioDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(UsuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO buscarPorIp(String ip) {
        var usuario = repository.findById(ip).orElseThrow();
        return UsuarioMapper.toDTO(usuario);
    }

    @Override
    public void deletarPorIp(String ip) {
        repository.deleteById(ip);
    }
}

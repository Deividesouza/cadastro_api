package com.example.cadastro.sisbol.mapper;

import com.example.cadastro.sisbol.dto.UsuarioDTO;
import com.example.cadastro.sisbol.model.Usuario;
import lombok.experimental.UtilityClass;

@UtilityClass // Lombok transforma em classe de utilitários (sem construtor)
public class UsuarioMapper {

    public Usuario toEntity(UsuarioDTO dto) {
        Usuario u = new Usuario();
        u.setIp(dto.getIp());
        u.setMacaddress(dto.getMacaddress());
        u.setHostname(dto.getHostname());
        u.setNomecompleto(dto.getNomecompleto());
        u.setPosto_grad(dto.getPosto_grade());
        u.setCpf(dto.getCpf());
        u.setLna(dto.getLna());
        return u;
    }

    public UsuarioDTO toDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setIp(entity.getIp());
        dto.setMacaddress(entity.getMacaddress());
        dto.setHostname(entity.getHostname());
        dto.setNomecompleto(entity.getNomecompleto());
        dto.setPosto_grade(entity.getPosto_grad());
        dto.setCpf(entity.getCpf());
        dto.setLna(entity.getLna());
        return dto;
    }
}

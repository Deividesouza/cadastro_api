package com.example.cadastro.sisbol.domain.repository;

import com.example.cadastro.sisbol.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}

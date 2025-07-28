package com.example.cadastro.sisbol.repository;

import com.example.cadastro.sisbol.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}

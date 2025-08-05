package com.example.cadastro.sisbol.auth.repository;

import com.example.cadastro.sisbol.auth.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    Optional<Cliente> findByUsername(String username);
}

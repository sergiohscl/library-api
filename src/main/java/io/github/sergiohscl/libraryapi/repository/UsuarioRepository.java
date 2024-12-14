package io.github.sergiohscl.libraryapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.sergiohscl.libraryapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{
    
    Usuario findByLogin(String login);

    Usuario findByEmail(String email);
}

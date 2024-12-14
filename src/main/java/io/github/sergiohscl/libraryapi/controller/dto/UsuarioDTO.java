package io.github.sergiohscl.libraryapi.controller.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDTO(
    @NotBlank(message = "campo obrigatorio")
    String login,

    @Email (message = "inválido")
    @NotBlank(message = "campo obrigatorio")
    String email,
    
    @NotBlank(message = "campo obrigatorio")
    String senha,
    List<String> roles) {
}
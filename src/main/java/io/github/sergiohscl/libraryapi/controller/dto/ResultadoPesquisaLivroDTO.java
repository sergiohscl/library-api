package io.github.sergiohscl.libraryapi.controller.dto;

import io.github.sergiohscl.libraryapi.model.GeneroLivro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record ResultadoPesquisaLivroDTO(
    UUID id,
    String isbn,
    String titulo,
    LocalDate dataPublicacao,
    GeneroLivro genero,
    BigDecimal preco,
    AutorDTO autor
) {

}
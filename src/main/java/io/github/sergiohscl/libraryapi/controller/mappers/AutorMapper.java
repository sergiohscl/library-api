package io.github.sergiohscl.libraryapi.controller.mappers;

import io.github.sergiohscl.libraryapi.controller.dto.AutorDTO;
import io.github.sergiohscl.libraryapi.model.Autor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AutorMapper {

    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "dataNascimento", target = "dataNascimento")
    @Mapping(source = "nacionalidade", target = "nacionalidade")
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "dataCadastro", ignore = true)
    @Mapping(target = "usuario", ignore = true)
    @Mapping(target = "livros", ignore = true)
    Autor toEntity(AutorDTO dto);

    AutorDTO toDTO(Autor autor);
}
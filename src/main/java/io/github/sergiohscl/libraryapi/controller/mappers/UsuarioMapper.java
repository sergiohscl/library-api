package io.github.sergiohscl.libraryapi.controller.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import io.github.sergiohscl.libraryapi.controller.dto.UsuarioDTO;
import io.github.sergiohscl.libraryapi.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    Usuario toEntity(UsuarioDTO dto);
}

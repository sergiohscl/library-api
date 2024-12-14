package io.github.sergiohscl.libraryapi.controller.mappers;

import io.github.sergiohscl.libraryapi.controller.dto.CadastroLivroDTO;
import io.github.sergiohscl.libraryapi.controller.dto.ResultadoPesquisaLivroDTO;
import io.github.sergiohscl.libraryapi.model.Livro;
import io.github.sergiohscl.libraryapi.repository.AutorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = AutorMapper.class )
public abstract class LivroMapper {

    @Autowired
    AutorRepository autorRepository;

    @Mapping(target = "autor", expression = "java( autorRepository.findById(dto.idAutor()).orElse(null) )")
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "dataCadastro", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "usuario", ignore = true)
    public abstract Livro toEntity(CadastroLivroDTO dto);

    public abstract ResultadoPesquisaLivroDTO toDTO(Livro livro);
}

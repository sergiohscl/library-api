package io.github.sergiohscl.libraryapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import io.github.sergiohscl.libraryapi.controller.dto.UsuarioDTO;
import io.github.sergiohscl.libraryapi.controller.mappers.UsuarioMapper;
import io.github.sergiohscl.libraryapi.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;
    private final UsuarioMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid UsuarioDTO dto){
        var usuario = mapper.toEntity(dto);
        service.salvar(usuario);
    }
}

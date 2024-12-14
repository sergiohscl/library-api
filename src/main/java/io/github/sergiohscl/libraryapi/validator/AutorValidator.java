package io.github.sergiohscl.libraryapi.validator;

import java.util.Optional;

import org.springframework.stereotype.Component;

import io.github.sergiohscl.libraryapi.exceptions.RegistroDuplicadoException;
import io.github.sergiohscl.libraryapi.model.Autor;
import io.github.sergiohscl.libraryapi.repository.AutorRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AutorValidator {

    private final AutorRepository repository;

    public void validar(Autor autor){
        if(existeAutorCadastrado(autor)){
            throw new RegistroDuplicadoException("Autor já cadastrado!");
        }
    }

    private boolean existeAutorCadastrado(Autor autor){
        Optional<Autor> autorEncontrado = repository.findByNomeAndDataNascimentoAndNacionalidade(
                autor.getNome(), autor.getDataNascimento(), autor.getNacionalidade()
        );

        if(autor.getId() == null){
            return autorEncontrado.isPresent() ;
        }

        return !autor.getId().equals(autorEncontrado.get().getId()) && autorEncontrado.isPresent();
    }

}

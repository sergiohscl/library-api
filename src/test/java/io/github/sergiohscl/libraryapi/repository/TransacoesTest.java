package io.github.sergiohscl.libraryapi.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.sergiohscl.libraryapi.service.TransacaoService;

@SpringBootTest
public class TransacoesTest {

    @Autowired
    TransacaoService transacaoService;

    /**
     * Commit -> confirmar as alterações
     * Rollback -> desfazer as alterações
     */
    @Test
    void transacaoSimples(){
        transacaoService.executar();
    }

    @Test
    void transacaoEstadoManaged(){
        transacaoService.atualizacaoSemAtualizar();
    }
}
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.demo.Models.Usuario;

@TestInstance(Lifecycle.PER_CLASS)
public class UsuarioTestes {
    private Usuario user;

    @BeforeAll
    public void userCreate(){
        user = new Usuario("guilherme_q_sassi@estudante.sesisenai.com.br", "EssaSenhaEBoa", "88113335");
    }
    @Test
    public void userEmailPadrao(){
        assertTrue(user.verificarEmailPadrao());
    }
    @Test
    public void userCepPadrao(){
        assertTrue(user.verificarCepPadrao());
    }
    @Test
    public void userCadastro(){
        assertTrue(user.cadastrarUsuario());
    }
    @Test
    public void userPasswordEquals(){
        assertTrue(user.passwordEquals("EssaSenhaEBoa"));
    }

}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.demo.Models.Login;

@TestInstance(Lifecycle.PER_CLASS)
public class TesteLogin {
    protected Login login;
    @BeforeAll
    public void criarConta(){
        login = new Login("user@gmail.com", "FabioPorchat");
    }

    @Test
    public void TestarAcesso(){
        assertTrue(login.tryLogin("user@gmail.com", "FabioPorchat"));
    }
    @Test
    public void TestarAcessoNegado(){
        assertFalse(login.tryLogin("user@gmail.com", "ValescaPopozuda"));
    }
    @Test
    public void TestarCadastro(){
        assertTrue(login.cadUser());
    }
    @Test
    public void TestarLogout(){
        assertTrue(login.LogOut());
    }
}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.demo.Models.Calculadora;

@TestInstance(Lifecycle.PER_CLASS)
public class TesteCalculadora {
    private Calculadora calculadora;
    @BeforeAll
    public void CriarClasse(){
        calculadora = new Calculadora((float)10, (float) 5);
    }
    @Test
    public void Soma(){
        assertEquals(15, calculadora.Somar());
    }
    @Test
    public void Subtrair(){
        assertEquals(5, calculadora.Subtrair());
    }
    @Test
    public void Multiplicar(){
        assertEquals(50, calculadora.Multiplicar());
    }
    @Test
    public void Dividir(){
        assertEquals(2, calculadora.Dividir());
    }
}

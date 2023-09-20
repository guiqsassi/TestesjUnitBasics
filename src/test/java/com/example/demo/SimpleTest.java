package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
public class SimpleTest{
    protected String nome;
    protected Integer conta;

    @Test
    void testEquals(){
        nome = "Maria";

        assertEquals(nome, "Maria");
    }

    protected Integer num;
    protected Integer number;
    
    @BeforeAll
    void testAdd(){
        num = 10;
        number = 20;
         conta = num + number;
        }

    @Test
    void teste(){
        assertEquals(conta, 30);
    }

}

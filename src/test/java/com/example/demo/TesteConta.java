package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.demo.Models.ContaCorrente;


@TestInstance(Lifecycle.PER_CLASS)
public class TesteConta {
    protected ContaCorrente Conta1;
    protected ContaCorrente Conta2;
    @BeforeAll
    public void CreateUser(){
        Conta1 = new ContaCorrente((float) 200, "Maria" );
        Conta2 = new ContaCorrente((float) 100, "José" );


    }
    @Test
    public void saldoEquals(){
        assertFalse(Conta1.getBalance() == Conta2.getBalance());
    }
    @Test
    public void isNull(){
        assertNotNull(Conta1);
        assertNotNull(Conta2);
    }

    @Test
    public void saqueCheque(){
        Conta1.saque((float) 100);
        assertEquals(Conta1.getBalance(), Conta2.getBalance());
    }
    @Test
    public void saqueDeposito(){
        Conta2.deposito((float) 50);
        assertEquals(Conta1.getBalance()-50, Conta2.getBalance());
    }
    @Test
    public void testeSaqueMenor(){
        assertTrue(Conta1.saque((float)50));
    }
    @Test
    public void testeSaqueMaior(){
        assertFalse(Conta1.saque((float)300));
    }
}

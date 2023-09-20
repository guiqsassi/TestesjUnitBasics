package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.demo.Models.Geometria;

@TestInstance(Lifecycle.PER_CLASS)
public class GeometriaTestes {
    @Test
    public void AreaTrianguloTeste(){
        assertEquals(Geometria.areaTriangulo((float) 6, (float) 5) , 15);
    }
    @Test
    public void areaQuadradoTeste(){
        assertEquals(Geometria.areaQuadrado((float) 5) , 25);
    }
    @Test
    public void areaRetanguloTeste(){
        assertEquals(Geometria.areaRetangulo((float) 5, (float) 10) , 50);
    }
    @Test
    public void areaCircunferenciaTeste(){
        assertEquals(Geometria.areaCircunferencia((double) 2) , 12);
    }
    @Test
    public void volumeEsferaTeste(){
        assertEquals(Geometria.volumeEsfera((double) 2) , 33);
    }
    @Test
    public void volumeCuboTeste(){
        assertEquals(Geometria.volumeCubo((double) 3) , 27);
    }
    @Test
    public void volumeCilindroTeste(){
        assertEquals(Geometria.volumeCilindro((double) 3 ,(float)3) , 81);
    }
}

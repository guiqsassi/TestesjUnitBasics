package com.example.demo.Models;

public class Geometria {
    public Geometria() {
    }
    public static Float areaTriangulo(Float b, Float h){
        return (b * h) /2;
    }
    public static Float areaQuadrado(Float b){
        return (b * b); 
    }
    public static Float areaRetangulo(Float b, Float B){
        return (b * B); 
    }
    public static Integer areaCircunferencia(Double r){
        return (int) ((Math.PI) * (r* r)); 
    }
    public static Integer volumeEsfera(Double r){
        return (int) (4*(float)Math.PI * (float)Math.pow( r,  3))/3 ; 
    }
    public static Float volumeCubo(Double a){
        return (float)Math.pow( a, 3) ; 
    }
    public static Float volumeCilindro(Double r, Float h){
        return (int) ((float)Math.PI) *(float) Math.pow(r, 2) * h ; 
    }
}

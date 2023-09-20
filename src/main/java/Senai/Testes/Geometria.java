package Senai.Testes;

public class Geometria {
    public Float areaTriangulo(Float b, Float h){
        return (b * h) /2;
    }
    public Float areaQuadrado(Float b){
        return (b * b); 
    }
    public Float areaRetangulo(Float b, Float B){
        return (b * B); 
    }
    public Float areaCircunferencia(Float r){
        return ((float)Math.PI) * (r* r); 
    }
    public Float volumeEsfera(Double r){
        return (4*(float)Math.PI * (float)Math.pow( r,  3))/3 ; 
    }
    public Float volumeCubo(Double a){
        return (float)Math.pow( a, 3) ; 
    }
    public Float volumeCilindro(Double r, Float h){
        return (int) ((float)Math.PI) *(float) Math.pow(r, 2) * h ; 
    }
}

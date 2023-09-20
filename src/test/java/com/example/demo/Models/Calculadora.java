package com.example.demo.Models;

public class Calculadora {
    private Float number1;
    private Float number2;
    public Float getNumber1() {
        return number1;
    }
    public void setNumber1(Float number1) {
        this.number1 = number1;
    }
    public Float getNumber2() {
        return number2;
    }
    public void setNumber2(Float number2) {
        this.number2 = number2;
    }
    public Calculadora(Float number1, Float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Calculadora(){}

    public Float Somar(){
        return number1 + number2;
    }

    public Float Subtrair(){
        return number1 - number2;
    }

    public Float Dividir(){
        return number1 / number2;
    }

    public Float Multiplicar(){
        return number1 * number2;
    }
}

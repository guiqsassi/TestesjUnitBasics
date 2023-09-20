package com.example.demo.Models;

public class ContaCorrente {
    protected Float balance;
    protected String nome;

    

    public ContaCorrente(Float balance, String nome) {
        this.balance = balance;
        this.nome = nome;
    }

    public Float getBalance() {
        return balance;
    }
    public void setBalance(Float balance) {
        this.balance = balance;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(Float valor){
        this.balance =+ valor;
        
    }   
    public Boolean saque(Float valor){
        if(this.balance >= valor){
            this.balance -= valor;
            return true;
        }
        else{
            return false;
        }

    }   
    
}

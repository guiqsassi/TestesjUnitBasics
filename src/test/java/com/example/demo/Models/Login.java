package com.example.demo.Models;


public class Login {
    protected String email;
    protected String password;
    protected Boolean logged;

    
    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(Boolean logged) {
        this.logged = logged;
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
        this.logged = false;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean tryLogin(String email, String password){
        if(this.email.equals(email) && this.password.equals(password)){
            this.logged = true;
            return true;
        }
        else{
            return false;
        }
    }
    public Boolean cadUser(){
        if(this.email.contains("@")){
            return true;
        }
        else{ return false;}
    }
    public Boolean LogOut(){
        if(this.logged){
            logged = false;
            return true;
        }
        else return false;
    }
    
}
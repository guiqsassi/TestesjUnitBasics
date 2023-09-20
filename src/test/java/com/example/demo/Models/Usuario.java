package com.example.demo.Models;
/*Criar testes para um esquema de cadastro de usuários com campos obrigatórios e alguns campos com padrões específicos.
Exemplo de campos com padrões: e-mail, CEP, CPF, CNPJ…
Pode utilizar qualquer campo como obrigatório no cadastro.
A senha deve ter um esquema de confirmação de senha.
A classe deve ter métodos para:
Cadastrar usuário
Comparar senhas
Um método para cada análise de padrão
Todos os métodos devem ser testados.
 */
public class Usuario {
    protected String email, password, cep;

    public Boolean verificarEmailPadrao(){
        return email.contains("@");
    }
    public Boolean verificarCepPadrao(){
        return cep.length() == 8;
    }
    public Boolean passwordEquals(String password){
        return this.password.equals(password);
    }
    public Boolean cadastrarUsuario(){
       if(this.verificarCepPadrao() && this.verificarEmailPadrao()){
        return true;
       }
       else{
        return false;
       }
    }
    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
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

    public Usuario(String email, String password, String cep) {
            this.email = email;
            this.password = password;
            this.cep = cep;
    }





   

    
}

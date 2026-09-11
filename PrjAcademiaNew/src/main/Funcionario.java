package main;

public class Funcionario extends Usuario {
    public Funcionario(String nome, String login, String senha) {
    	super(nome, login, senha, "Funcionario");
    }
}
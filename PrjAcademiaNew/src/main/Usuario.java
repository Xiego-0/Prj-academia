package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private String login;
    private String senha;
    private String tipo;

    public Usuario(String nome, String login, String senha, String tipo) {
        this.nome = nome; this.login = login; this.senha = senha; this.tipo = tipo;
    }
    public String getNome() { return nome; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public String getTipo() { return tipo; }
}
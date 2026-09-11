package main;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private String cpf;
    private Plano plano;
    private String modalidade;
    private List<Treino> treinos;
    private String dataNascimento;
    private String telefone;
    private String email;

    public Aluno(String nome, String login, String senha, String cpf, Plano plano, String modalidade) {
        super(nome, login, senha, "Aluno");
        this.cpf = cpf; this.plano = plano; this.modalidade = modalidade;
        this.treinos = new ArrayList<>();
        this.dataNascimento = "15/05/2005"; this.telefone = "(11) 98888-7777"; this.email = login + "@academia.com";
    }
    
    public String getCpf() {
    	return cpf; 
    }
    
    public Plano getPlano() { 
    	return plano; 
    }
    
    public String getModalidade() {
    	return modalidade;
    }
    
    public List<Treino> getTreinos() {
    	return treinos;
    }
    
    public void adicionarTreino(Treino treino) {
    	this.treinos.add(treino);
    }
    
    public String getDataNascimento() {
    	return dataNascimento;
    }
    
    public String getTelefone() {
    	return telefone;
    }
    
    public String getEmail() {
    	return email;
    }
}

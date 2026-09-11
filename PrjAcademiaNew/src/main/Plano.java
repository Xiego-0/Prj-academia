package main;

public class Plano {
    private String nome;
    private double valor;
    
    public Plano(String nome, double valor) {
    	this.nome = nome; this.valor = valor;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public double getValor() {
    	return valor;
    }
    
    @Override
    public String toString() {
    	return nome;
    }
}
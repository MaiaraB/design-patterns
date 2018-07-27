package br.com.alura.shared;


public class Item {

	private double valor;
	private String nome;

	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}
	
}

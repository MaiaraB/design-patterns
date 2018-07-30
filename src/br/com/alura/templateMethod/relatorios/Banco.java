package br.com.alura.templateMethod.relatorios;

import java.util.List;

import br.com.alura.shared.Conta;

public class Banco {
	
	private String nome;
	private String telefone;
	private List<Conta> contas;

	private String endereco;
	private String email;
	
	public Banco(String nome, String telefone, List<Conta> contas) {
		this.nome = nome;
		this.telefone = telefone;
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

package br.com.alura.shared;

import java.time.LocalDate;

public class Conta {

	private String titular;
	private double saldo;
	
	private String agencia;
	private String numeroDaConta;
	private LocalDate dataDeAbestura;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeAbestura = LocalDate.now();
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public LocalDate getDataDeAbestura() {
		return dataDeAbestura;
	}
	
	public void setDataDeAbertura(LocalDate data) {
		this.dataDeAbestura = data;
	}
	
}

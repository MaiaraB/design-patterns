package br.com.alura.shared;

public class Conta {

	private String titular;
	private double saldo;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}
	
}

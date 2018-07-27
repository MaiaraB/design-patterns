package br.com.alura.strategy.investimentos;

import br.com.alura.shared.Conta;

public class TesteDeInvestimento {
	public static void main(String[] args) {
		Conta conta = new Conta("Fulano", 100.0);
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		RealizadorDeInvestimentos investidor = new RealizadorDeInvestimentos();
		
		investidor.realizaInvestimento(conta, arrojado);
	}
}

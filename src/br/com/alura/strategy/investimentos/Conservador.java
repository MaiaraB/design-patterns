package br.com.alura.strategy.investimentos;

import br.com.alura.shared.Conta;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}

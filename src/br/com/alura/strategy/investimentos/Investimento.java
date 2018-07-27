package br.com.alura.strategy.investimentos;

import br.com.alura.shared.Conta;

public interface Investimento {

	double calcula(Conta conta);
}

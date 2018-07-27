package br.com.alura.strategy.investimentos;

import br.com.alura.shared.Conta;

public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Conta conta, Investimento estrategiaDeInvestimento) {
		double retorno = estrategiaDeInvestimento.calcula(conta);
		conta.deposita(retorno);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}

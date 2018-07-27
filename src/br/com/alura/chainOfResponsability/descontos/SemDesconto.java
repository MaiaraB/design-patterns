package br.com.alura.chainOfResponsability.descontos;

import br.com.alura.shared.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//nao tem proximo
	}
}

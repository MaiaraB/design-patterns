package br.com.alura.chainOfResponsability.descontos;

import br.com.alura.shared.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}

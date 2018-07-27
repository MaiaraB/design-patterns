package br.com.alura.strategy.impostos;

import br.com.alura.shared.Orcamento;

public interface Imposto {

	double calcula(Orcamento orcamento);
}

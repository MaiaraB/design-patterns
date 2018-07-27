package br.com.alura.strategy.impostos;

import br.com.alura.shared.Orcamento;

public class ICMS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}

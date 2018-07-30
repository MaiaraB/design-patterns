package br.com.alura.chainOfResponsability.descontos;

import br.com.alura.shared.Orcamento;

public abstract class TemplateDesconto implements Desconto {

	public double desconta(Orcamento orcamento) {
		if (getCondicaoDesconto(orcamento)) {
			return getDesconto(orcamento);
		} else if (getProximo() != null) {
			return getProximo().desconta(orcamento);
		} else {
			throw new RuntimeException("Nenhum desconto de aplica");
		}
	}
	
	protected abstract Desconto getProximo();

	protected abstract double getDesconto(Orcamento orcamento);

	protected abstract boolean getCondicaoDesconto(Orcamento orcamento);

}

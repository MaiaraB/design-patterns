package br.com.alura.chainOfResponsability.descontos;

import br.com.alura.shared.Orcamento;

public class DescontoPorCincoItens extends TemplateDesconto {

	private Desconto proximo;

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	protected Desconto getProximo() {
		return this.proximo;
	}

	@Override
	protected double getDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean getCondicaoDesconto(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}
}

package br.com.alura.templateMethod.novosImpostos;

import br.com.alura.shared.Orcamento;
import br.com.alura.strategy.impostos.Imposto;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

}

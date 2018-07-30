package br.com.alura.templateMethod.novosImpostos;

import br.com.alura.shared.Imposto;
import br.com.alura.shared.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP() {
		super();
	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
	
}

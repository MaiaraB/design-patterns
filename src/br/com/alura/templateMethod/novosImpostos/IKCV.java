package br.com.alura.templateMethod.novosImpostos;

import br.com.alura.shared.Imposto;
import br.com.alura.shared.Item;
import br.com.alura.shared.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	public IKCV() {
		super();
	}
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}

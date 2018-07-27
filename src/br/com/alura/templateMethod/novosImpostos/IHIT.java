package br.com.alura.templateMethod.novosImpostos;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.shared.Item;
import br.com.alura.shared.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return doisItensComMesmoNome(orcamento);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
	}
	
	private boolean doisItensComMesmoNome(Orcamento orcamento) {
		Set<String> nomesItens = new HashSet<>();
		for (Item item : orcamento.getItens()) {
			nomesItens.add(item.getNome());
		}
		return orcamento.getItens().size() > nomesItens.size();
	}

}

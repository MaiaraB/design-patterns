package br.com.alura.strategy.impostos;

import br.com.alura.shared.Imposto;
import br.com.alura.shared.Orcamento;

public class ISS extends Imposto {
	
	public ISS() {
		super();
	}

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}

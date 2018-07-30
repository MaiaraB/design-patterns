package br.com.alura.strategy.impostos;

import br.com.alura.shared.Imposto;
import br.com.alura.shared.Orcamento;

public class ICCC extends Imposto {

	public ICCC() {
		super();
	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		double imposto;
		if (valor < 1000) {
			imposto = valor * 0.05;
		} else if (valor >= 1000 && valor <= 3000) {
			imposto = valor * 0.07;
		} else {
			imposto = valor * 0.08 + 30;
		}
		return imposto + calculoDoOutroImposto(orcamento);
	}

}

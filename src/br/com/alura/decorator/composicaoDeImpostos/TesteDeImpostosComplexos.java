package br.com.alura.decorator.composicaoDeImpostos;

import br.com.alura.shared.Imposto;
import br.com.alura.shared.Orcamento;
import br.com.alura.strategy.impostos.ICMS;
import br.com.alura.strategy.impostos.ISS;
import br.com.alura.templateMethod.novosImpostos.ICPP;
import br.com.alura.templateMethod.novosImpostos.IKCV;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		// interface Imposto foi modificada para uma classe abstrata que passou 
		// a implementar um construtor que recebe outro Imposto
		// e todas as classes que implementavam Imposto passaram a extender e 
		// adicionar o resultado do método calculoDoOutroImposto ao resultado do seu método calcula
		Imposto issComIcmsComIcpp = new ISS(new ICMS(new ICPP()));
		Imposto issComImpostoMuitoAltoComIcms = new ISS(new ImpostoMuitoAlto(new ICMS()));
		Imposto ikcvComIcpp = new IKCV(new ICPP());
		
		Orcamento orcamento = new Orcamento(500);
		
		System.out.println(issComIcmsComIcpp.calcula(orcamento));
		System.out.println(issComImpostoMuitoAltoComIcms.calcula(orcamento));
		System.out.println(ikcvComIcpp.calcula(orcamento));
	}
}

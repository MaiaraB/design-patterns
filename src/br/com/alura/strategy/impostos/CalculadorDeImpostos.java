package br.com.alura.strategy.impostos;

import br.com.alura.shared.Imposto;
import br.com.alura.shared.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto estrategiaDeImposto) {
		
		double resultado = estrategiaDeImposto.calcula(orcamento);
		System.out.println(resultado);
	}
 }

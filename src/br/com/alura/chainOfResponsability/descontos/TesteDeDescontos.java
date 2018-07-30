package br.com.alura.chainOfResponsability.descontos;

import br.com.alura.shared.Item;
import br.com.alura.shared.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 15.0));
		orcamento.adicionaItem(new Item("LAPIS", 15.0));
		orcamento.adicionaItem(new Item("BORRACHA", 15.0));
		orcamento.adicionaItem(new Item("REGUA", 25.0));
		orcamento.adicionaItem(new Item("GRAFITE", 25.0));
		orcamento.adicionaItem(new Item("CORRETIVO", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}

package br.com.alura.templateMethod.novosImpostos;

import br.com.alura.shared.Item;
import br.com.alura.shared.Orcamento;
import br.com.alura.strategy.impostos.CalculadorDeImpostos;
import br.com.alura.strategy.impostos.Imposto;

public class TesteNovosImpostos {

	public static void main(String[] args) {
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 100.0));
		orcamento.adicionaItem(new Item("CANETA", 150.0));
		orcamento.adicionaItem(new Item("LAPIS", 150.0));
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, icpp);
		calculador.realizaCalculo(orcamento, ikcv);
		calculador.realizaCalculo(orcamento, ihit);
	}
	
}

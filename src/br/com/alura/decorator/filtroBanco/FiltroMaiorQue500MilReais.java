package br.com.alura.decorator.filtroBanco;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.shared.Conta;

public class FiltroMaiorQue500MilReais extends Filtro {

	public FiltroMaiorQue500MilReais() {
		super();
	}
	
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	boolean condicaoParaFiltrar(Conta conta) {
		return conta.getSaldo() > 500000;
	}
	
}

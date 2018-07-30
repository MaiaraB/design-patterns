package br.com.alura.decorator.filtroBanco;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.shared.Conta;

public class FiltroMenorQue100Reais extends Filtro {

	public FiltroMenorQue100Reais() {
		super();
	}
	
	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	boolean condicaoParaFiltrar(Conta conta) {
		return conta.getSaldo() < 100;
	}

}

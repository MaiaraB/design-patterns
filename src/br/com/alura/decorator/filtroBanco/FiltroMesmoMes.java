package br.com.alura.decorator.filtroBanco;

import java.lang.reflect.GenericArrayType;
import java.time.LocalDate;

import br.com.alura.shared.Conta;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes() {
		super();
	}
	
	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	boolean condicaoParaFiltrar(Conta conta) {
		return conta.getDataDeAbestura().getMonth() == LocalDate.now().getMonth() && 
				conta.getDataDeAbestura().getYear() == LocalDate.now().getYear();
	}

}

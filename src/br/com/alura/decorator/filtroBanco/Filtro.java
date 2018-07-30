package br.com.alura.decorator.filtroBanco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.shared.Conta;

public abstract class Filtro {
	
	private final Filtro outroFiltro;
	
	public Filtro() {
		this.outroFiltro = null;
	}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public final List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		for (Conta conta : contas) {
			if (condicaoParaFiltrar(conta)) {
				contasFiltradas.add(conta);
			}
		}
		
		contasFiltradas.addAll(aplicaOutroFiltro(contas));
		return contasFiltradas;
	}
	
	abstract boolean condicaoParaFiltrar(Conta conta);

	private List<Conta> aplicaOutroFiltro(List<Conta> contas) {
		if (outroFiltro == null) return Arrays.asList();
		return outroFiltro.filtra(contas);
	}
}

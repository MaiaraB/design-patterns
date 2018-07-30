package br.com.alura.decorator.filtroBanco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.shared.Conta;

public class TesteFiltroBanco {

	public static void main(String[] args) {
		Conta c1 = new Conta("João", 50.0);
		Conta c2 = new Conta("José", 500.0);
		Conta c3 = new Conta("Maria", 600000.0);
		c3.setDataDeAbertura(LocalDate.now().minusYears(1));
		Conta c4 = new Conta("Mara", 600.0);
		c4.setDataDeAbertura(LocalDate.now().minusMonths(2));
		
		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		
		Filtro filtro = new FiltroMenorQue100Reais(new FiltroMaiorQue500MilReais(new FiltroMesmoMes()));
		
		List<Conta> filtradas = filtro.filtra(contas);
		
		for (Conta conta : filtradas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo() + " - " + conta.getDataDeAbestura());
		}
	}
	
}

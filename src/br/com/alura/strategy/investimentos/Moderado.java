package br.com.alura.strategy.investimentos;
import java.util.Random;

import br.com.alura.shared.Conta;

public class Moderado implements Investimento {

	private Random random;
	
	public Moderado() {
		this.random = new Random();
	}
	
	@Override
	public double calcula(Conta conta) {
		boolean escolhido = new Random().nextInt(2) == 0;
		
		if (escolhido) {
			return conta.getSaldo() * 0.025;
		} else {
			return conta.getSaldo() * 0.007;
		}
	}

}

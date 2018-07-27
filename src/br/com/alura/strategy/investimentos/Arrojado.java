package br.com.alura.strategy.investimentos;
import java.util.Random;

import br.com.alura.shared.Conta;

public class Arrojado implements Investimento {

	private Random random;
	
	public Arrojado() {
		this.random = new Random();
	}
	@Override
	public double calcula(Conta conta) {
		double escolha = new Random().nextInt(10);
		
		if (escolha <= 1) {
			return conta.getSaldo() * 0.05;
		} else if (escolha <= 4) {
			return conta.getSaldo() * 0.03;
		} else {
			return conta.getSaldo() * 0.006;
		}
	}

}

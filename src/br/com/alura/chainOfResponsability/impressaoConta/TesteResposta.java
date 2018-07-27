package br.com.alura.chainOfResponsability.impressaoConta;

import br.com.alura.shared.Conta;

public class TesteResposta {

	public static void main(String[] args) {
		Conta conta = new Conta("Maiara", 500.0);
		ImpressoraDeConta impressora = new ImpressoraDeConta();
		
		impressora.imprimirConta(conta, Formato.XML);
		impressora.imprimirConta(conta, Formato.CSV);
		impressora.imprimirConta(conta, Formato.PORCENTO);
	}
}

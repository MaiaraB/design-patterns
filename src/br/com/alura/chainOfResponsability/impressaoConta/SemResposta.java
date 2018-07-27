package br.com.alura.chainOfResponsability.impressaoConta;

import br.com.alura.shared.Conta;

public class SemResposta implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {
		// nao resposde nada
	}

	@Override
	public void setProxima(Resposta proxima) {
		// nao tem proxima
	}

}

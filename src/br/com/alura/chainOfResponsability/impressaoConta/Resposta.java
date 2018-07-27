package br.com.alura.chainOfResponsability.impressaoConta;

import br.com.alura.shared.Conta;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta proxima);
}

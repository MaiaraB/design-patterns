package br.com.alura.chainOfResponsability.impressaoConta;

import br.com.alura.shared.Conta;

public class RespostaPorcento implements Resposta {

	private Resposta proxima;
	
//	public RespostaPorcento(Resposta proxima) {
//		this.proxima = proxima;
//	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if (proxima != null) {
			proxima.responde(req, conta);
		} else {
            // não existe próxima na corrente, e ninguém atendeu a requisição!
            // poderíamos não ter feito nada aqui, caso não fosse necessário!
            throw new RuntimeException("Formato de resposta não encontrado");
        }
	}

	@Override
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;
	}

}

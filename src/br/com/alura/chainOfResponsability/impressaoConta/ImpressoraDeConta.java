package br.com.alura.chainOfResponsability.impressaoConta;

import br.com.alura.shared.Conta;

public class ImpressoraDeConta {

	public void imprimirConta(Conta conta, Formato formato) {
//		Resposta semResposta = new SemResposta();
		Resposta porcento = new RespostaPorcento();
		Resposta csv = new RespostaCSV();
		Resposta xml = new RespostaXML();
		
		// receber a proxima no construtor garante que o cliente nunca 
		// esquecerá de passar o proximo item da sequencia
		// porém, é necessário sempre lembrar de receber o proximo no contrutor
		// ao criar uma nova implementação de Resposta, enquanto que com o setProximo 
		// na interface obriga ao criador da implementação a lidar com a proxima resposta
		
		xml.setProxima(csv);
		csv.setProxima(porcento);
		
		Requisicao req = new Requisicao(formato);
		
		xml.responde(req, conta);
	}
}

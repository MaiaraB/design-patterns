package br.com.alura.templateMethod.relatorios;

import br.com.alura.shared.Conta;

public class RelatorioSimples extends TemplateRelatorios {

	private Banco banco;

	public RelatorioSimples(Banco banco) {
		this.banco = banco;
	}
	
	@Override
	protected void imprimeCabecalho() {
		System.out.println(banco.getNome());
	}

	@Override
	protected void imprimeCorpo() {
		for (Conta conta : banco.getContas()) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
	}

	@Override
	protected void imprimeRodape() {
		System.out.println(banco.getTelefone());
	}

}

package br.com.alura.templateMethod.relatorios;

import java.time.LocalDate;

import org.omg.Messaging.SyncScopeHelper;

import br.com.alura.shared.Conta;

public class RelatorioComplexo extends TemplateRelatorios {

	private Banco banco;

	public RelatorioComplexo(Banco banco) {
		this.banco = banco;
	}
	
	@Override
	protected void imprimeCabecalho() {
		System.out.println(banco.getNome());
		if (banco.getEndereco() != null) System.out.println(banco.getEndereco());
		System.out.println(banco.getTelefone());
	}

	@Override
	protected void imprimeCorpo() {
		for (Conta conta : banco.getContas()) {
			System.out.println(conta.getTitular() + " - " + conta.getAgencia() + " - " + conta.getNumeroDaConta() + " - " + conta.getSaldo());
		}
	}

	@Override
	protected void imprimeRodape() {
		if (banco.getEmail() != null) System.out.println(banco.getEmail());
		System.out.println(LocalDate.now());
	}

}

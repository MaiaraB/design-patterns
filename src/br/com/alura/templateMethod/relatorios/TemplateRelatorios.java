package br.com.alura.templateMethod.relatorios;

public abstract class TemplateRelatorios {

	public void imprimeRelatorio() {
		imprimeCabecalho();
		System.out.println();
		imprimeCorpo();
		System.out.println();
		imprimeRodape();
	}
	
	protected abstract void imprimeCabecalho();
	
	protected abstract void imprimeCorpo();
	
	protected abstract void imprimeRodape();
}

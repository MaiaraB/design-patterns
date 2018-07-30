package br.com.alura.templateMethod.relatorios;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.shared.Conta;

public class TesteRelatorios {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		Conta c1 = new Conta("João", 300.0);
		Conta c2 = new Conta("José", 400.0);
		
		c1.setAgencia("287-9");
		c1.setNumeroDaConta("1234-5");
		c2.setAgencia("287.9");
		c2.setNumeroDaConta("6789-0");
		contas.add(c1);
		contas.add(c2);
		
		Banco banco = new Banco("Banco do Brasil", "(61) 3216-5498", contas);
		banco.setEmail("assistencia@bb.com");
		banco.setEndereco("Setor Comercial");
		
		RelatorioSimples simples = new RelatorioSimples(banco);
		RelatorioComplexo complexo = new RelatorioComplexo(banco);
		
		simples.imprimeRelatorio();
		System.out.println("-------------------------");
		complexo.imprimeRelatorio();
	}
}

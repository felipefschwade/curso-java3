package br.com.empresa.conta;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Banco {
	List<Conta> contas = new LinkedList<>();
	HashMap<String, Conta> indexado_por_titular = new HashMap<>();
	
	public void adiciona(Conta c) {
		this.contas.add(c);
		this.indexado_por_titular.put(c.getTitular(), c);
	}
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	public Conta pegaPorTitular(String titular) {
		return this.indexado_por_titular.get(titular);
	}
}

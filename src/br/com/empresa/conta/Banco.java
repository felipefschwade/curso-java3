package br.com.empresa.conta;

import java.util.List;

public class Banco {
	List<Conta> contas;
	
	public void adiciona(Conta c) {
		this.contas.add(c);
	}
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
}

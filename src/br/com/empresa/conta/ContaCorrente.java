package br.com.empresa.conta;

import br.com.empresa.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
	}
	
	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa * 2);
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}

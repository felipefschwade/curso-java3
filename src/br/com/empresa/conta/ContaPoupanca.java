package br.com.empresa.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	public ContaPoupanca(int numero, String titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa * 3);
	}

	public void deposita(double valor) {
		if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor  - 0.10;        
        }        
	}

	@Override
	public int compareTo(ContaPoupanca c) {
		return this.getNumero() - c.getNumero();
	}
}

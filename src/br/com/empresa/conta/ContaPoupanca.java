package br.com.empresa.conta;

public class ContaPoupanca extends Conta {
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
}

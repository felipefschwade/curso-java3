package br.com.empresa.sistema;

import br.com.empresa.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    public void roda(Conta c) {
        c.getSaldo();
        c.atualiza(this.selic);
        c.getSaldo();
        this.saldoTotal += c.getSaldo();
    }
    public double getSaldoTotal() {
    	return this.saldoTotal;
    }
}

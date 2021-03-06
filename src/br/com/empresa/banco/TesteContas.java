package br.com.empresa.banco;

import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.ContaPoupanca;

public class TesteContas {
	public static void main(String[] args) throws Exception {
		ContaCorrente cc = new ContaCorrente(0, null);
		ContaPoupanca cp = new ContaPoupanca(0, null);
		try {
			cp.deposita(-1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cp.deposita(1000);

		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.printf("O saldo �: %.2f", cc.getSaldo());
		System.out.printf("O saldo �: %.2f", cp.getSaldo());
		ContaCorrente conta = new ContaCorrente(0, null);
		System.out.println(conta);

	}
}

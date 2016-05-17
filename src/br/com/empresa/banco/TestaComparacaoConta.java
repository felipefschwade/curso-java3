package br.com.empresa.banco;

import br.com.empresa.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(123);
		ContaCorrente outra_conta = new ContaCorrente(123);
		System.out.println(conta.equals(outra_conta));
		System.out.println(conta == outra_conta);
	}
}

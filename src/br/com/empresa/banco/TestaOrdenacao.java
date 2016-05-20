package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		ContaPoupanca c1 = new ContaPoupanca(123, "Cesar");
		ContaPoupanca c2 = new ContaPoupanca(132, "Pedro");
		contas.add(c2);
		contas.add(c1);
		Collections.sort(contas);
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
	}
}

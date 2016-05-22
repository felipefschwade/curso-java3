package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		ContaPoupanca c1 = new ContaPoupanca(123, "Cesar");
		ContaPoupanca c2 = new ContaPoupanca(132, "Pedro");
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			ContaPoupanca c = new ContaPoupanca(random.nextInt(100000), "aaaaa");
			contas.add(c);
			System.out.println(c);
		} 
		System.out.println("Ordenando");
		Collections.sort(contas);
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
	}
}

package br.com.empresa.banco;

import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.sistema.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0, null);
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}

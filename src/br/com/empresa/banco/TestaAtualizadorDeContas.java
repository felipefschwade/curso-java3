package br.com.empresa.banco;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.ContaPoupanca;
import br.com.empresa.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(0, null);
        Conta cc = new ContaCorrente(0, null);
        Conta cp = new ContaPoupanca(0, null);

        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }

}
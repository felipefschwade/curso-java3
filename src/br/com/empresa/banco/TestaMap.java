package br.com.empresa.banco;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;

public class TestaMap {
	public static void main(String[] args) {
        Conta c1 = new ContaCorrente(0, null);
        c1.deposita(10000);

        Conta c2 = new ContaCorrente(0, null);
        c2.deposita(3000);

        // cria o mapa
        HashMap mapaDeContas = new HashMap();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}

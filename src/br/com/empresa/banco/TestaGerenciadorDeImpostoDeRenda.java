package br.com.empresa.banco;

import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {
	 public static void main(String[] args) {

         GerenciadorDeImpostoDeRenda gerenciador = 
                     new GerenciadorDeImpostoDeRenda();

         SeguroDeVida sv = new SeguroDeVida();
         gerenciador.adiciona(sv);

         ContaCorrente cc = new ContaCorrente(0, null);
         cc.deposita(1000);
         gerenciador.adiciona(cc);

         System.out.println(gerenciador.getTotal());
     }
}

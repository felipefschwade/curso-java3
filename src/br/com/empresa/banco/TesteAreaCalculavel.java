package br.com.empresa.banco;

import br.com.empresa.conta.Retangulo;
import br.com.empresa.sistema.AreaCalculavel;

public class TesteAreaCalculavel {
	 public static void main(String[] args) {
         AreaCalculavel a = new Retangulo(3,2);
         System.out.println(a.calculaArea());
     }
}

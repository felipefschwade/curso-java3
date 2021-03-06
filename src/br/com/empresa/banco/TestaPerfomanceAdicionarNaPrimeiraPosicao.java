package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestaPerfomanceAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> teste = new LinkedList<>();

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
    }
}

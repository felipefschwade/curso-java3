package br.com.empresa.conta;

import br.com.empresa.sistema.AreaCalculavel;

class Quadrado implements AreaCalculavel {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return this.lado * this.lado;
    }
}

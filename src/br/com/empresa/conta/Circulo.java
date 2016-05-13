package br.com.empresa.conta;

import br.com.empresa.sistema.AreaCalculavel;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return raio * raio * Math.PI;
	}
	
}

package curso_java2;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return raio * raio * Math.PI;
	}
	
}

package br.com.empresa.conta;

public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException(double valor) {
		super("O Valor" + valor + " � inv�lido"); //Super � utilizado para chamar o construtor da classe pai
	}
}

package curso_java2;

public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException(double valor) {
		super("O Valor" + valor + " � inv�lido"); //Super � utilizado para chamar o construtor da classe pai
	}
}

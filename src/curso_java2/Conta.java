package curso_java2;

abstract class Conta {
	protected double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("O valor do deposito deve ser maior que 0");
		} else {
			this.saldo += valor;
		}
	}
	public void saca(double valor) {
		this.saldo -= valor;
	}
	public abstract void atualiza(double taxa);
}

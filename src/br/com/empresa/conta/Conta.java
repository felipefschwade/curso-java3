package br.com.empresa.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	
	public int getNumero() {
		return numero;
	}
	protected String titular;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
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
	
	public String toString() {
		return "Objeto do tipo conta com saldo: "+this.saldo+" e número: "+this.numero;
	}
	public String getTitular() {
		return titular;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

}

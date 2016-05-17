package br.com.empresa.conta;

public abstract class Conta {
	protected double saldo;
	protected static int numero;
	
	public Conta(int numero) {
		this.numero = numero;
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
		return "Objeto do tipo conta com saldo: "+this.saldo;
	}
	public boolean equals(Object obj) {
		Conta outra_conta = (Conta) obj;
		return this.numero == outra_conta.numero;
	}
}

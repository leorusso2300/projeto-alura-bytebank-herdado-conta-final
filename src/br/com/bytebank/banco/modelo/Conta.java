package br.com.bytebank.banco.modelo;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	public Cliente titular;
	private static int total;

	public Conta(int numero, int agencia) {
		total++;
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("Total de contas criadas: " + total);
	}

	public abstract boolean deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor && valor > 0) {
			saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;

	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

}

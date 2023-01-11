package br.com.bytebank.banco.modelo;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.exceptions.MinhaExcecao;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	public Cliente titular;
	private static int total;

	Locale localeBR = new Locale("pt", "BR");
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

	public Conta(int numero, int agencia) {
		total++;
		this.numero = numero;
		this.agencia = agencia;
		//System.out.println("Total de contas criadas: " + total);
	}

	public abstract boolean deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new MinhaExcecao(
					"Erro ao sacar: " + dinheiro.format(this.saldo) + " | Valor: " + dinheiro.format(valor));
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		saca(valor);
		destino.deposita(valor);
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

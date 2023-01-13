package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.exceptions.MinhaExcecao;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public void deposita(double valor) {
		if (valor <= 0) {
			throw new MinhaExcecao("Erro ao fazer o depósito, verique os valores inseridos!!");
		}
		super.saldo += valor;
	}

}

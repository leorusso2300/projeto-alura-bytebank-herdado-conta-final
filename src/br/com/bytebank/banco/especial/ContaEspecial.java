package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.exceptions.MinhaExcecao;
import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int numero, int agencia) {
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

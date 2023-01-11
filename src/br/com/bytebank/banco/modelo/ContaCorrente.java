package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.exceptions.MinhaExcecao;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public void saca(double valor) {
		double valorAsacar = valor + 0.2;
		super.saca(valorAsacar);
	}

	@Override
	public boolean deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;
			return true;
		} else {
			throw new MinhaExcecao("Erro ao fazer o depósito, verique os valores inseridos!!");
		}
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.02;
	}

}

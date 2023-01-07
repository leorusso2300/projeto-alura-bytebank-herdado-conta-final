package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public boolean deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;
			return true;
		}
		return false;
	}

}

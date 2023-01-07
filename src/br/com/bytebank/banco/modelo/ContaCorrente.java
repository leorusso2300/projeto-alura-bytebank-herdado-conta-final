package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public boolean saca(double valor) {
		double valorAsacar = valor + 0.2;
		return super.saca(valorAsacar);
	}

	@Override
	public boolean deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;
			return true;
		}
		return false;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.02;
	}

}

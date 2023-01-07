package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	public double valorTotal;

	public void registra(Tributavel tributavel) {
		double valorImposto = tributavel.getValorImposto();
		valorTotal += valorImposto;
	}

	public double getValorTotal() {
		return valorTotal;
	}
}

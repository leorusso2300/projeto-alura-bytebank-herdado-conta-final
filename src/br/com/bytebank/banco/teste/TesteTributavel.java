package br.com.bytebank.banco.teste;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;


/**
 * Classe que representa os testes do calculo dos impostos
 * @author Leonardo Russo
 *
 */
public class TesteTributavel {
	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		ContaCorrente corrente = new ContaCorrente(222, 1111);
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		corrente.deposita(100);

		CalculadorImposto calcular = new CalculadorImposto();
		calcular.registra(corrente);
		calcular.registra(seguroDeVida);
		System.out.println("Valor total dos impostos " + dinheiro.format(calcular.getValorTotal()));

	}

}

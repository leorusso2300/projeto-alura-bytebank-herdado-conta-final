package br.com.bytebank.banco.teste;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.exceptions.MinhaExcecao;
import br.com.bytebank.banco.modelo.ContaCorrente;
/**
 * Classe que representa os testes do saque
 * @author Leonardo Russo
 *
 */
public class TesteSaca {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		ContaCorrente corrente = new ContaCorrente(222, 2222);
		corrente.deposita(100);

		try {
			corrente.saca(1000);
			System.out.println("Valor depois do saque: " + dinheiro.format(corrente.getSaldo()));
		} catch (MinhaExcecao e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

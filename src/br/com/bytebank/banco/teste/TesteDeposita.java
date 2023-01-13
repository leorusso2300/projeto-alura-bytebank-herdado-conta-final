package br.com.bytebank.banco.teste;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.exceptions.MinhaExcecao;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Classe que representa os testes de deposito
 * @author Leonardo Russo
 *
 */
public class TesteDeposita {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		ContaCorrente cc = new ContaCorrente(1234, 4321);

		try {
			cc.deposita(100);
			System.out.println("Saldo depois do depósito: " + dinheiro.format(cc.getSaldo()));
		} catch (MinhaExcecao e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

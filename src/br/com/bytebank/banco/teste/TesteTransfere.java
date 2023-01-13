package br.com.bytebank.banco.teste;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.exceptions.MinhaExcecao;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
/**
 * Classe que representa os testes da transferenia
 * @author Leonardo Russo
 *
 */
public class TesteTransfere {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1234, 4321);
		ContaPoupanca cp = new ContaPoupanca(4321, 1234);

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		cc.deposita(100);

		try {
			cc.transfere(50, cp);
			System.out.println("Saldo Conta Corrente após a transferência: " + dinheiro.format(cc.getSaldo()));
			System.out.println("Saldo Conta Poupança após a transferência: " + dinheiro.format(cp.getSaldo()));
		} catch (MinhaExcecao e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

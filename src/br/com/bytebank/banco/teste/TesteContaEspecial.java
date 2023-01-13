package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.exceptions.MinhaExcecao;
/**
 * Classe que representa os testes da conta especial
 * @author Leonardo Russo
 *
 */
public class TesteContaEspecial {

	public static void main(String[] args) {

		ContaEspecial especial = new ContaEspecial(1234, 4321);

		try {
			especial.deposita(0);
		} catch (MinhaExcecao e) {
			especial.deposita(100);
		}
		System.out.println(especial.getSaldo());
	}

}

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 3333);
		ContaPoupanca cp = new ContaPoupanca(555, 777);

		System.out.println(cc.toString());
		System.out.println(cp.toString());

	}

}

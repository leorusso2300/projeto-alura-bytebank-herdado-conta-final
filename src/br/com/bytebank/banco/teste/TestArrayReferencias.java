package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente[] contasCorrente = new ContaCorrente[5];

		ContaCorrente cc1 = new ContaCorrente(111, 111);
		ContaCorrente cc2 = new ContaCorrente(222, 222);
		ContaCorrente cc3 = new ContaCorrente(333, 333);
		ContaCorrente cc4 = new ContaCorrente(444, 444);
		ContaCorrente cc5 = new ContaCorrente(555, 555);

		contasCorrente[0] = cc1;
		contasCorrente[1] = cc2;
		contasCorrente[2] = cc3;
		contasCorrente[3] = cc4;
		contasCorrente[4] = cc5;

		System.out.println(contasCorrente[0]);
		System.out.println(contasCorrente[1]);
		System.out.println(contasCorrente[2]);
		System.out.println(contasCorrente[3]);
		System.out.println(contasCorrente[4]);

		System.out.println("-------------------------------------------");

		ContaPoupanca[] contasPoupanca = new ContaPoupanca[5];

		ContaPoupanca cp1 = new ContaPoupanca(111, 111);
		ContaPoupanca cp2 = new ContaPoupanca(222, 222);
		ContaPoupanca cp3 = new ContaPoupanca(333, 333);
		ContaPoupanca cp4 = new ContaPoupanca(444, 444);
		ContaPoupanca cp5 = new ContaPoupanca(555, 555);

		contasPoupanca[0] = cp1;
		contasPoupanca[1] = cp2;
		contasPoupanca[2] = cp3;
		contasPoupanca[3] = cp4;
		contasPoupanca[4] = cp5;

		System.out.println(contasPoupanca[0]);
		System.out.println(contasPoupanca[1]);
		System.out.println(contasPoupanca[2]);
		System.out.println(contasPoupanca[3]);
		System.out.println(contasPoupanca[4]);

	}

}

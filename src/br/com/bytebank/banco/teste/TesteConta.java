package br.com.bytebank.banco.teste;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {

		double valorDepositoCc1 = 100;
		double valorSaqueCc1 = 10;
		double valorTransferencia = 10;

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		ContaCorrente contaCorrente = new ContaCorrente(123, 123);
		ContaPoupanca contaPoupanca = new ContaPoupanca(321, 321);
		Cliente clienteCorrente = new Cliente();
		Cliente clientePoupanca = new Cliente();

		System.out.println("--------------------------");
		System.out.println("|| Conta-Corrente ||");
		System.out.println("--------------------------");

		contaCorrente.setTitular(clienteCorrente);
		clienteCorrente.setNome("Leonardo Gabriel");
		clienteCorrente.setCpf("415.690.248-21");
		clienteCorrente.setProfissao("Programador");

		System.out.println("Agência: " + contaCorrente.getAgencia() + " || " + "Número: " + contaCorrente.getNumero());
		System.out.println("Nome: " + contaCorrente.getTitular().getNome());
		System.out.println("CPF: " + contaCorrente.getTitular().getCpf());
		System.out.println("Profissão: " + contaCorrente.getTitular().getProfissao());

		System.out.println("--------------------------");
		System.out.println("|| Conta-Poupança ||");
		System.out.println("--------------------------");

		contaPoupanca.setTitular(clientePoupanca);
		clientePoupanca.setNome("Ana Russo");
		clientePoupanca.setCpf("428.547.314-25");
		clientePoupanca.setProfissao("Vendedora");

		System.out.println("Agência: " + contaPoupanca.getAgencia() + " || " + "Número: " + contaPoupanca.getNumero());
		System.out.println("Nome: " + contaPoupanca.getTitular().getNome());
		System.out.println("CPF: " + contaPoupanca.getTitular().getCpf());
		System.out.println("Profissão: " + contaPoupanca.getTitular().getProfissao());
		System.out.println("-------------------------------------------");

		// Deposita o valor de 100 reais na conta cc1
		if (contaCorrente.deposita(valorDepositoCc1)) {
			System.out.println("Valor depois do depósito: " + dinheiro.format(contaCorrente.getSaldo()));
		} else {
			System.out.println("Insira um valor valido!");
		}

		// Saca o valor de 10 reais na conta cc1
		if (contaCorrente.saca(valorSaqueCc1)) {
			System.out.println("Valor depois do saque: " + dinheiro.format(contaCorrente.getSaldo()));
		} else {
			System.out.println("Insira um valor valido!");
		}

		// Transfere um valor de 100 reais para o cc2
		if (contaCorrente.transfere(valorTransferencia, contaPoupanca)) {
			System.out.println("Valor cc1 depois da transferência: " + dinheiro.format(contaCorrente.getSaldo()));
			System.out.println("Valor cc2 depois da transferência: " + dinheiro.format(contaPoupanca.getSaldo()));
		} else {
			System.out.println("Insira um valor valido!");
		}

	}

}

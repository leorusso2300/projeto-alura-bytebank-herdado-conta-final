package br.com.bytebank.banco.teste;

import java.util.Random;

public class TesteArray {

	public static void main(String[] args) {

		int[] idades = new int[5];
		int[] aleatorio = new int[10];

		int idade1 = 29;
		int idade2 = 23;
		int idade3 = 44;
		int idade4 = 78;
		int idade5 = 98;

		idades[0] = idade1;
		idades[1] = idade2;
		idades[2] = idade3;
		idades[3] = idade4;
		idades[4] = idade5;

		for (int x = 0; x < idades.length; x++) {
			System.out.println(idades[x]);
		}

		System.out.println("-----------------------------");

		for (int y = 0; y < aleatorio.length; y++) {
			System.out.println(y + " - " + (aleatorio[y] = teste()));
		}
	}

	static Random gerador = new Random();

	public static int teste() {
		return gerador.nextInt(20);
	}
}

package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "amanda";
		String alteracao1 = nome.toUpperCase();
		String alteracao2 = nome.toLowerCase();
		String alteracao3 = nome.replace('a', 'A');
		char alterecao4 = alteracao3.charAt(5);
		int alterecao5 = nome.indexOf("nda");
		String sub = nome.substring(1);

		System.out.println(alteracao1);
		System.out.println(alteracao2);
		System.out.println(alteracao3);
		System.out.println(alterecao4);
		System.out.println(alterecao5);
		System.out.println(sub);
		System.out.println(nome.length());

		for (int i = 0; i < alteracao3.length(); i++) {
			System.out.println(alteracao3.charAt(i));
		}

		String vazio = "   teste   ";
		String teste = vazio.trim();
		System.out.println(teste.length());
		System.out.println(teste.contains("e"));

		if (teste.isEmpty()) {
			System.out.println("String vazia");
		}

	}

}

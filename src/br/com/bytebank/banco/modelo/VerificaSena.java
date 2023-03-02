package br.com.bytebank.banco.modelo;

public class VerificaSena {

	public boolean verificaNumeros(int i, int[] megaSena, int numero) {
		for (int x = 0; x < megaSena.length; x++) {
			if (numero != megaSena[x]) {
				return true;
			}
		}
		return false;
	}
}

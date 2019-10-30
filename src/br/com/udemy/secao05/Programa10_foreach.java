package br.com.udemy.secao05;
//Foreach  // Para cada
public class Programa10_foreach {
	public static void main(String[] args) {
		String nome = "Surf Is Life";
		
		// Para cada um dos caracteres da String, imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
			
		}
	}

}

package br.com.udemy.secao06;
// Tipos de dados alfanuméricos
// Caracteres e strings

public class Programa13_dados_alfanumericos {
	
	public static void main(String[] args) {
		//Tipos primitivos
		char letra1 = 'a';
		char letra2 = 97; // 97 em decimal == 'a' na tabela ascii
		// string --> não existe um tipo primitivo string no Java
		
		System.out.println("Letra 2 " + letra2);
		
		letra2 = (char) (letra2 + 1); //cast
		
		System.out.println("Letra 1 " + letra1);
		System.out.println("Letra 2 " + letra2);
		
		//Tipos não primitivos
		Character letra3 ='A';
		String nome = "Surf Is Life";
		
		System.out.println("Letra 3 " + letra3);
		
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("Valor mínimo char/Character " + Character.MIN_VALUE); // 0
		System.out.println("Valor máximo char/Character " + Character.MAX_VALUE); // 65535
		
		System.out.println("String " + nome);
		
		System.out.println("Tamanho da String é de " +nome.length() + " caracteres.");
		
		System.out.println("A String ocupa " + (Character.SIZE * nome.length()) + " bits.");
		
		
	}

}

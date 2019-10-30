package br.com.udemy.secao05;
import java.util.Scanner;

// for (estruturas de repetição em Java)

public class Programa09_for {
	
	public static void main(String[] args) {
		int idade;
		String nome;
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		// variável de controle (int i = 0); condição de parada (i < 5); forma de incremento (i++)
		// i++ --> i = i + 1
		for(int i = 0; i < 5; i++) {
			System.out.println("Qual o seu nome? ");
			nome = teclado.nextLine();
			
			System.out.println("Qual a sua idade? ");
			//idade = teclado.nextInt(); BUG
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}
			
		}
		teclado.close();
	}

}

package br.com.udemy.secao05;
import java.util.Scanner;

// do while
public class Programa08_dowhile {
	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		//Para receber dados do teclado via teclado
		Scanner teclado = new Scanner(System.in);

		//Primeiro executa o bloco e depois valida o valor
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //BUG
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos");
		
		}while(idade > 0);
		
		teclado.close();

		
	}

}

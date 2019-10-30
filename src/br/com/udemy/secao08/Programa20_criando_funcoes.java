package br.com.udemy.secao08;
import java.util.Scanner;

// Criando nossas próprias funções

/* Faça um programa que receba diversos nomes de frutas
 pelo usuário pelo teclado e no final imprima essas frutas em ordem contrária.
 O programa deve solicitar ao usuário a quantidade de frutas que ele quer informar.
  */

public class Programa20_criando_funcoes {
	//declaração do vetor
	static String frutas[];
	
	static Scanner teclado = new Scanner(System.in);
		
	public static void main(String[] args) {
		int quantidade;

		System.out.println("Informe a quantidade de frutas para sua salada");
		quantidade = Integer.parseInt(teclado.nextLine());
		
		cadastrarDados(quantidade);
		mostrarDados(quantidade);
		
		teclado.close();
	}
	
	/*
	Uma função deve ter as seguintes informações:
	a) Tipo de retorno (Tipo de dado que a função vai retornar);
	b) Nome - corresponde à ação que a função realiza;
	c) Parâmetros / argumentos de entrada (opcional);
	d) Retorno (Opcional e depende do tipo de retorno);
	*/
	//void = vazio
	static void cadastrarDados(int quantidade) {
		//Defininfo o tamanho do vetor
		frutas = new String[quantidade];
		
		//3
		//0...2 (0, 1, 2)
		for(int i = 0; i < quantidade; i++) { 
			System.out.println("Informe a "+ (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}


	static void mostrarDados(int quantidade) {
		for(int i = 0; i < quantidade; i++) { 
			System.out.println(frutas[quantidade -i - 1]);
		}
	}
}
		

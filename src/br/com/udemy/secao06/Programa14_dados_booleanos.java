package br.com.udemy.secao06;
// Tipos booleanos

public class Programa14_dados_booleanos {
	
	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
				
		//Tipos não primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("Verdadeiro " + v);
		System.out.println("Falso " + f);
		
		if (verdadeiro) {
			System.out.println("É verdadeiro");
		}else{
			System.out.println("É falso");
		}
		
		if (1 == 1) {
			System.out.println("É verdadeiro");
		}else{
			System.out.println("É falso");
		}
		
		
	}

}

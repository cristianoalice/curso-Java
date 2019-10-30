package br.com.udemy.secao04;
//Operador ternário

public class Programa05_op_ternario {
	
	//Para criar a função main(), que é o programa java
	// digitar main e no teclado CTRL + barra de espaço
	public static void main(String[] args) {
		// 
		int valor = 333, numero;
		
		/*
		if (valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}
		*/
		
		//OPERADOR TERNÁRIO
		numero = (valor > 0) ? valor : 10;
		
		System.out.println(numero);
	}

}

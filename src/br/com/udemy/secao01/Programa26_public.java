package br.com.udemy.secao01;
//PUBLIC

/*
Public / p�blico
Pode ser utilizado em todo o projeto
*/

import br.com.udemy.secao11.Cliente;

public class Programa26_public {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Joana Darc", "Rua da Praia, s/n�");
		
		System.out.println("O nome � " + cli.nome);
		System.out.println("O endere�o � " + cli.endereco);
	}
}

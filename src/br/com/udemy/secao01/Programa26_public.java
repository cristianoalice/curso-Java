package br.com.udemy.secao01;
//PUBLIC

import br.com.udemy.secao11_modificadores_acesso.Cliente;

/*
Public / p�blico
Pode ser utilizado em todo o projeto
*/



public class Programa26_public {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Joana Darc", "Rua da Praia, s/n�");
		
		//System.out.println("O nome � " + cli.nome); //private
		//System.out.println("O endere�o � " + cli.endereco); //private
	}
}

package br.com.udemy.secao01;

import br.com.udemy.secao11_modificadores_acesso.Cliente;

//Public

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Sep� Tiaraj�", "Rua das Miss�es, 169");
		
		//System.out.println("Nome: " + cli.nome); //private
		//System.out.println("Endere�o: " + cli.endereco); //private
		
		//cli.dizer_oi(); //Protected 
	}
}

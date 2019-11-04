package br.com.udemy.secao01;

import br.com.udemy.secao11_modificadores_acesso.Cliente;

//Public

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Sepé Tiarajú", "Rua das Missões, 169");
		
		//System.out.println("Nome: " + cli.nome); //private
		//System.out.println("Endereço: " + cli.endereco); //private
		
		//cli.dizer_oi(); //Protected 
	}
}

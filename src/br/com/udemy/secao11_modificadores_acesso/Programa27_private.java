package br.com.udemy.secao11_modificadores_acesso;
//Private
/*
Privado à própria classe, ou seja, só temos acesso ao 
atrubuto ou método privado dentro da própria classe
onde ele fo declarado.

 */
public class Programa27_private {
	
	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Cristiano Alice", "Avenida Campeche, 5437");
	
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		cli1.dizer_oi();
		
		
		Cliente cli2 = new Cliente("Greicy Dias", "Avenida Campeche, 5437");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
		cli2.dizer_oi();

			
	
	}

}

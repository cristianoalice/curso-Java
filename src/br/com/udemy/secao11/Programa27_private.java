package br.com.udemy.secao11;
//Private
/*
Privado � pr�pria classe, ou seja, s� temos acesso ao 
atrubuto ou m�todo privado dentro da pr�pria classe
onde ele fo declarado.

 */
public class Programa27_private {
	
	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Cristiano Alice", "Avenida Campeche, 5437");
	
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endere�o: " + cli1.getEndereco());
		
		
		Cliente cli2 = new Cliente("Greicy Dias", "Avenida Campeche, 5437");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endere�o: " + cli2.getEndereco());

			
	
	}

}

package br.com.udemy.secao14_interfaces;


/*
Uma interface pode conter:
- Constantes;
- M�todos abstratos; 


Interface para servir de contrato para produtos eletr�nicos.
Todo produto eletr�nico que implementar essa interface OBRIGATORIAMENTE
dever�o implementar os m�todos abstratos.
 */
public interface IEletronico {

	public String MARCA = "Surf is Life"; // Constante
	
	public void ligar();
	
	public void desligar();
	
	
	
}

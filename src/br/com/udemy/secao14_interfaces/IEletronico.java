package br.com.udemy.secao14_interfaces;


/*
Uma interface pode conter:
- Constantes;
- Métodos abstratos; 


Interface para servir de contrato para produtos eletrônicos.
Todo produto eletrônico que implementar essa interface OBRIGATORIAMENTE
deverão implementar os métodos abstratos.
 */
public interface IEletronico {

	public String MARCA = "Surf is Life"; // Constante
	
	public void ligar();
	
	public void desligar();
	
	
	
}

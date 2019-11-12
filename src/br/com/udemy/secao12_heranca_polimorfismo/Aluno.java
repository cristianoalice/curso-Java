package br.com.udemy.secao12_heranca_polimorfismo;
/*
Benef�cios da HERAN�A:
- Evita a repeti��o de c�digo;
- Facilita a manuten��o do programa;

- Classe espec�fica
- Sub-classe
- Classe filha
 */

//Aluno � uma Pessoa
/*Quando uma classe herda de outra classe ela ganha todos os
/atributos e m�todos das classes herdadas
*/


public class Aluno extends Pessoa_classe_pai{

	//Atributos
	private String ra;
	
//Construtor
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super (nome, ano_nascimento, email); // Pessoa(nome, ano_nascimento);
		this.ra = ra;
	}
	
	
	
//M�todos get e set	
	public String getRa() {
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}	
	//Overriding ou sobrescrita de m�todo
	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}
	//Overriding ou sobrescrita de m�todo
	public String getNome() {
		return "Aluno: \n" +super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
	
}

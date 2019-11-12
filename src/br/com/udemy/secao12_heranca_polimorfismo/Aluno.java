package br.com.udemy.secao12_heranca_polimorfismo;
/*
Benefícios da HERANÇA:
- Evita a repetição de código;
- Facilita a manutenção do programa;

- Classe específica
- Sub-classe
- Classe filha
 */

//Aluno é uma Pessoa
/*Quando uma classe herda de outra classe ela ganha todos os
/atributos e métodos das classes herdadas
*/


public class Aluno extends Pessoa_classe_pai{

	//Atributos
	private String ra;
	
//Construtor
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super (nome, ano_nascimento, email); // Pessoa(nome, ano_nascimento);
		this.ra = ra;
	}
	
	
	
//Métodos get e set	
	public String getRa() {
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}	
	//Overriding ou sobrescrita de método
	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}
	//Overriding ou sobrescrita de método
	public String getNome() {
		return "Aluno: \n" +super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
	
}

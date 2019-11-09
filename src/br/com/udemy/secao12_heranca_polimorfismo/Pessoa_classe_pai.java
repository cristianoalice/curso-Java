package br.com.udemy.secao12_heranca_polimorfismo;

/*
- Classe base
- Classe mãe
- Classe pai
- Super classe
- Classe genérica
*/


public class Pessoa_classe_pai {
//Atributos
	private String nome;
	private int ano_nascimento;
	private String email;
	
//construtor	
	public Pessoa_classe_pai(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
		
//Métodos get e set	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() { return "Nome: " + this.nome + "\nAno de nascimento: " +
	this.ano_nascimento; }
	
	
	
	
	
	
}

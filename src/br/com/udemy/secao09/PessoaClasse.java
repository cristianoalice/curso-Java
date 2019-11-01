package br.com.udemy.secao09;
//Classes

//Atributos

//Construtores

/*
- Sempre um construtor vazio tem a seguinte forma:
	public NomeDaClasse() {}
 * 
 */

public class PessoaClasse {
	public String nome, email;
	public int ano_nascimento;
	
	public PessoaClasse() {
		
	}
	
	// Construtor com parâmetros
	public PessoaClasse(String nome, String email, int ano_nascimento) {
		// this == Este objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	public void imprime_informacoes() {
		System.out.println("Nome:" + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de nascimento:" + this.ano_nascimento);
	}
	
}

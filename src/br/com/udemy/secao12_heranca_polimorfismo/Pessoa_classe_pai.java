package br.com.udemy.secao12_heranca_polimorfismo;

/*
- Classe base
- Classe m�e
- Classe pai
- Super classe
- Classe gen�rica
*/

//Agora como classe abstrata (Desta forma impossibilitamos a cria��o de objetos desta classe)
/*
Uma classe abstrata pode ter:
	- atributos;
	- m�todos;
	- m�todos abstratos

- M�TODOS ABSTRATOS:
- S�o m�todos que n�o possuem implementa��o, possuem apenas declara��o e,
  as classes que herdarem desta classe com m�todos abstratos
  dever�o implementar estes m�todos.
		
 */

public abstract class Pessoa_classe_pai {
//Atributos
	private String nome;
	private int ano_nascimento;
	private String email;
	
//construtor	
	public Pessoa_classe_pai() {
	}
		
	public Pessoa_classe_pai(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
		
//M�todos get e set	
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
	
	//Overriding ou sobrescrita de m�todo
	public String toString() {
		return "Nome: " + this.nome + "\nAno de nascimento: " +	this.ano_nascimento;
	}
	//Overloading ou sobrecarga de m�todo
	public void mensagem() {
		System.out.println("Esta � a minha mensagem...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
		
	}
	
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
		
	}
	//Declara��o de um m�todo abstrato
	public abstract void outra_mensagem(String texto);
	
	
}

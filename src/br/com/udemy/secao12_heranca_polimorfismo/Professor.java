package br.com.udemy.secao12_heranca_polimorfismo;

public class Professor extends Pessoa_classe_pai{
	private String matricula;
	
	public Professor(String nome, int ano_nascimento, String email, String matricula) {
	super (nome, ano_nascimento, email);
	this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return super.toString() + "\nMatrícula: " + this.matricula;
	}
	
	public String getNome() {
		return "Professor: \n" +super.getNome();
	}
	
	

}

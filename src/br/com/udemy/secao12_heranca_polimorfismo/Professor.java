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
	//Overriding ou sobrescrita de método
	public String toString() {
		return super.toString() + "\nMatrícula: " + this.matricula;
	}
	//Overriding ou sobrescrita de método
	public String getNome() {
		return "Professor: \n" +super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
	
	

}

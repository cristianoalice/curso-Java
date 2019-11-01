package br.com.udemy.secao09;
//Construtor

/*
- O construtor de uma classe SEMPRE tem o mesmo nome da classe;
- Por padrão, a JVM - Java Virtual Machine, cria em temp de execução, um contrutor padrão (construtor vazio);
- Podemos ter mais de um construtor na classe;
 */

public class Programa24 {

	public static void main(String[] args) {
		
		
		PessoaClasse pessoa1 = new PessoaClasse(); //(Método) Construtor
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		
		pessoa1.imprime_informacoes();
		
			
		PessoaClasse pessoa2 = new PessoaClasse("Joana Dar'c", "dark@gmail.com", 1835); //(Método) Construtor
		pessoa2.imprime_informacoes();
		
	}

}

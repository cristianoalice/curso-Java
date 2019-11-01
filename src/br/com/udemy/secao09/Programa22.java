package br.com.udemy.secao09;

//Objetos
/*
 - Objetos são produtos/instâncias da classe;
 
 
 
 */

public class Programa22 {

	public static void main(String[] args) {
		int numero = 4;
		
		//Declaração de um objeto
		ProdutoClasse p0;
		
		//Declaração e instanciação/iniciação do objeto
		//p1 --> instância do objeto / objeto
		ProdutoClasse p1 = new ProdutoClasse(); //Construtor
		
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("============= Produtos =============");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + "%");
		
		p0 = new ProdutoClasse(); //Construtor
		p0.nome = "Caneta Bic";
		p0.preco = 2.09f;
		p1.desconto = 5;
		
		System.out.println("============= Produtos =============");
		System.out.println(p0.nome);
		System.out.println("R$ " + p0.preco);
		System.out.println(p0.desconto + "%");
		
		PessoaClasse pessoa1 = new PessoaClasse(); //Construtor
		
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1975;
		
		System.out.println("============= Pessoas =============");
		System.out.println("Nome:" + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email);
		System.out.println("Ano de nascimento:" + pessoa1.ano_nascimento);
		


	}

}

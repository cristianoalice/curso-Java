package br.com.udemy.secao11_modificadores_acesso;

//Modificadores de acesso

//Encapsulamento

public class Cliente {
//atributo
		private String nome;
		private String endereco;
		
//construtor
		public Cliente(String nome, String endereco) {
			this.nome = nome;
			this.endereco = endereco;
		}
		
//m�todo
		
		
		//PROTECTED
		/*
		-O modificador de acesso "Protected" faz com qu o elemento seja vis�vel somente dentro do mesmo 
		pacote onde o elemento foi declarado.
		
		- � o modificador de acesso padr�o (mosmo n�o aparecendo descritivamente)		
		 */
		protected void dizer_oi() {
			System.out.println(this.nome + " est� dizendo, Oii, tudo bem?!!");
		}
		public String getNome() {
			return this.nome;
		}
		public String getEndereco() {
			return this.endereco;
		}
		

}



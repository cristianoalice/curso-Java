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
		
//método
		
		
		//PROTECTED
		/*
		-O modificador de acesso "Protected" faz com qu o elemento seja visível somente dentro do mesmo 
		pacote onde o elemento foi declarado.
		
		- É o modificador de acesso padrão (mosmo não aparecendo descritivamente)		
		 */
		protected void dizer_oi() {
			System.out.println(this.nome + " está dizendo, Oii, tudo bem?!!");
		}
		public String getNome() {
			return this.nome;
		}
		public String getEndereco() {
			return this.endereco;
		}
		

}



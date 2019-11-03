//Modificadores de acesso

//Encapsulamento

package br.com.udemy.secao11;

public class Cliente {
//atributo
		private String nome;
		private String endereco;
		
//construtor
		public Cliente(String nome, String endereco) {
			this.nome = nome;
			this.endereco = endereco;
			
			this.dizer_oi();
		}
		
//método
		private void dizer_oi() {
			System.out.println(this.nome + " está dizendo, Oii, tudo bem?!!");
		}
		public String getNome() {
			return this.nome;
		}
		public String getEndereco() {
			return this.endereco;
		}
		

}



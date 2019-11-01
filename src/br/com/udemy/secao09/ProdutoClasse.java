package br.com.udemy.secao09;
//Classe
/*
- O nome das classes inicia com letra maiúscula;
- O nome não deve conter: acentuação, caracteres especiais, espaço;
- Nas classes Java, não existe a imnplementação da função main();
- O nome da classe Java DEVE ser o mesmo nome do arquivo java;
- Toda a classe Java possui a seguinte forma:
public class NomeDaClasse{
}
- Tudo que tiver dentro das "chaves" faz parte da classe;
 */


//Atributos
/*
- São as características da classe/molde/modelo de dados;
- Podemos entender "atributos" como variáveis da classe;
- Uma outra forma de nomenclatura para os "atributos" são estados da classe;
- "Atributos são nomeados em letras minúsculas, sem espaços, sem caracteres especiais, sem acentuação.
 */


//Métodos
/*
- Podemos entender os métodos como a ação que é realizada por um objeto da classe;
- podemos entender também que os métodos são comportamentos da classe;
- 
- Mesmos requisitos para funções
	Uma função deve ter as seguintes informações:
	a) Tipo de retorno (Tipo de dado que a função vai retornar);
	b) Nome - corresponde à ação que a função realiza;
	c) Parâmetros / argumentos de entrada (opcional);
	d) Retorno (Opcional e depende do tipo de retorno);
-
-
 */

public class ProdutoClasse {
	
		String nome;
		float preco;
		float desconto;
		
		//Método para aumentar o preço do produto em 10
		void aumentar_preco(float valor) {
			this.preco = this.preco + valor;
		}
	}

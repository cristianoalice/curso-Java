package br.com.udemy.secao13_classes_abstratas;

import java.security.AlgorithmConstraints;

import br.com.udemy.secao12_heranca_polimorfismo.Aluno;


//CLASSES ABSTRATAS

/*

- � um recurso que proporciona um bloqueio na cria��o de objetos;
- N�o conseguimos instanciar objetos de uma classe abstrata;
 


 */
public class Programa31 {

	public static void main(String[] args) {
		Aluno zoraide = new Aluno("Zoraide da Silva", 1533, "zoraidera@hotmail.com", "12112019");
		System.out.println(zoraide);
		zoraide.outra_mensagem("Meu nome � " + zoraide.getNome());
	}

}

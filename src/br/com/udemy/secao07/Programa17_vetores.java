package br.com.udemy.secao07;

// Vetores parte 2

public class Programa17_vetores {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("O tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			//numeros[0] = i + 3; // 0 + 3
			numeros[i] = i + 3;
			//numeros[9] = i + 3 // 9 + 3;
		}
		
		System.out.println(numeros[0]); //primeiro elemento
		System.out.println(numeros[9]); //último elemento
		
		/*
		0....9
		numeros[10] = 42;
		System.out.println(numeros[10]);
		Os vetores/arrays possuem tamanho fixo e não podem ser aumentados/diminuídos
		*/
		
		
		numeros[0] = 7;
		System.out.println(numeros[0]); //primeiro elemento
		
		/*
		numeros[0] = 23.4f;
		Não aceitam tipos de dados variados
		 */
			
		
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		
			
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//último elemento
			
			
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		System.out.println(Math.round(Math.random() * 10));
		
		for (int i : numeros) {
			System.out.println(i);
			
		}
		
		
	}

}

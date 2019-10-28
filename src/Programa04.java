// if, else, else if

public class Programa04 {
	public static void main(String[] args) {
		// Declarando e inicializando a variável
		int num1 = 4 ;
		
		/*
		 * if / Se o número for maior que 5 
		 * escreva ("Sim, o número " + num1 + " é maior que 5.")
		 * 
		 * else if / senão se o número for igual a 5
		 * escreva ("O número " + num1 + " é igual a  5.");
		 * 
		 * else / senão
		 * escreva ("Não, o número " + num1 + " não é maior que 5.");
		 * 
		 */
		if (num1 > 5) {
			System.out.println("Sim, o número " + num1 + " é maior que 5.");
		}else if (num1 == 5) {
			System.out.println("O número " + num1 + " é igual a 5.");
		// verificando se o número é par
		}else if (num1 % 2 == 0) {
			System.out.println("O número " + num1 + " é par.");
		}else {
			System.out.println("Não, o número " + num1 + " não é maior que 5.");
		}
				
				
			
			
	}

}

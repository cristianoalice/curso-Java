package exercicios;
import java.util.Scanner;

// exercício 3 comentário teste

public class Exercicio_3 {
	public static void main(String[] args) {
		int num1, num2, num3, num4;
		int soma;
		Scanner teclado = new Scanner (System.in);
		String x = "remou";
		String y = "surfou";
		
		
		System.out.println("Quantas vezes você "+y+" na 1ª semana do mês?");
		num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Quantas vezes você "+y+" na 2ª semana do mês?");
		num2 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Quantas vezes você "+y+" na 3ª semana do mês?");
		num3 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Quantas vezes você "+y+" na última semana do mês?");
		num4 = Integer.parseInt(teclado.nextLine());
		
		soma = num1 + num2 + num3 + num4;
		
		System.out.println("Você surfou " +soma+ " vezes no mês passado.");
		
		if (soma > 20) {
			System.out.println("Parabéns!! Você surfou bastante!! Continue assim...");
		
		}else if (soma > 10 & soma < 20) {
			System.out.println("Legal!! Mas você pode mais!! Vá remar...");
			
		}else {
			System.out.println("Xiii!! Você não está salgando a carcaça de forma correta!! Vá remar...");
		}
				
			
			
	}

}

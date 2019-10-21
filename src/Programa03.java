import java.util.Scanner;

// exercício 3

public class Programa03 {
	public static void main(String[] args) {
		int num1, num2, num3, num4;
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Quantas vezes vocês surfou na 1ª semana do mês?");
		num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Quantas vezes vocês surfou na 2ª semana do mês?");
		num2 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Quantas vezes vocês surfou na 3ª semana do mês?");
		num3 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Quantas vezes vocês surfou na última semana do mês?");
		num4 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Você surfou " + (num1 + num2 + num3 + num4) + " vezes no mês passado.");
		
		if (num1 + num2 + num3 + num4 > 15) {
			System.out.println("Parabéns!! Você surfou bastante!! Continue assim...");
		}else {
			System.out.println("Legal!! Mas você pode mais!! Vá remar...");
		}
				
			
			
	}

}

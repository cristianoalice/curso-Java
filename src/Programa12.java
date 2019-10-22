// Tipos de dados
// Numéricos (Inteiros e Reais)

public class Programa12 {
	
	public static void main(String[] args) {
		// tipos primários/primitivos
		//Por padrão, os números reais em Java são considerados Double
		float preco1 = 23.4f; // 23.40
		double preco2 = 23.4f; // 23.434343543545343545343545
		
		
		// tipos não primários/primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		
		System.out.println("float -> preço 1 = " + preco1);
		System.out.println("double -> preço 2 = " + preco2);
		System.out.println("Float -> preço 3 = " + preco3);
		System.out.println("Double -> preço 4 = " + preco4);
		
		System.out.println("float/Float " + Float.SIZE + " bits");
		System.out.println("double/Double " + Double.SIZE + " bits");
		
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		System.out.println("char/Character " + Character.SIZE + " bits");

		System.out.println("Valor mínimo float/Float " + Float.MIN_VALUE);
		System.out.println("Valor máximo float/Float " + Float.MAX_VALUE);
				
		System.out.println("Valor mínimo double/Double " + Double.MIN_VALUE);
		System.out.println("Valor máximo double/Double " + Double.MAX_VALUE);	
		
		
		
		
	}

}

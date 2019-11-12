package br.com.udemy.secao12_heranca_polimorfismo;
//HERANÇA




public class Programa28 {

	public static void main(String[] args) {
//		Pessoa_classe_pai p1 = new Pessoa_classe_pai("Sepé Tiarajú", 1978, "sepe@gmail.com");
//		
//		System.out.println(p1);
//		System.out.println(p1.getNome());
//		System.out.println("\n");
		
		//System.out.println(p1.getNome());
		
		Aluno a1 = new Aluno("Santos Dumont", 1922, "santos@gmail.com", "123456");
		
		System.out.println(a1);
		System.out.println(a1.getNome());
		System.out.println("\n");
		
		//System.out.println(a1.getNome());
		
		Professor prof1 = new Professor ("Hipócrates Medicine", 1847, "hipotop@gmail.com", "TOP987");
		//System.out.println(prof1.getNome());
		System.out.println(prof1);
		System.out.println(prof1.getNome());
	}

}

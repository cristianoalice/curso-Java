package br.com.udemy.secao12_heranca_polimorfismo;
//HERANÇA




public class Programa28 {

	public static void main(String[] args) {
		Pessoa_classe_pai p1 = new Pessoa_classe_pai("Sepé Tiarajú", 1978, "sepe@gmail.com");
		
		System.out.println(p1.getNome());
		
		Aluno a1 = new Aluno("Santos Dumont", 1922, "123456", "santos@gmail.com");
		
		System.out.println(a1.getNome());
		
		Professor prof1 = new Professor ("Hipócrates Medicine", 1847, "TOP987", "hipotop@gmail.com");
		System.out.println(prof1.getNome());
	}

}

package br.com.udemy.secao11_modificadores_acesso;
//Encapsulamento  -->
public class Programa25 {
	
	public static void main(String[] args) {
		Cliente John = new Cliente("John Macalister", "Rua da paz, 45");
		Cliente Mary = new Cliente("Mary Jane", "Rua da paz, 45");
		
		Conta conta1 = new Conta(1, 100.0f, 200f, John);
		Conta conta2 = new Conta(2, 300.0f, 500f, Mary);
		
		System.out.println("Saldo do Sr. John (a.saque): " + conta1.getSaldo());
		System.out.println("Saldo da Sra. Mary: " + conta2.getSaldo());
		
		conta1.sacar(150);
		System.out.println("Saldo do Sr. John (d.saque): " + conta1.getSaldo());
		
		
		
	}

}

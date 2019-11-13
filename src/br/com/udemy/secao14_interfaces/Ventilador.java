package br.com.udemy.secao14_interfaces;

public class Ventilador implements IEletronico {
	private boolean ligado = false;
	
	
	@Override
	public void ligar() {
		if(!this.ligado) {
			this.ligado = true;
			System.out.println("O ventilador está ligado");
		}
	}

	@Override
	public void desligar() {
		if(this.ligado) {
			this.ligado = false;
			System.out.println("O ventilador está desligado");
		}
	}

}

package br.com.udemy.secao13_classes_abstratas;

//Template Method

/*
final � um modificador de acesso que faz com que o elemento que esteja
      utilizando, n�o possa ser extendido ou reescrito. 
 */
public abstract class Treinamento {
	
	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
		
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino t�tico ...");
		
	}
		
	

}

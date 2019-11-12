package br.com.udemy.secao13_classes_abstratas;

public class TreinamentoFimDaTemporada extends Treinamento {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico para o fim da temporada...");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo treino para o final da temporada...");
		
	}

}

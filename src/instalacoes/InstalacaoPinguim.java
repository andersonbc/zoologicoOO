package instalacoes;

import animais.Pinguim;
import enums.Localizacao;
import intefaces.Animal;
import modelos.ElementoInstalacao;
import modelos.Instalacao;
import modelos.Tanque;

public class InstalacaoPinguim extends Instalacao{
	private static final int CAPACIDADE_MAXIMA = 25;
	private static final double TEMPERATURA = 15.0;
	private static final double LITROS = 100.0;
	
	public InstalacaoPinguim(Localizacao localizacao) {
		super();
		this.capacidadeMaxima = CAPACIDADE_MAXIMA;
		this.localizacao = localizacao;
		this.temperatura = TEMPERATURA;
		this.animaisInstalados = new Animal[CAPACIDADE_MAXIMA];
		
		ElementoInstalacao tanque = new Tanque(LITROS);
		this.listaElementoInstalacao.add(tanque);
	}

	@Override
	public Boolean temCapacidade() {
		return this.animaisAlocados < CAPACIDADE_MAXIMA;
	}

	@Override
	public Boolean permiteAnimalNaInstalacao(Animal animal) {
		return animal instanceof Pinguim;
	}
}

package instalacoes;

import animais.PeixeBoi;
import enums.Localizacao;
import intefaces.Animal;
import modelos.ElementoInstalacao;
import modelos.Instalacao;
import modelos.Tanque;

public class InstalacaoPeixeBoi extends Instalacao{
	private static final int CAPACIDADE_MAXIMA = 7;
	private static final double TEMPERATURA = 18.0;
	private static final double LITROS = 750.0;
	
	public InstalacaoPeixeBoi(Localizacao localizacao) {
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
		return animal instanceof PeixeBoi;
	}
}

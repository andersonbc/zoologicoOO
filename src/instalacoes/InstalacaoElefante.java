package instalacoes;

import java.util.Arrays;

import animais.Elefante;
import enums.Localizacao;
import intefaces.Animal;
import modelos.ElementoInstalacao;
import modelos.Instalacao;
import modelos.Jaula;

public class InstalacaoElefante extends Instalacao{
	private static final int CAPACIDADE_MAXIMA = 2;
	private static final double TEMPERATURA = 23.0;
	private static final double ALTURA = 20.0;
	private static final double LARGURA = 30.0;
	private static final double COMPRIMENTO = 25.0;
	
	public InstalacaoElefante(Localizacao localizacao) {
		super();
		this.capacidadeMaxima = CAPACIDADE_MAXIMA;
		this.localizacao = localizacao;
		this.temperatura = TEMPERATURA;
		this.animaisInstalados = new Animal[CAPACIDADE_MAXIMA];
		
		ElementoInstalacao jaula = new Jaula(ALTURA, LARGURA, COMPRIMENTO);
		this.listaElementoInstalacao.add(jaula);
	}

	@Override
	public String toString() {
		return "InstalacaoElefante [capacidadeMaxima=" + capacidadeMaxima + ", localizacao=" + localizacao
				+ ", temperatura=" + temperatura + ", animaisInstalados=" + Arrays.toString(animaisInstalados)
				+ ", listaElementoInstalacao=" + listaElementoInstalacao + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Boolean temCapacidade() {
		return this.animaisAlocados < CAPACIDADE_MAXIMA;
	}

	@Override
	public Boolean permiteAnimalNaInstalacao(Animal animal) {
		return animal instanceof Elefante;
	}

	
	
}

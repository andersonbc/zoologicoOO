package instalacoes;


import animais.Macaco;
import enums.Localizacao;
import intefaces.Animal;
import modelos.ElementoInstalacao;
import modelos.Instalacao;
import modelos.Jaula;

public class InstalacaoMacaco extends Instalacao {
	private static final int CAPACIDADE_MAXIMA = 10;
	private static final double TEMPERATURA = 25.0;
	private static final double ALTURA = 40.0;
	private static final double LARGURA = 35.7;
	private static final double COMPRIMENTO = 90.0;
	
	public InstalacaoMacaco(Localizacao localizacao) {
		super();
		this.capacidadeMaxima = CAPACIDADE_MAXIMA;
		this.localizacao = localizacao;
		this.temperatura = TEMPERATURA;
		this.animaisInstalados = new Animal[CAPACIDADE_MAXIMA];
		
		ElementoInstalacao jaula = new Jaula(ALTURA, LARGURA, COMPRIMENTO);
		this.listaElementoInstalacao.add(jaula);
	}

	@Override
	public Boolean temCapacidade() {
		return this.animaisAlocados < CAPACIDADE_MAXIMA;
	}

	@Override
	public Boolean permiteAnimalNaInstalacao(Animal animal) {
		return animal instanceof Macaco;
	}
	
}

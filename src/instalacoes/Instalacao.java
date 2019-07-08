package instalacoes;
import animais.Animal;
import enums.Localizacao;

public abstract class Instalacao {
	private int capacidadeMaxima;
	private Localizacao localizacao;
	private double temperatura;
	private Animal[] animaisInstalados; 
	
	public boolean instalaAnimal(Animal animal) {
		return true;
	}

}

package modelos;

import java.util.ArrayList;
import java.util.List;

import enums.Localizacao;
import intefaces.Animal;

public abstract class Instalacao {
	
	protected int capacidadeMaxima;
	protected int animaisAlocados = 0;
	protected Localizacao localizacao;
	protected Double temperatura;
	protected Animal[] animaisInstalados;
	protected List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<>();
	
	
	public boolean instalaAnimal(Animal animal) {
		
		if(this.temCapacidade() && this.permiteAnimalNaInstalacao(animal)) {
			for(int i=0; i < this.animaisInstalados.length; i++) {
			
				if(this.animaisInstalados[i] == null) {
					this.animaisInstalados[i] = animal;
					this.animaisAlocados++;
					System.out.println("Animal instalado com sucesso!");
					return true;
				}
			}
		}
		
		System.out.println("Erro! Não foi possível instalar o animal");
		
		return false;
	}
	
	public abstract Boolean temCapacidade();
	
	public abstract Boolean permiteAnimalNaInstalacao(Animal animal);
}

package modelos;

import java.util.HashSet;
import java.util.Set;

import enums.Localizacao;

public class Zoologico {

	private Set<Instalacao> instalacoes = new HashSet<Instalacao>();
	
	public void addInstalacao(Instalacao instalacao) {	
		if(jaPossuiInstalacaoNaMesmaLocalizacao(instalacao.localizacao)){
			System.out.println("Erro! J� existe uma instala��o na localiza��o " + instalacao.localizacao + ".");
		}
		else {
			instalacoes.add(instalacao);
			System.out.println("Instala��o adicionada com sucesso!");
		}
	}
	
	private boolean jaPossuiInstalacaoNaMesmaLocalizacao(Localizacao localizacao) {
		return this.instalacoes.stream()
				.filter(i -> i.localizacao.equals(localizacao))
				.count() > 0 ? true : false;
	}
	
	
}

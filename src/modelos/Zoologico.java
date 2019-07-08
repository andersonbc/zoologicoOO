package modelos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import enums.Localizacao;

public class Zoologico {

	private Set<Instalacao> instalacoes = new HashSet<Instalacao>();
	
	public void addInstalacao(Instalacao instalacao) {	
		if(jaPossuiInstalacaoNaMesmaLocalizacao(instalacao.localizacao)){
			System.out.println("Erro! Já existe uma instalação na localização " + instalacao.localizacao + ".");
		}
		else {
			instalacoes.add(instalacao);
			System.out.println("Instalação adicionada com sucesso!");
		}
	}
	
	private boolean jaPossuiInstalacaoNaMesmaLocalizacao(Localizacao localizacao) {
		return this.instalacoes.stream()
				.filter(i -> i.localizacao.equals(localizacao))
				.count() > 0 ? true : false;
	}
	
	
}

package modelos;

import enums.Localizacao;
import instalacoes.InstalacaoBaleia;
import instalacoes.InstalacaoElefante;
import instalacoes.InstalacaoFoca;
import instalacoes.InstalacaoLeao;
import instalacoes.InstalacaoMacaco;
import instalacoes.InstalacaoPeixeBoi;
import instalacoes.InstalacaoPinguim;
import instalacoes.InstalacaoTartaruga;
import instalacoes.InstalacaoTubarao;
import instalacoes.InstalacaoZebra;

public class FabricaInstalacao {
	
	public static Instalacao criarInstalacaoElefante(Localizacao localizacao) {
		return new InstalacaoElefante(localizacao);
	}
	
	public static Instalacao criarInstalacaoZebra(Localizacao localizacao) {
		return new InstalacaoZebra(localizacao);
	}
	
	public static Instalacao criarInstalacaoLeao(Localizacao localizacao) {
		return new InstalacaoLeao(localizacao);
	}
	
	public static Instalacao criarInstalacaoMacaco(Localizacao localizacao) {
		return new InstalacaoMacaco(localizacao);
	}
	
	public static Instalacao criarInstalacaoTartaruga(Localizacao localizacao) {
		return new InstalacaoTartaruga(localizacao);
	}
	
	public static Instalacao criarInstalacaoFoca(Localizacao localizacao) {
		return new InstalacaoFoca(localizacao);
	}
	
	public static Instalacao criarInstalacaoBaleia(Localizacao localizacao) {
		return new InstalacaoBaleia(localizacao);
	}
	
	public static Instalacao criarInstalacaoPinguim(Localizacao localizacao) {
		return new InstalacaoPinguim(localizacao);
	}
	
	public static Instalacao criarInstalacaoPeixeBoi(Localizacao localizacao) {
		return new InstalacaoPeixeBoi(localizacao);
	}
	
	public static Instalacao criarInstalacaoTubarao(Localizacao localizacao) {
		return new InstalacaoTubarao(localizacao);
	}
}

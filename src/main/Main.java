package main;

import animais.Elefante;
import animais.Macaco;
import animais.Tartaruga;
import animais.Tubarao;
import enums.Alimento;
import enums.Localizacao;
import enums.Sexo;
import intefaces.Animal;
import modelos.FabricaInstalacao;
import modelos.Instalacao;
import modelos.Zoologico;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("TESTANDO TERRESTRES COM ELEFANTE\n");
		Animal elefante = new Elefante(Sexo.MASCULINO);
		Animal elefante2 = new Elefante(Sexo.FEMININO);
		Animal elefante3 = new Elefante(Sexo.MASCULINO);
			
		System.out.println("SEXO ELEFANTE: " + elefante.getSexo());
		System.out.println("SEXO ELEFANTE2: " + elefante2.getSexo());
		
		System.out.print("ELEFANTE LOCOMOÇÃO: ");
		elefante.locomover();
		
		System.out.println("ELEFANTE COME FRUTAS: " + elefante.alimentar(Alimento.FRUTAS));
		System.out.println("ELEFANTE COME CARNES: " + elefante.alimentar(Alimento.CARNES));
		
		Instalacao instalacaoElefante = FabricaInstalacao.criarInstalacaoElefante(Localizacao.SUL);
		Instalacao instalacaoElefante2 = FabricaInstalacao.criarInstalacaoElefante(Localizacao.SUL);
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("ADICIONANDO INSTALAÇÕES\n");
		Zoologico zoo = new Zoologico();
		zoo.addInstalacao(instalacaoElefante);
		zoo.addInstalacao(instalacaoElefante2);

		System.out.println("\n----------------------------------------------------------------------------------------");
		
		System.out.println("ADICIONANDO ANIMAIS NA INSTALAÇÃO PARA ELEFANTE\n");
		
		System.out.print("Testando com animal de tipo correto: ");		
		instalacaoElefante.instalaAnimal(elefante);
		instalacaoElefante.instalaAnimal(elefante2);
		System.out.println();
		
		
		Animal macaco = new Macaco(Sexo.MASCULINO);
		System.out.print("Testando com animal de outro tipo: ");
		System.out.println(instalacaoElefante.instalaAnimal(macaco));
		
		//Estourando capacidade da instalação
		System.out.print("\nAlém da capacidade da instalação: ");
		System.out.println(instalacaoElefante.instalaAnimal(elefante3));
		
		System.out.println("\n----------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		
		
	
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("TESTANDO AQUATICO COM TUBARÃO\n");
		Animal tubarao = new Tubarao(Sexo.MASCULINO);
		Animal tubarao2 = new Tubarao(Sexo.FEMININO);
			
		System.out.println("SEXO TUBARAO: " + tubarao.getSexo());
		System.out.println("SEXO TUBARAO2: " + tubarao2.getSexo());
		
		System.out.print("TUBARAO LOCOMOÇÃO: ");
		tubarao.locomover();
		
		System.out.println("TUBARAO COME FRUTAS: " + tubarao.alimentar(Alimento.FRUTAS));
		System.out.println("TUBARAO COME CARNES: " + tubarao.alimentar(Alimento.CARNES));
		
		Instalacao instalacaoTubarao = FabricaInstalacao.criarInstalacaoTubarao(Localizacao.NORTE);
		Instalacao instalacaoTubarao2 = FabricaInstalacao.criarInstalacaoTubarao(Localizacao.SUL);
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("ADICIONANDO INSTALAÇÕES\n");
		zoo.addInstalacao(instalacaoTubarao);
		zoo.addInstalacao(instalacaoTubarao2);

		System.out.println("\n----------------------------------------------------------------------------------------");
		
		System.out.println("ADICIONANDO ANIMAIS NA INSTALAÇÃO PARA TUBARAO\n");
		
		System.out.print("Testando com animal de tipo correto: ");		
		instalacaoTubarao.instalaAnimal(tubarao);
		instalacaoTubarao.instalaAnimal(tubarao2);
		System.out.print("Testando com animal de tipo errado: ");
		instalacaoTubarao.instalaAnimal(elefante3);
		System.out.println();
		
		
		System.out.println("\n----------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("TESTANDO ANFIBIO COM TARTARUGA\n");
		Animal tartaruga = new Tartaruga(Sexo.MASCULINO);
		Animal tartaruga2 = new Tartaruga(Sexo.FEMININO);
			
		System.out.println("SEXO TARTARUGA: " + tartaruga.getSexo());
		System.out.println("SEXO TARTARUGA2: " + tartaruga2.getSexo());
		
		System.out.print("TARTARUGA LOCOMOÇÃO: ");
		tartaruga.locomover();
		
		System.out.println("TARTARUGA COME FRUTAS: " + tartaruga.alimentar(Alimento.FRUTAS));
		System.out.println("TARTARUGA COME CARNES: " + tartaruga.alimentar(Alimento.CARNES));
		
		Instalacao instalacaoTartaruga = FabricaInstalacao.criarInstalacaoTartaruga(Localizacao.NORDESTE);
		Instalacao instalacaoTartaruga2 = FabricaInstalacao.criarInstalacaoTubarao(Localizacao.NORTE);
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("ADICIONANDO INSTALAÇÕES\n");
		zoo.addInstalacao(instalacaoTartaruga);
		zoo.addInstalacao(instalacaoTartaruga2);

		System.out.println("\n----------------------------------------------------------------------------------------");
		
		System.out.println("ADICIONANDO ANIMAIS NA INSTALAÇÃO PARA TARTARUGA\n");
		
		System.out.print("Testando com animal de tipo correto: ");		
		instalacaoTartaruga.instalaAnimal(tartaruga);
		instalacaoTartaruga.instalaAnimal(tartaruga2);
		System.out.print("Testando com animal de tipo errado: ");
		instalacaoTartaruga.instalaAnimal(elefante3);
		System.out.println();
		
		
		System.out.println("\n----------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		
	}
	
	


}

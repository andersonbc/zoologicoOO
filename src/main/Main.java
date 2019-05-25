package main;

import animais.Elefante;
import animais.Macaco;
import enums.Alimento;
import enums.Sexo;

public class Main {

	public static void main(String[] args) {
		
		Elefante elefante = CriaElefante();
		Macaco macaco = CriaMacaco();
		
	}
	
	public static Elefante CriaElefante() {
		Elefante elefante = new Elefante(Sexo.MASCULINO);
		elefante.andar();
		System.out.println(elefante.getSexo());
		System.out.println(elefante.alimentar(Alimento.FRUTAS));
		System.out.println(elefante.alimentar(Alimento.CARNES));
		
		return elefante;
	}
	
	public static Macaco CriaMacaco() {
		Macaco macaco = new Macaco(Sexo.MASCULINO);
		macaco.andar();
		System.out.println(macaco.getSexo());
		System.out.println(macaco.alimentar(Alimento.FRUTAS));
		System.out.println(macaco.alimentar(Alimento.CARNES));
		
		return macaco;
	}

}

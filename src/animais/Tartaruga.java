package animais;

import java.util.HashSet;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import intefaces.Anfibio;

public class Tartaruga implements Anfibio {

	private Porte porte;
	private Sexo sexo;
	private HashSet<Alimento> come;
	
	public Tartaruga(Sexo sexo){		
		this.porte = Porte.PEQUENO;
		this.sexo = sexo;
		
		this.come = new HashSet<Alimento>();
		come.add(Alimento.FRUTAS);
		come.add(Alimento.VERDURAS);
		come.add(Alimento.PEIXES);
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		return come.contains(alimento);
	}

	@Override
	public void locomover() {
		this.nadar();
		this.andar();
	}

	@Override
	public Sexo getSexo() {
		return this.sexo;
	}

	@Override
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;		
	}

	@Override
	public Porte getPorte() {
		return this.porte;
	}

	@Override
	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	@Override
	public void andar() {
		System.out.println("estou andando!");		
	}
	
	@Override
	public void nadar() {
		System.out.println("estou nandando!");		
	}

}

package animais;

import enums.Porte;
import enums.Sexo;
import intefaces.Terrestre;

import java.util.HashSet;

import enums.Alimento;

public class Macaco implements Terrestre {

	private Porte porte;
	private Sexo sexo;
	private HashSet<Alimento> come;
	
	public Macaco(Sexo sexo){		
		this.porte = Porte.PEQUENO;
		this.sexo = sexo;
		
		this.come = new HashSet<Alimento>();
		come.add(Alimento.FRUTAS);
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		return come.contains(alimento);
	}

	@Override
	public void locomover() {
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

}

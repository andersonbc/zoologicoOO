package animais;

import java.util.HashSet;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import intefaces.Terrestre;

public class Zebra implements Terrestre {

	private Porte porte;
	private Sexo sexo;
	private HashSet<Alimento> come;
	
	public Zebra(Sexo sexo){		
		this.porte = Porte.MEDIO;
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

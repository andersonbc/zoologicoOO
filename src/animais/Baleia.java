package animais;

import java.util.HashSet;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;

public class Baleia implements Aquatico {

	private Porte porte;
	private Sexo sexo;
	private HashSet<Alimento> come;
	
	public Baleia(Sexo sexo){		
		this.porte = Porte.GRANDE;
		this.sexo = sexo;
		
		this.come = new HashSet<Alimento>();
		come.add(Alimento.PEIXES);
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		return come.contains(alimento);
	}

	@Override
	public void locomover() {
		this.nadar();
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
	public void nadar() {
		System.out.println("estou nandando!");		
	}

}

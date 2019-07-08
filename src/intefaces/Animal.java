package intefaces;

import enums.Porte;
import enums.Sexo;
import enums.Alimento;

public interface Animal {
	public boolean alimentar(Alimento alimento);	
	public void locomover();
	public Sexo getSexo();
	public void setSexo(Sexo sexo);
	public Porte getPorte();
	public void setPorte(Porte porte);	
}

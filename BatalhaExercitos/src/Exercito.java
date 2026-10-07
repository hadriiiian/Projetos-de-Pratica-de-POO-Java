import java.util.ArrayList;

public class Exercito {
	private ArrayList<Unidade> unidades = new ArrayList<Unidade>();
	
	//getters
	public ArrayList<Unidade> getUnidades() {
		return unidades;
	}
	
	//setters
	public void setUnidades(ArrayList<Unidade> unidades) {
		this.unidades = unidades;
	}
	
	public boolean add(Unidade u) {
		if (u != null) {
			unidades.add(u);
			return true;
		}
		return false;
	}
	
	public void delUnidade(Unidade u) {
		unidades.remove(u);
	}
}

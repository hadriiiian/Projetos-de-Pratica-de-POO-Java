public class Infantaria extends Unidade{

	public boolean ganhaQuandoAtacadoPor(Unidade u) {
		return (u instanceof Cavalaria);
	}

	public String toString() {
		return "Infantaria";
	}
	
}

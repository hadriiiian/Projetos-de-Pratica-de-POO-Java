public class Cavalaria extends Unidade {

	public boolean ganhaQuandoAtacadoPor(Unidade u) {
		return (u instanceof Catapulta);
	}

	public String toString() {
		return "Cavalaria";
	}
	
}

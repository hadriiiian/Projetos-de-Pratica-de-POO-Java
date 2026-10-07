public class Catapulta extends Unidade{

	public boolean ganhaQuandoAtacadoPor(Unidade u) {
		return (u instanceof Infantaria);
	}

	public String toString() {
		return "Catapulta";
	}
	
}

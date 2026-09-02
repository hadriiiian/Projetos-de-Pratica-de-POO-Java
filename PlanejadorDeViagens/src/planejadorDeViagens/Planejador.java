package planejadorDeViagens;

public class Planejador {
	public int estimarAbastecimentos(Carro c, int dist) {
		float abst = (float) ((dist / c.getAutonomia()) / c.getCapacidadeDoTanque());
		int aFinal = (int) Math.ceil(abst);
		return aFinal;
	}
}

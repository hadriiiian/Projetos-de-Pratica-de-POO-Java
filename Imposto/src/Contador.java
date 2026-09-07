public class Contador {
	public static float calcularImpostoPJ(ContaBancariaPJ c) {
		float impostoPJ = (float) ((c.getSaldo() * (0.1 * c.getTitular().getQtdFunc())) / 12);
		return impostoPJ;
	}
	public static float calcularImpostoPF(ContaBancariaPF c) {
		float impostoPF = (float) ((c.getSaldo() * 0.1) / 12);
		return impostoPF;
	}
}

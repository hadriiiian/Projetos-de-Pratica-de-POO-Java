public class Carta {
	private String naipe;
	private String numeracao;
	private int valor;
	
	//construtor
	public Carta(String na, String nu, int v) {
		naipe = na.substring(0,1).toUpperCase() + na.substring(1);
		numeracao = nu;
		valor = v;
	}
	
	//getters
	public String getNaipe() {
		return naipe;
	}
	public String getNumeracao() {
		return numeracao;
	}
	public int getValor() {
		return valor;
	}
	
	public String toString() {
		return String.format("%s de %s", numeracao, naipe);
	}
	
}

public class ContaCorrente {
	private float saldo;
	private String titular;
	private String numero;
	
	//getters
	public float getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public String getNumero() {
		return numero;
	}
	
	//setters
	public void setSaldo(float f) {
		saldo = f;
	}
	public void setTitular(String s) {
		titular = s;
	}
	public void setNumero(String s) {
		numero = s;
	}
	
	public boolean ehIgual(ContaCorrente c) {
		return (numero.equals(c.getNumero()));
	}
}

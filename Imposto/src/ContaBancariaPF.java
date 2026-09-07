public class ContaBancariaPF {
	private float saldo;
	private String titular;
	private String numero;
	private TipoDeConta tipo;
	
	//construtor
	public ContaBancariaPF(Float s, String tt, String n, TipoDeConta tp) {
		saldo = s;
		titular = tt;
		numero = n;
		tipo = tp;
	}
	
	public String toString() {
		return String.format("""
				==============================
				
				PF:
				Nome: %s;
				Número da conta: %s;
				Saldo: R$%.2f;
				Tipo da conta: %s;
				Imposto à ser pago: R$%.2f
				
				==============================
				""", titular, numero, saldo, tipo, Contador.calcularImpostoPF(this));
	}
	
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
	public TipoDeConta getTipo() {
		return tipo;
	}
	
}

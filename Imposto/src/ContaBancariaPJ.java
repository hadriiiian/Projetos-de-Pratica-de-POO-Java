public class ContaBancariaPJ {
	private float saldo;
	private PessoaJuridica titular;
	private String numero;
	private TipoDeConta tipo;
	
	//construtor
	public ContaBancariaPJ(Float s, PessoaJuridica tt, String n, TipoDeConta tp) {
		saldo = s;
		titular = tt;
		numero = n;
		tipo = tp;
	}
	
	public String toString() {
		return String.format("""
				==============================
				
				RESPONSÁVEL:
				Nome do responsável: %s
				Estado civil do resposável: %s
				Idade do responsável: %d
				
				==============================
				
				PJ:
				Nome: %s;
				CNPJ: %s
				Quantidade de funcionários: %d
				Responsável: %s
				Número da conta: %s;
				Saldo: R$%.2f;
				Tipo da conta: %s;
				Imposto à ser pago: R$%.2f
				
				==============================
				""", titular.getResponsavel().getNome(), titular.getResponsavel().getEstado(), titular.getResponsavel().getIdade(),
				titular.getNome(),titular.getCnpj(), titular.getQtdFunc(), titular.getResponsavel().getNome(), numero, saldo, tipo, Contador.calcularImpostoPJ(this));
	}
	
	//getters
	public float getSaldo() {
		return saldo;
	}
	public PessoaJuridica getTitular() {
		return titular;
	}
	public String getNumero() {
		return numero;
	}
	public TipoDeConta getTipo() {
		return tipo;
	}
	
}

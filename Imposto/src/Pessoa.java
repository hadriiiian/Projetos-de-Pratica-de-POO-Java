public class Pessoa {
	private String nome;
	private EstadoCivil estado;
	private int idade;
	
	//construtor
	public Pessoa() {
		new Pessoa();
	}
	public Pessoa(String n, EstadoCivil e, int i) {
		nome = n;
		estado = e;
		idade = i;
	}
	
	public String toString() {
		return "" + nome + ", " + estado + ", " + idade + " anos";
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	public EstadoCivil getEstado() {
		return estado;
	}
	public int getIdade() {
		return idade;
	}
}

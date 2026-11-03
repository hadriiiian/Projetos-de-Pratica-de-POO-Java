import java.time.Year;

public class Pessoa {
	private String nome;
	private int anoNascimento;
	private int idade;

	// construtor
	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.idade = Year.now().getValue() - anoNascimento;
	}

	public Pessoa(String nome, String anoNascimento) {
		this(nome, Integer.parseInt(anoNascimento.trim()));
	}

	// getters
	public String getNome() {
		return nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public int getIdade() {
		return idade;
	}

	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
		this.idade = Year.now().getValue() - anoNascimento;
	}

	@Override
	public String toString() {
		return String.format("%s: %d anos (nasc. %d)", nome, idade, anoNascimento);
	}
}

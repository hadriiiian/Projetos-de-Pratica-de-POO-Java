import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
	private String dataNasc;
	private int idade;
	

	//construtor
	public Pessoa(String nome, String dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		
		String[] partes = dataNasc.split("/");
		int dia = Integer.valueOf(partes[0]);
		int mes = Integer.valueOf(partes[1]);
		int ano = Integer.valueOf(partes[2]);
		
		LocalDate nasc = LocalDate.of(ano, mes, dia);
		LocalDate hoje = LocalDate.now();
		Period p = Period.between(nasc, hoje);
		idade = p.getYears();
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	public String getAnoNasc() {
		return dataNasc;
	}
	public int getIdade() {
		return idade;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAnoNasc(String anoNasc) {
		this.dataNasc = anoNasc;
	}
	
	public String toString() {
		return String.format("%s: %s", nome, dataNasc);
	}
	
}

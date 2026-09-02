
public class Pessoa {
	private String nome;
	private String sexo;
	private float peso;
	private int altura;
	private int idade;


	
	//getters
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public float getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public int getIdade() {
		return idade;
	}
	

	//setters
	public void setNome(String newValue) {
		nome = newValue;
	}
	public void setSexo(String newValue) {
		sexo = newValue;
	}
	public void setPeso(float newValue) {
		peso = newValue;
	}
	public void setAltura(int newValue) {
		altura = newValue;
	}
	public void setIdade(int newValue) {
		idade = newValue;
	}
}

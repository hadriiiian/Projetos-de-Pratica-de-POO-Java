public class Jogador {
	
	private String nome;
	private int qtdPontos = 0;
	
	//getters
	public String getNome() {
		return nome;
	}
	public int getQtdPontos() {
		return qtdPontos;
	}
	
	//construtor
	public Jogador(String n) {
		nome = n;
	}
	
	public void adicionarPontos() {
		qtdPontos++;
	}

}

public class Jogador {
	private String nome;
	private Exercito exercito;
	private float dinheiro = 1200;
	
	//getters
	public String getNome() {
		return nome;
	}
	public Exercito getExercito() {
		return exercito;
	}
	public float getDinheiro() {
		return dinheiro;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setExercito(Exercito exercito) {
		this.exercito = exercito;
	}
	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	//construtor
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	public Unidade escolherUnidade() {
		int i = (int) (Math.random() * exercito.getUnidades().size());
		return exercito.getUnidades().get(i);
	}
	
	public void descontar() {
		dinheiro -= 100;
	}
	
}

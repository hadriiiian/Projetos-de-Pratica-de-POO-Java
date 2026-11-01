public class Pookemon {
	private String nome;
	private String tipo;
	private int nivel;

	private Ataque ataqueA;
	private Ataque ataqueB;
	private Ataque ataqueC;
	private Ataque ataqueD;

	public Pookemon(String nome, String tipo, int nivel) {
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.ataqueA = new SemAtaque();
		this.ataqueB = new SemAtaque();
		this.ataqueC = new SemAtaque();
		this.ataqueD = new SemAtaque();
	}

	public void ataqueA() {
		ataqueA.atacar();
	}

	public void ataqueB() {
		ataqueB.atacar();
	}

	public void ataqueC() {
		ataqueC.atacar();
	}

	public void ataqueD() {
		ataqueD.atacar();
	}

	public void aprenderAtk(Ataque a) {
		if (ataqueA instanceof SemAtaque) {
			ataqueA = a;
		} else if (ataqueB instanceof SemAtaque) {
			ataqueB = a;
		} else if (ataqueC instanceof SemAtaque) {
			ataqueC = a;
		} else if (ataqueD instanceof SemAtaque) {
			ataqueD = a;
		} else {
			System.out.println(nome + " ja conhece 4 ataques. Use substituirAtk para trocar um deles.");
		}
	}

	public void substituirAtk(int posicao, Ataque a) {
		if (posicao == 1) {
			ataqueA = a;
		} else if (posicao == 2) {
			ataqueB = a;
		} else if (posicao == 3) {
			ataqueC = a;
		} else if (posicao == 4) {
			ataqueD = a;
		} else {
			System.out.println("Posicao invalida: " + posicao);
		}
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNivel() {
		return nivel;
	}
}

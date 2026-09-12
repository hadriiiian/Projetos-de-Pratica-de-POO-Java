public class Jogo {
	private Peca[] pecas = new Peca[28];
	private int indicePeca = 0;
	
	public Jogo() {
		int i = 0;
		for (int a = 0; a <= 6; a++) {
			for (int b = a; b <= 6; b++) {
				pecas[i++] = new Peca(a, b);
			}
		}
	}
	
	public void embaralharPecas() {
		for (int i = 0; i < 100; i++) {
			int r1 = (int) (Math.random() * 28);
			int r2 = (int) (Math.random() * 28);
			
			Peca backup = pecas[r1];
			pecas[r1] = pecas[r2];
			pecas[r2] = backup;
		}
		indicePeca = 0;
	}
	
	public Peca puxarPeca() {
		return indicePeca == 28? null : pecas[indicePeca++];
	}
}

public class Jogador {
	private Peca[] mao = new Peca[6];
	private int qtdPecas = 0;
	
	//getter
	public Peca[] getMao() {
		return mao;
	}
	public int getQtdPecas() {
		return qtdPecas;
	}
	
	public void delPeca(int i) {
		if (i >= 0 && i < qtdPecas) {
			for (int j = i; j < qtdPecas - 1; j++) {
				mao[j] = mao[j+1];
			}
			mao[qtdPecas - 1] = null;
			qtdPecas--;
		}
	}
	
	public void addPeca(Peca p) {
		if (qtdPecas < mao.length) {
	        mao[qtdPecas++] = p;
	    }
	}
	
	public void iniciarMao(Jogo j, int qtdInicio) {
		for (int i = 0; i < qtdInicio; i++) {
			addPeca(j.puxarPeca());
		}
	}
	
	public String toString() {
		String mao = "{";
		for (int i = 0; i < qtdPecas; i++) {
			if (this.mao[i] != null)
				mao += this.mao[i].toString();
			else
				mao += " ";
			
			if (i < qtdPecas - 1)
				mao += ", ";
		}
		return mao + "}";
	}
}

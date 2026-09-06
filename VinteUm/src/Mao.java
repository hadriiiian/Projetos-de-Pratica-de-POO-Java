public class Mao {
	private Carta[] baralho = new Carta[12];
	private int qtdCartas;
	
	public void addCartas(Carta c) {
		baralho[qtdCartas++] = c;
	}
	
	public int totalDePontosAtual() {
		int qtdA = 0;
		int pontos = 0;
		
		for (Carta c: baralho) {
			if (c != null) {
				if (c.getNumeracao().equals("Ás")) 
					qtdA++;
				 else 
					pontos += c.getValor();
			}
			
		}

		if (qtdA == 0)
	        return pontos; 
		
		int pontosA = pontos + (qtdA - 1);
		
		if (pontosA <= 10) 
	        return pontosA + 11; 
	    else
	        return pontosA + 1; 
	    
	}
	
	public String toString() {
		String retorno = "[";
		
		for (int i = 0; i < qtdCartas; i++) {
	        retorno += baralho[i].toString();
	        
	        if (i < qtdCartas - 1) {
	            retorno += ", ";
	        }
	    }
		retorno += String.format("] (%d pontos)", this.totalDePontosAtual());
		return retorno;
	}
}

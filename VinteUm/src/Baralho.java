public class Baralho {
	private Carta[] cartas = new Carta[52];
	private int indice = 0;
	
	//construtor
	public Baralho() {
		
		int indexCartas = 0;
				
		String[] naipes = {"Copas", "Ouro", "Espadas", "Paus"};
		
		String[] numeracoes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		
		for (int na = 0; na < 4; na++) {
									
			for (int nu = 0; nu < 13; nu++) {
				
				int valor = switch (numeracoes[nu]) {
	                case "Ás" -> 1;
	                case "Valete", "Dama", "Rei" -> 10;
	                default -> Integer.parseInt(numeracoes[nu]);
				};
				
				Carta c = new Carta(naipes[na], numeracoes[nu], valor);
				
				cartas[indexCartas++] = c;
			}
		}
		
		this.embaralhar(10000);
	}
	
	public void embaralhar(int vezes) {
		for (int i = 0; i < vezes; i++) {
			int random1 = (int) (Math.random() * 52);
			int random2 = (int) (Math.random() * 52);
			while (random1 == random2) {
				random2 = (int) (Math.random() * 52);
			}
			
			Carta backup = cartas[random1];
			cartas[random1] = cartas[random2];
			cartas[random2] = backup;
		}
	}
	
	public Carta puxarCarta() {
		if (indice == 52) 
			return null;
		return cartas[indice++];
	}
}

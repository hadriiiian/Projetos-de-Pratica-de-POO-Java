import java.util.Scanner;
public class Unomino {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("""
				%s DOMINÓ %s 
				""", "=".repeat(6), "=".repeat(6));
		
		Jogo game = new Jogo();
		game.embaralharPecas();
		
		Jogador player = new Jogador();
		player.iniciarMao(game, 6);
		
		Peca piece = game.puxarPeca();
		
		int qtdPontos = 0;
		
		while (true) {
			System.out.printf("Peça da vez: %s%n", piece.toString());
			
			System.out.printf("Peças da mão: %s%n", player.toString());
			
			System.out.printf("""
					Que peça deseja jogar? (1 à %d) 
					>>> """, player.getQtdPecas());
			int choice = Integer.valueOf(input.nextLine());
			
			if (player.getMao()[choice - 1].validarJuncao(piece)) {
				System.out.printf("%s se conecta com %s%n",player.getMao()[choice - 1].toString(), piece.toString());
				piece = player.getMao()[choice - 1];
				player.delPeca(choice - 1);
				qtdPontos++;
				if (player.getQtdPecas() == 0) {
					System.out.printf("""
							PARABÉNS! Você venceu!
							Sua pontuação foi de %d pontos.
							""", qtdPontos);
					break;
				}
			} else {
				System.out.printf("""
						%s não se conecta com %s
						Você perdeu! Fim de Jogo.
						Sua pontuação foi de %d pontos.
						""",player.getMao()[choice - 1].toString(), piece.toString(),
						qtdPontos);
				break;
			}
		}
		
		input.close();
			
	}
}

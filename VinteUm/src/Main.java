import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Baralho deck = new Baralho();
		
		Mao player = new Mao();
		Mao cpu = new Mao();
		
		System.out.printf("%s VINTE E UM %s%n", "=".repeat(6), "=".repeat(6));
		
		player.addCartas(deck.puxarCarta());
		player.addCartas(deck.puxarCarta());
		
		System.out.printf("""
				SUAS CARTAS SÃO:
				%s
				""", player.toString());
		Carta cCpu = deck.puxarCarta();
		
		cpu.addCartas(cCpu);
		System.out.printf("A PRIMEIRA CARTA QUE O ADVERSÁRIO RECEBEU FOI: %s.", cCpu.toString());
		
		cpu.addCartas(deck.puxarCarta());
		
		System.out.println("=".repeat(12));
		
		while (true) {
			System.out.println("""
					O QUE DESEJA FAZER AGORA?
					[ 1 ] - Puxar uma nova carta
					[ 2 ] - Encerrar o jogo
					>>> """);
			int choice = Integer.valueOf(input.nextLine());
			while (choice != 1 && choice != 2) {
				System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
				choice = Integer.valueOf(input.nextLine());
			}
			
			if (choice == 1) {
				Carta cPla = deck.puxarCarta(); 
				System.out.printf("Você tirou %s.%n", cPla.toString());
				player.addCartas(cPla);
				if (player.totalDePontosAtual() > 21) {
					System.out.printf("""
							VOCÊ PERDEU!
							MÃO DO ADVERSÁRIO: %s
							""", cpu.toString());
					break;
				}
				
				cpu.addCartas(deck.puxarCarta());
				if (cpu.totalDePontosAtual() > 21) {
					System.out.printf("""
							VOCÊ GANHOU!
							MÃO DO ADVERSÁRIO: %s
							""", cpu.toString());
					break;
				}
				
				System.out.println("=".repeat(12));

			} else if (choice == 2) {
				System.out.printf("""
		                RESULTADO FINAL:
		                [ JOGADOR ]  %s x %s [ CPU ]
		                """, player.toString(), cpu.toString());
				break;
			}
		}

        System.out.println("=".repeat(12));
		
        int pontosJogador = player.totalDePontosAtual();
        int pontosCpu = cpu.totalDePontosAtual();
        
        System.out.printf("""
                RESULTADO FINAL:
                [ JOGADOR ] %s x %s [ CPU ]
                """, player.toString(), cpu.toString());
                
        if (pontosJogador > pontosCpu) {
            System.out.println("PARABÉNS! VOCÊ VENCEU!");
        } else if (pontosCpu > pontosJogador) {
            System.out.println("O ADVERSÁRIO VENCEU!");
        } else {
            System.out.println("DEU EMPATE!");
        }
		
        System.out.println("=".repeat(12));

        input.close();
    }
}

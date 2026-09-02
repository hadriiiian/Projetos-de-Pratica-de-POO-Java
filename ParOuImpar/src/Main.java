import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do jogador: ");
		Jogador player = new Jogador(input.nextLine());
		
		Jogador cpu = new Jogador("Máquina");
		
		while (player.getQtdPontos() < 10 && cpu.getQtdPontos() < 10) {		
			int cpuChoice = (int) (Math.random() * 11);
			
			System.out.print("Digite um número de 0 à 10 (Você é par): ");
			int playerChoice = Integer.valueOf(input.nextLine());
			
			int result = cpuChoice + playerChoice;
			System.out.printf("A cpu jogou %d.%n", cpuChoice);

			if (result % 2 == 0) {
				System.out.printf("O jogador %s ganhou essa partida.%n", player.getNome());
				player.adicionarPontos();
			} else {
				System.out.printf("O jogador %s ganhou essa partida.%n", cpu.getNome());
				cpu.adicionarPontos();
			}
		}
		
		System.out.printf("""
				%s PLACAR %s
				[ CPU ] %d x %d [ %s ]
				""", "=".repeat(6), "=".repeat(6),
				cpu.getQtdPontos(), player.getQtdPontos(), player.getNome()
				);
		
		if (cpu.getQtdPontos() > player.getQtdPontos())
			System.out.printf("O vencedor do jogo foi a %s!", cpu.getNome());
		else if (player.getQtdPontos() > cpu.getQtdPontos())
			System.out.printf("O vencedor do jogo foi o jogador %s!", player.getNome());
		
		input.close();
	}
}

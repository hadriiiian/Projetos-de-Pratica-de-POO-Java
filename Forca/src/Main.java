import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 
		Palavra[] words = new Palavra[10];
 
		for (int i = 0; i < words.length; i++) {
			System.out.print("Digite uma palavra: ");
			String word = input.nextLine().trim();
			System.out.print("Digite uma dica para a palavra: ");
			String hint = input.nextLine().trim();
 
			words[i] = new Palavra(word, hint);
		}
 
		JogoDaForca game = new JogoDaForca(words);
		game.sortear();
		
		if (game.getPosSorteada() == -1) {
			System.out.println("Não há palavras disponíveis para sortear.");
			input.close();
			return;
		}
		
		int fails = 0;
 
		System.out.printf("%s JOGO DA FORCA %s%n", "=".repeat(6), "=".repeat(6));
 
		while (!game.acabou()) {
			System.out.printf("""
					%s
					%s
					Dica: %s
					Qual letra deseja testar?\s""", "-".repeat(27),
					game.getGabarito(),
					game.getDicaPalavra());
 
			String line = input.nextLine();
			if (line.isEmpty())
				continue;
			char letter = line.charAt(0);
 
			if (game.testarLetra(letter)) {
				System.out.printf("%s está na palavra!%n", letter);
			} else {
				System.out.printf("%s não está na palavra.%n", letter);
				fails++;
			}
		}
 
		System.out.println(game.getGabarito());
		int total = game.getGabarito().length();
		int pontuation = 2 * total - fails;
		System.out.println("Fim de jogo! Pontuação: " + pontuation);
 
		input.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		JogoMatematico game = new JogoMatematico();
		
		int ctdQ = 0;
		int ctdA = 0;
		int ctdE = 0;
		
		while (ctdE < 3) {
			ctdQ++;
			
			game.sortearCalculo();
			
			System.out.printf("""
					%s 	QUESTÃO %d %s
					%s = ?
					>>> """, "=".repeat(6), ctdQ, "=".repeat(6),
					game.getCalculo());
			int answer = Integer.valueOf(input.nextLine());
			
			if (answer == game.getResposta()) {
				System.out.println("Parabéns! Você acertou.");
				ctdA++;
			} else {
				System.out.println("Não foi dessa vez.. Você errou :(");
				ctdE++;
			}
		}
		
		System.out.printf("Você acertou %d questões antes de errar pela 3ª vez.", ctdA);
		
		input.close();
	}
}

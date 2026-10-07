import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do Player 1: ");
		Jogador p1 = new Jogador(input.nextLine());
		Exercito exercitoP1 = new Exercito();
		while (p1.getDinheiro() > 0) {
			System.out.printf("""
					%s
					Qual você unidade o Player 1 deseja comprar?
					[ 1 ] - Cavalaria (R$100,00)
					[ 2 ] - Catapulta (R$100,00)
					[ 3 ] - Infantaria (R$100,00)
					Saldo: R$%.2f
					>>> """, "=".repeat(30), p1.getDinheiro());
			int choice = Integer.valueOf(input.nextLine());
			
			if (choice == 1) {
				exercitoP1.add(new Cavalaria());
				p1.descontar();
			} else if (choice == 2) {
				exercitoP1.add(new Catapulta());
				p1.descontar();
			} else if (choice == 3) {
				exercitoP1.add(new Infantaria());
				p1.descontar();
			} else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}
		}
		p1.setExercito(exercitoP1);
		
		System.out.println("=".repeat(30));
		
		System.out.print("Digite o nome do player 2: ");
		Jogador p2 = new Jogador(input.nextLine());
		Exercito exercitoP2 = new Exercito();
		while (p2.getDinheiro() > 0) {
			System.out.printf("""
					%s
					Qual você unidade o Player 2 deseja comprar?
					[ 1 ] - Cavalaria (R$100,00)
					[ 2 ] - Catapulta (R$100,00)
					[ 3 ] - Infantaria (R$100,00)
					Saldo: R$%.2f
					>>> """, "=".repeat(30), p2.getDinheiro());
			int choice = Integer.valueOf(input.nextLine());
			
			if (choice == 1) {
				exercitoP2.add(new Cavalaria());
				p2.descontar();
			} else if (choice == 2) {
				exercitoP2.add(new Catapulta());
				p2.descontar();
			} else if (choice == 3) {
				exercitoP2.add(new Infantaria());
				p2.descontar();
			} else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}
		}
		p2.setExercito(exercitoP2);
		
		int pontuacaoP1 = 0;
		int pontuacaoP2 = 0;
		while (p1.getExercito().getUnidades().size() > 0 && p2.getExercito().getUnidades().size() > 0) {
			System.out.println("=".repeat(30));
			
			Unidade escolhidoP1 = p1.escolherUnidade();
			Unidade escolhidoP2 = p2.escolherUnidade();
			
			System.out.printf("""
					[ %s ] %s x %s [ %s ]%n""", p1.getNome(), escolhidoP1, escolhidoP2, p2.getNome());
			
			boolean resultado = escolhidoP1.ganhaQuandoAtacadoPor(escolhidoP2);
			
			if(resultado == true) {
				System.out.printf("""
						%s VENCEU A RODADA!
						%s vence de %s.%n""", p1.getNome().toUpperCase(), escolhidoP1, escolhidoP2);
				p2.getExercito().delUnidade(escolhidoP2);
				pontuacaoP1++;
			} else if (resultado == false){
				System.out.printf("""
						%s VENCEU A RODADA!
						%s vence de %s.%n""", p2.getNome().toUpperCase(), escolhidoP2, escolhidoP1);
				p1.getExercito().delUnidade(escolhidoP1);
				pontuacaoP2++;
			} else if (escolhidoP1.equals(escolhidoP2)) {
				System.out.println("""
						EMPATE!
						As duas unidades são iguais.""");
			}
		}
		
		System.out.printf("""
				%s
				O JOGO ACABOU!
				[ %s ] %d x %d [ %s ]
				""", "=".repeat(30), p1.getNome(), pontuacaoP1, pontuacaoP2, p2.getNome());
		
		if (pontuacaoP1 > pontuacaoP2) {
			System.out.printf("%s VENCEU!", p1.getNome().toUpperCase());
		} else if (pontuacaoP1 < pontuacaoP2) {
			System.out.printf("%s VENCEU!", p2.getNome().toUpperCase());
		} else {
			System.out.println("EMPATE!");
		}
		
		input.close();
	}
}

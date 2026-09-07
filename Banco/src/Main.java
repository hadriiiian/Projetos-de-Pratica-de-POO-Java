import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Banco bank = new Banco();
		
		while (true) {
			System.out.print("""
					==== BANCO ====
					
					[ 1 ] - Cadastrar uma nova conta
					[ 2 ] - Consultar saldo de uma conta
					[ 3 ] - Sair
					>>> """);
			int choice = Integer.valueOf(input.nextLine());
			
			switch (choice) {
			case 1:
				ContaCorrente account = new ContaCorrente();
				
				System.out.print("Digite o nome do titular da conta: ");
				account.setTitular(input.nextLine());
				System.out.print("Digite o número da conta: ");
				account.setNumero(input.nextLine());
				System.out.print("Digite quanto deseja depositar na conta: ");
				account.setSaldo(Float.valueOf(input.nextLine()));
				
				boolean operation = bank.salvarConta(account);
				if (operation)
					System.out.println("Conta cadastrada com sucesso!");
				else
					System.out.println("A conta não foi cadastrada.");
				break;
			case 2:
				System.out.print("Qual o número da conta que deseja consultar? ");
				System.out.printf("R$ %.2f", bank.recuperarConta(input.nextLine()));
			case 3:
				System.out.println("Encerrando... Até a próxima!");
				return;
			default:
				System.out.println("Opção inválida!\n");
				break;
			}
			
			input.close();
		}		
	}
}

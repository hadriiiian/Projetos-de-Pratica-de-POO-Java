import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Você deseja informar os dados de uma pessoa Física ou Jurídica? ");
		TipoContaBancaria typeBank = TipoContaBancaria.valueOf(input.nextLine().toUpperCase());
		
		if (typeBank == TipoContaBancaria.FISICA) {			
			System.out.print("Digite o nome do titular da conta: ");
			String holder = input.nextLine();
			System.out.print("Digite o número da conta do titular: ");
			String number = input.nextLine();
			System.out.print("Digite o tipo da conta: ");
			TipoDeConta type = TipoDeConta.valueOf(input.nextLine().toUpperCase());
			System.out.print("Digite o quanto deseja depositar na conta: R$");
			float balance = Float.valueOf(input.nextLine());
			
			ContaBancariaPF fisicAccount = new ContaBancariaPF(balance, holder, number, type);
			
			System.out.printf(fisicAccount.toString());
		} else if (typeBank == TipoContaBancaria.JURIDICA) {
			System.out.print("Digite o nome do responsável pelo titular da conta: ");
			String name = input.nextLine();
			System.out.print("Digite o estado civil do responsável pelo titular da conta: ");
			EstadoCivil status = EstadoCivil.valueOf(input.nextLine().toUpperCase());
			System.out.print("Digite a idade do responsável pelo titular da conta: ");
			int age = Integer.valueOf(input.nextLine());
			
			Pessoa person = new Pessoa(name, status, age);
			
			System.out.print("Digite o nome do titular da conta: ");
			String holder = input.nextLine();
			System.out.print("Digite o CNPJ do titular da conta: ");
			String cnpj = input.nextLine();
			System.out.print("Digite a quantidade de funcionários do titular da conta: ");
			int qtd = Integer.valueOf(input.nextLine());
			
			PessoaJuridica juridic = new PessoaJuridica(holder, cnpj, qtd, person);
			
			System.out.print("Digite o número da conta do titular: ");
			String number = input.nextLine();
			System.out.print("Digite o tipo da conta: ");
			TipoDeConta type = TipoDeConta.valueOf(input.nextLine().toUpperCase());
			System.out.print("Digite o quanto deseja depositar na conta: R$");
			float balance = Float.valueOf(input.nextLine());
			
			ContaBancariaPJ juridicAccount = new ContaBancariaPJ(balance, juridic, number, type);
			
			System.out.printf(juridicAccount.toString());
		}
		
		input.close();
	}
}

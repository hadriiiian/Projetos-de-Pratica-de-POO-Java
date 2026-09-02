import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int ctd = 0;
		boolean tat1 = true;
		boolean alc1 = true;
		boolean tat2 = true;
		boolean alc2 = true;
		
		Scanner input = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		System.out.print("Digite a idade da primeira pessoa: ");
		int age1 = Integer.valueOf(input.nextLine());
		System.out.print("Digite o peso da primeira pessoa: ");
		float weight1 = Float.valueOf(input.nextLine());
		
		System.out.print("Digite se a primeira pessoa se tatuou no último ano [S/N]: ");
		String sTat1 = input.nextLine().trim().toLowerCase();
		while (!sTat1.equals("s") && !sTat1.equals("n")) {
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a primeira pessoa se tatuou no último ano [S/N]: ");
			sTat1 = input.nextLine().trim().toLowerCase();
		}
		tat1 = sTat1.equals("s");

		System.out.print("Digite se a primeira pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
		String sAlc1 = input.nextLine().trim().toLowerCase();
		while (!sAlc1.equals("s") && !sAlc1.equals("n")) {
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a primeira pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
			sAlc1 = input.nextLine().trim().toLowerCase();
		}
		alc1 = sAlc1.equals("s");
		
		p1.setIdade(age1);
		p1.setPeso(weight1);

		Pessoa p2 = new Pessoa();
		System.out.print("Digite a idade da segunda pessoa: ");
		int age2 = Integer.valueOf(input.nextLine());
		System.out.print("Digite o peso da segunda pessoa: ");
		float weight2 = Float.valueOf(input.nextLine());
		
		System.out.print("Digite se a segunda pessoa se tatuou no último ano [S/N]: ");
		String sTat2 = input.nextLine().trim().toLowerCase();
		while (!sTat2.equals("s") && !sTat2.equals("n")) {
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a segunda pessoa se tatuou no último ano [S/N]: ");
			sTat2 = input.nextLine().trim().toLowerCase();
		}
		tat2 = sTat2.equals("s");
		
		System.out.print("Digite se a segunda pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
		String sAlc2 = input.nextLine().trim().toLowerCase();
		while (!sAlc2.equals("s") && !sAlc2.equals("n")) {
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a segunda pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
			sAlc2 = input.nextLine().trim().toLowerCase();
		}
		alc2 = sAlc2.equals("s");
		
		p2.setIdade(age2);
		p2.setPeso(weight2);
		
		AtendenteDaEnfermaria attendant = new AtendenteDaEnfermaria();
		boolean avP1 = attendant.avaliarDoador(p1, tat1, alc1);
		if (avP1) {
			ctd++;
		}
		boolean avP2 = attendant.avaliarDoador(p2, tat2, alc2);
		if (avP2) {
			ctd++;
		}
		
		if (ctd == 0) {
			System.out.print("Não houve pessoas que podem doar sangue.");
		} else if (ctd == 1){
			System.out.printf("1 pessoa podem doar sangue.\n");
		} else {
			System.out.printf("%d pessoas podem doar sangue.\n", ctd);
		}
		
		input.close();
	}

}

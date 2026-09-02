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
		int age1 = input.nextInt();
		System.out.print("Digite o peso da primeira pessoa: ");
		float weight1 = input.nextFloat();
		System.out.print("Digite se a primeira pessoa se tatuou no último ano [S/N]: ");
		String sTat1 = (input.nextLine()).substring(0).toLowerCase();
		while ( ! sTat1.equals("s") || ! sTat1.equals("n")){
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a primeira pessoa se tatuou no último ano [S/N]: ");
			sTat1 = (input.nextLine()).substring(0).toLowerCase();
		}
		if (sTat1.equals("s")==true) {
			tat1 = true;
		} else if (sTat1.equals("n")) {
			tat1 = false;
		}
		System.out.print("Digite se a primeira pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
		String sAlc1 = (input.nextLine()).substring(0).toLowerCase();
		while ( ! sAlc1.equals("s") || ! sAlc1.equals("n")){
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a primeira pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
			sAlc1 = (input.nextLine()).substring(0).toLowerCase();
		}
		if (sAlc1.equals("s")==true) {
			alc1 = true;
		} else if (sAlc1.equals("n")) {
			alc1 = false;
		}
		p1.setIdade(age1);
		p1.setPeso(weight1);

		Pessoa p2 = new Pessoa();
		System.out.print("Digite a idade da primeira pessoa: ");
		int age2 = input.nextInt();
		System.out.print("Digite o peso da primeira pessoa: ");
		float weight2 = input.nextFloat();
		System.out.print("Digite se a primeira pessoa se tatuou no último ano [S/N]: ");
		String sTat2 = (input.nextLine()).substring(0).toLowerCase();
		while ( ! sTat2.equals("s") || ! sTat2.equals("n")){
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a primeira pessoa se tatuou no último ano [S/N]: ");
			sTat2 = (input.nextLine()).substring(0).toLowerCase();
		}
		if (sTat2.equals("s")==true) {
			tat2 = true;
		} else if (sTat2.equals("n")) {
			tat2 = false;
		}
		System.out.print("Digite se a primeira pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
		String sAlc2 = (input.nextLine()).substring(0).toLowerCase();
		while ( ! sAlc2.equals("s") || ! sAlc2.equals("n")){
			System.out.println("Opção INVÁLIDA!");
			System.out.print("Digite se a primeira pessoa ingeriu álcool nas últimas 12 horas [S/N]: ");
			sAlc2 = (input.nextLine()).substring(0).toLowerCase();
		}
		if (sAlc2.equals("s")==true) {
			alc2 = true;
		} else if (sAlc2.equals("n")) {
			alc2 = false;
		}
		p2.setIdade(age2);
		p2.setPeso(weight2);
		
		AtendenteDaEnfermaria attendant = new AtendenteDaEnfermaria();
		
		boolean avP1 = attendant.avaliarDoador(p1, tat1, alc1);
		if (avP1 == true ) {
			ctd++;
		}
		boolean avP2 = attendant.avaliarDoador(p2, tat2, alc2);
		if (avP2 == true ) {
			ctd++;
		}
		
		if (ctd == 0) {
			System.out.print("Não houveram pessoas que podem doar sangue.");
		} else {
			System.out.printf("%d pessoas podem doar sangue", ctd);
		}
	}

}

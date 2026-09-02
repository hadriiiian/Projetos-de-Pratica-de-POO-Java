import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o peso do paciente: ");
		float weight = Float.valueOf(input.nextLine());
		
		System.out.print("Digite o altura do paciente: ");
		float height = Float.valueOf(input.nextLine());
		
		Paciente p = new Paciente();
		p.setPeso(weight);
		p.setAltura(height);
		
		NutricionistaEnum n = new NutricionistaEnum();
		
		System.out.printf("O paciente está %s", n.avaliarIMC(p));
		
		input.close();
	}

}

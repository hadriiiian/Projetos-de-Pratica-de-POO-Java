import java.util.Scanner;

public class MainEnum {

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
		
		ResultadoIMC result = n.avaliarIMC(p);
		
		switch (result) {
		case BAIXO_PESO:
			System.out.print("O paciente está com baixo peso.");
			break;
		case NORMAL:
			System.out.print("O paciente está normal.");
			break;
		case SOBREPESO:
			System.out.print("O paciente está com sobrepeso.");
			break;
		case OBESIDADE:
			System.out.print("O paciente está com obesidade.");
			break;
		}
		
		input.close();
	}

}

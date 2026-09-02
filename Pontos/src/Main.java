import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ponto dot = new Ponto();
		
		System.out.print("Digite a coordenada X do primeiro par ordenado: ");
		dot.setX(Integer.valueOf(input.nextLine()));
		
		System.out.print("Digite a coordenada Y do primeiro par ordenado: ");
		dot.setY(Integer.valueOf(input.nextLine()));
		
		Ponto dot2 = new Ponto();
		
		System.out.print("Digite a coordenada X do segundo par ordenado: ");
		dot2.setX(Integer.valueOf(input.nextLine()));
		
		System.out.print("Digite a coordenada Y do segundo par ordenado: ");
		dot2.setY(Integer.valueOf(input.nextLine()));
		
		System.out.printf("O primeiro par ordenado se encontra no %s e o segundo se encontra no %s.%n", dot.quadrante(), dot2.quadrante());
		if (dot.ehIgual(dot2)) {
			System.out.println("O segundo par é igual ao primeiro.");
		} else {
			System.out.println("O segundo par não é igual ao primeiro.");
		}
		input.close();
	}

}

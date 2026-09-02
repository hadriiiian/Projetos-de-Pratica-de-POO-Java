package planejadorDeViagens;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a autonomia do carro: ");
		float autonomy = input.nextFloat();
		
		System.out.print("Digite a capacidade do tanque do carro: ");
		int capacity = input.nextInt();
		
		System.out.print("Digite a distância que você deseja viajar: ");
		int distance = input.nextInt();
		
		Carro car = new Carro();
		car.setAutonomia(autonomy);
		car.setCapacidadeDoTanque(capacity);
		
		Planejador planner = new Planejador();
		int supplies = planner.estimarAbastecimentos(car, distance);
		
		System.out.printf("Um carro com autonomia de %.1fkm/L e tanque com capacidade para %dL precisará fazer ", car.getAutonomia(), car.getCapacidadeDoTanque());
		if (supplies == 0) {
			System.out.printf("nenhum abastecimento para uma viagem de %dkm.", distance);
		}
		else if (supplies == 1) {
			System.out.printf("1 abastecimento para uma viagem de %dkm.", distance);
		}
		else {
			System.out.printf("%d abastecimentos para uma viagem de %dkm.", supplies, distance);
		}
		
		input.close();
	}
}

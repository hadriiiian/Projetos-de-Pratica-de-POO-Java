package agenteDeImportação;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tipo do produto: ");
		String type = input.nextLine();
		
		System.out.print("Digite o preço do produto: ");
		float price = input.nextFloat();
		
		ProdutoImportado product = new ProdutoImportado();
		product.setTipo(type);
		product.setPreco(price);
		
		AgenteDeImportacao agt = new AgenteDeImportacao();
		float cFinal = agt.converter(product) + agt.calcularImposto(product);
		
		System.out.printf("O custo final do produto %s é R$%.2f!", product.getTipo(), cFinal);
		
		input.close();
	}
}

import java.text.ParseException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		try {
			Cadastro c;
			ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			for (int i = 0; i < 4; i++) {
				c = new Cadastro();
				ArrayList<String> dados = c.cadastrar(i+1);
				
				Pessoa p = new Pessoa(dados.get(0), dados.get(1));
				
				pessoas.add(p);
			}
			Grade g = new Grade(pessoas);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
}

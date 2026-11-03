import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		for (int i = 0; i < 4; i++) {
			String nome = JOptionPane.showInputDialog(null, 
					"Digite o nome da " + (i + 1) + "ª pessoa:", 
					"Cadastro de Pessoas", 
					JOptionPane.QUESTION_MESSAGE);
			String anoStr = JOptionPane.showInputDialog(null, 
					"Digite o ano de nascimento de " + nome + ":", 
					"Cadastro de Pessoas", 
					JOptionPane.QUESTION_MESSAGE);

			int anoNasc = Integer.valueOf(anoStr != null ? anoStr.trim() : "0");
			pessoas.add(new Pessoa(nome, anoNasc));
		}

		new Grade(pessoas);
	}
}

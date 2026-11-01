import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String[] bandeiras = {"Alemanha", "França", "Camarões", "Holanda"};
		String escolha = (String) JOptionPane.showInputDialog(null, 
				"Qual País você escolhe?", 
				"Países", 
				JOptionPane.QUESTION_MESSAGE, 
				null,
				bandeiras, 
				bandeiras[0]);
		switch (escolha) {
		case "Alemanha":
			Alemanha a = new Alemanha();
			break;
		case "França":
			Franca f = new Franca();
			break;
		case "Camarões":
			Camaroes c = new Camaroes();
			break;
		case "Holanda":
			Holanda h = new Holanda();
			break;
		}
	}
}

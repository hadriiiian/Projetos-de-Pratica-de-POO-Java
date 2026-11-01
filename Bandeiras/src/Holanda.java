import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Holanda extends JFrame implements Bandeira{
	
	private static final long serialVersionUID = 1L;

	public Holanda() {
		desenhar();
		coresLabel();
	}

	public void desenhar() {
		setLayout(null);
		setSize(600, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Holanda");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void coresLabel() {
		JLabel vermelho = new JLabel();
		vermelho.setBounds(0, 0, 600, 133);
		vermelho.setBackground(Color.RED);
		vermelho.setOpaque(true);
		vermelho.setVisible(true);
		add(vermelho);
		
		JLabel branco = new JLabel();
		branco.setBounds(0, 133, 600, 133);
		branco.setBackground(Color.WHITE);
		branco.setOpaque(true);
		branco.setVisible(true);
		add(branco);
		
		JLabel azul = new JLabel();
		azul.setBounds(0, 264, 600, 133);
		azul.setBackground(Color.BLUE);
		azul.setOpaque(true);
		azul.setVisible(true);
		add(azul);
	}
}

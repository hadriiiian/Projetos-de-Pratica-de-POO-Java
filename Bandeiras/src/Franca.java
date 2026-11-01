import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Franca extends JFrame implements Bandeira{
	
	private static final long serialVersionUID = 1L;

	public Franca() {
		desenhar();
		coresLabel();
	}

	public void desenhar() {
		setLayout(null);
		setSize(600, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("França");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void coresLabel() {
		JLabel azul = new JLabel();
		azul.setBounds(0, 0, 190, 600);
		azul.setBackground(Color.BLUE);
		azul.setOpaque(true);
		azul.setVisible(true);
		add(azul);
		
		JLabel branco = new JLabel();
		branco.setBounds(190, 0, 200, 600);
		branco.setBackground(Color.WHITE);
		branco.setOpaque(true);
		branco.setVisible(true);
		add(branco);
		
		JLabel vermelho = new JLabel();
		vermelho.setBounds(380, 0, 210, 600);
		vermelho.setBackground(Color.RED);
		vermelho.setOpaque(true);
		vermelho.setVisible(true);
		add(vermelho);
	}
}

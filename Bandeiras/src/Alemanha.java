import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Alemanha extends JFrame implements Bandeira{
	
	private static final long serialVersionUID = 1L;

	public Alemanha() {
		desenhar();
		coresLabel();
	}

	public void desenhar() {
		setLayout(null);
		setSize(600, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Alemanha");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void coresLabel() {
		JLabel preto = new JLabel();
		preto.setBounds(0, 0, 600, 133);
		preto.setBackground(Color.BLACK);
		preto.setOpaque(true);
		preto.setVisible(true);
		add(preto);
		
		JLabel vermelho = new JLabel();
		vermelho.setBounds(0, 133, 600, 133);
		vermelho.setBackground(Color.RED);
		vermelho.setOpaque(true);
		vermelho.setVisible(true);
		add(vermelho);
		
		JLabel amarelo = new JLabel();
		amarelo.setBounds(0, 264, 600, 133);
		amarelo.setBackground(Color.YELLOW);
		amarelo.setOpaque(true);
		amarelo.setVisible(true);
		add(amarelo);
		
	}
	
}

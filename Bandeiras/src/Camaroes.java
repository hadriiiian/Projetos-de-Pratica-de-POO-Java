import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Camaroes extends JFrame implements Bandeira{
	
	private static final long serialVersionUID = 1L;

	public Camaroes() {
		desenhar();
		coresLabel();
		estrela();
	}

	public void desenhar() {
		setLayout(null);
		setSize(600, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Camarões");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void coresLabel() {
		JLabel verde = new JLabel();
		verde.setBounds(0, 0, 190, 600);
		verde.setBackground(new Color(0x35644C));
		verde.setOpaque(true);
		verde.setVisible(true);
		add(verde);
		
		JLabel vermelho = new JLabel();
		vermelho.setBounds(190, 0, 200, 600);
		vermelho.setBackground(Color.RED);
		vermelho.setOpaque(true);
		vermelho.setVisible(true);
		add(vermelho);
		
		JLabel amarelo = new JLabel();
		amarelo.setBounds(380, 0, 210, 600);
		amarelo.setBackground(new Color(0xFFC63B));
		amarelo.setOpaque(true);
		amarelo.setVisible(true);
		add(amarelo);
	}
	
	private void estrela() {
		ImageIcon i = new ImageIcon("Star.png");
		JLabel img = new JLabel(i);
		img.setVisible(true);
		img.setBounds(600, 420, 40, 40);
		add(img);
		setComponentZOrder(img, 0);
	}
}

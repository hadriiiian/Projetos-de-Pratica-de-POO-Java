import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grade extends JFrame{
	private static final long serialVersionUID = 1L;

	public Grade(ArrayList<Pessoa> p) {
		fundo();
		labels(p.get(0), p.get(1), p.get(2), p.get(3));
	}
	
	private void fundo() {
		setSize(415, 437);
		setTitle("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setVisible(true);
	}
	
	private void labels(Pessoa pe1, Pessoa pe2, Pessoa pe3, Pessoa pe4) {
		JLabel p1 = new JLabel(pe1.getNome());
		p1.setBounds(0, 0, 200, 200);
		p1.setHorizontalAlignment(JLabel.CENTER);
		p1.setFont(new Font("Arial", Font.ITALIC, 30));
		p1.setToolTipText(String.valueOf(pe1.getIdade()));
		p1.setVisible(true);
		add(p1);
		
		JLabel p2 = new JLabel(pe2.getNome());
		p2.setBounds(200, 0, 200, 200);
		p2.setHorizontalAlignment(JLabel.CENTER);
		p2.setFont(new Font("Arial", Font.ITALIC, 30));
		p2.setToolTipText(String.valueOf(pe2.getIdade()));
		p2.setVisible(true);
		add(p2);
		
		JLabel p3 = new JLabel(pe3.getNome());
		p3.setBounds(0, 200, 200, 200);
		p3.setHorizontalAlignment(JLabel.CENTER);
		p3.setFont(new Font("Arial", Font.ITALIC, 30));
		p3.setToolTipText(String.valueOf(pe3.getIdade()));
		p3.setVisible(true);
		add(p3);
		
		JLabel p4 = new JLabel(pe4.getNome());
		p4.setBounds(200, 200, 200, 200);
		p4.setHorizontalAlignment(JLabel.CENTER);
		p4.setFont(new Font("Arial", Font.ITALIC, 30));
		p4.setToolTipText(String.valueOf(pe4.getIdade()));
		p4.setVisible(true);
		add(p4);
		
	}
}

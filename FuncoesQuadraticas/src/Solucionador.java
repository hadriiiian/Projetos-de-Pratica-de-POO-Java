import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Solucionador extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JLabel valorXLinha = new JLabel("?");
	private JLabel valorX2Linha = new JLabel("?");
	private JTextField a;
	private JTextField b;
	private JTextField c;
	
	public Solucionador() {
		desenhar();
		titulo();
		labels();
		tFields();
		raizes();
		setVisible(true);
	}

	private void raizes() {
		JButton raizes = new JButton("Raízes");
		raizes.setBounds(200, 170, 80, 30);
		raizes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String xLinha = String.valueOf(EquacaoSegundoGrau.getX(Integer.valueOf(a.getText()), Integer.valueOf(b.getText()), Integer.valueOf(c.getText()), true));
					valorXLinha.setText(xLinha);
					String x2Linha = String.valueOf(EquacaoSegundoGrau.getX(Integer.valueOf(a.getText()), Integer.valueOf(b.getText()), Integer.valueOf(c.getText()), false));
					valorX2Linha.setText(x2Linha);
				} catch (NaoHaSolucaoRealException e1) {
					JOptionPane.showMessageDialog(null, "Não há solução real: Delta negativo.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
				}
				
				revalidate();
				repaint();
			}			
		});
		add(raizes);
	}

	private void labels() {
		JLabel x2 = new JLabel("x² +");
		x2.setFont(new Font("Arial", Font.PLAIN, 20));
		x2.setBounds(170, 60, 50, 30);
		add(x2);
		
		JLabel x = new JLabel("x +");
		x.setFont(new Font("Arial", Font.PLAIN, 20));
		x.setBounds(250, 60, 50, 30);
		add(x);
		
		JLabel igual = new JLabel("= 0");
		igual.setFont(new Font("Arial", Font.PLAIN, 20));
		igual.setBounds(325, 60, 50, 30);
		add(igual);
		
		JLabel xLinha = new JLabel("x¹ = ");
		xLinha.setFont(new Font("Arial", Font.PLAIN, 20)); 
		xLinha.setBounds(130, 100, 50, 30);
		add(xLinha);
		
		JLabel x2Linha = new JLabel("x² = ");
		x2Linha.setFont(new Font("Arial", Font.PLAIN, 20)); 
		x2Linha.setBounds(130, 130, 50, 30);
		add(x2Linha);
		
		valorXLinha.setBounds(180, 100, 30, 30);
		valorXLinha.setFont(new Font("Arial", Font.PLAIN, 20)); 
		add(valorXLinha);
		
		valorX2Linha.setBounds(180, 130, 30, 30);
		valorX2Linha.setFont(new Font("Arial", Font.PLAIN, 20)); 
		add(valorX2Linha);
	}

	private void tFields() {
		a = new JTextField();
		a.setFont(new Font("Arial", Font.PLAIN, 20));
		a.setBounds(130, 60, 35, 30);
		add(a);
		
		b = new JTextField();
		b.setFont(new Font("Arial", Font.PLAIN, 20));
		b.setBounds(210, 60, 35, 30);
		add(b);
		
		c = new JTextField();
		c.setFont(new Font("Arial", Font.PLAIN, 20));
		c.setBounds(285, 60, 35, 30);
		add(c);
	}

	private void titulo() {
		JLabel titulo = new JLabel("A equação de segundo grau é: ");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(0, 10, 500, 40);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		add(titulo);
	}

	private void desenhar() {
		setSize(500, 260);
		setTitle("Solucionador de Equações de Segundo Grau");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
	}
	
}

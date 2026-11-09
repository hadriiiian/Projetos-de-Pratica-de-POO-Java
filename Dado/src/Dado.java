import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class Dado extends JFrame{
	private static final long serialVersionUID = 1L;
	private JSpinner num;
	private int random;
	private JLabel resultado = new JLabel();
	
	public Dado() {
		random = (int) ((Math.random() * 5) + 1);
		desenhar();
		spinner();
		botao();
		setVisible(true);
	}
	
	private void resultado() {
		resultado.setBounds(65, 165, 110, 30);
		resultado.setFont(new Font("Arial", Font.BOLD, 15));
		add(resultado);
	}

	private void botao() {
		JButton jogar = new JButton("Jogar");
		jogar.setBounds(115, 10, 70, 30);
		jogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imagem();
				int numJ = (int) num.getValue();
				if (numJ == random) {
					resultado.setText("Você Ganhou!");
				} else {
					resultado.setText("Você Perdeu!");
				}
				
				resultado();
				revalidate();
				repaint();
				
				int escolha = JOptionPane.showConfirmDialog(null,
						"Quer jogar de novo?", 
						"Confirmação", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
				
				if (escolha == JOptionPane.YES_OPTION)
					reiniciar();
				else 
					System.exit(0);
			}
		});
		add(jogar);
	}
	
	private void reiniciar() {
		dispose();
		new Dado();
	}

	private void imagem() {
		ImageIcon img = new ImageIcon(String.format("%d.png", random));
		JLabel dado = new JLabel(img);
		dado.setBounds(65, 60, 100, 100);
		add(dado);
	}
	
	private void spinner() {
		SpinnerModel limites = new SpinnerNumberModel(1, 1, 6, 1);
		num = new JSpinner(limites);
		num.setBounds(60, 10, 40, 30);
		add(num);
	}

	private void desenhar() {
		setTitle("Sorteia dado");
		setSize(245, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
	}
}

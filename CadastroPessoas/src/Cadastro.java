import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Cadastro extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JFormattedTextField ftfData;
	private ArrayList<String> dados = new ArrayList<String>();
	
	//getter
	public ArrayList<String> getDados() {
		return dados;
	}

	public ArrayList<String> cadastrar(int i) throws ParseException {
		desenhar(i);
		labels(i);
		botao();
		campos();
		
		setModal(true);
		
		setVisible(true);
		
		return dados;
	}
	
	private void desenhar(int i) {
		setSize(450, 280);
		setTitle(String.format("%d° Usuário", i));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
	}
	
	private void botao() {
		JButton ok = new JButton("Ok");
		ok.setBounds(185, 180, 50, 30);
		ok.setVisible(true);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.add(tfNome.getText());
				dados.add(ftfData.getText());
				
				dispose();
			}
		});
		add(ok);
	}
	
	private void labels(int i) {
		JLabel titulo = new JLabel(String.format("%d° Usuário", i));
		titulo.setFont(new Font("Arial", Font.BOLD, 24));
		titulo.setOpaque(true);
		titulo.setBounds(150, 20, 150, 30);
		titulo.setVisible(true);
		add(titulo);
		
		JLabel nome = new JLabel("Nome:");
		nome.setFont(new Font("Arial", Font.BOLD, 16));
		nome.setOpaque(true);
		nome.setBounds(114, 80, 80, 20);
		nome.setVisible(true);
		add(nome);
		
		JLabel data = new JLabel("Data de Nascimento:");
		data.setFont(new Font("Arial", Font.BOLD, 15));
		data.setOpaque(true);
		data.setBounds(10, 125, 153, 20);
		data.setVisible(true);
		add(data);
	}
	
	private void campos() throws ParseException {
		tfNome = new JTextField();
		tfNome.setBounds(174, 80, 180, 30);
		tfNome.setFont(new Font("Arial", Font.PLAIN, 15));
		tfNome.setVisible(true);
		add(tfNome);
		
		MaskFormatter m = new MaskFormatter("##/##/####");
		ftfData = new JFormattedTextField(m);
		ftfData.setBounds(174, 125, 180, 30);
		ftfData.setFont(new Font("Arial", Font.PLAIN, 15));
		ftfData.setVisible(true);
		add(ftfData);
		revalidate();
		repaint();
	}
}

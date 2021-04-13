package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel {

	private JTextArea area_texto;
	private JLabel Nombre1;
	private JLabel Nombre2;
	

	public PanelRegistro() {

		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(null);
		setBackground(Color.white);

		funcionar();

	}


	private void funcionar() {

		area_texto = new JTextArea();
		area_texto.setBounds(10, 10, 400, 600);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.setBounds(2, 80, 400, 600);
		add(panel);
		
		Nombre1 = new JLabel();
		Nombre1.setBounds(10, 10, 100, 50);
		Nombre1.setVisible(false);
		Nombre1.setOpaque(true);
		Nombre1.setBackground(Color.white);
		add(Nombre1);
		
		Nombre2 = new JLabel();
		Nombre2.setBounds(10, 10, 100, 50);
		Nombre2.setVisible(false);
		Nombre2.setOpaque(true);
		Nombre2.setBackground(Color.white);
		add(Nombre2);
		
	}

	public JTextArea getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}

}

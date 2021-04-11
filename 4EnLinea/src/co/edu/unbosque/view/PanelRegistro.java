package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel{
	
	private JLabel area_texto;
	
	public  PanelRegistro() {
		
		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(null);
		setBackground(Color.WHITE);
		
		funcionar();
	}
	
	public void funcionar() {
		area_texto = new JLabel();
		area_texto.setBounds(420, 100, 400, 600);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.setBounds(420, 100, 400, 600);
		add(panel);
	}

	public JLabel getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JLabel area_texto) {
		this.area_texto = area_texto;
	}

	
	
	
}

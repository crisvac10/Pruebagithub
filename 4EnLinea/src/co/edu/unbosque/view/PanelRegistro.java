package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel{
	
	private JTextArea area_texto;
	
	public  PanelRegistro() {
		
		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(null);
		setBackground(Color.WHITE);
		
		funcionar();
	}
	
	public void funcionar() {
		area_texto = new JTextArea();
		area_texto.setBounds(10, 10, 400, 600);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.setBounds(2, 20, 400, 600);
		add(panel);
	}

	public JTextArea getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}

	

	
	
	
}

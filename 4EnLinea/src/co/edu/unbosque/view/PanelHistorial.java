package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelHistorial extends JPanel{
	
	private JTextArea area_texto;
	
	
	public PanelHistorial() {
		
		setBorder(new TitledBorder("Historial de partidas"));
		setLayout(null);
		setBackground(Color.BLACK);
		
		funcionar();
	}
	
	private void funcionar() {
		
		area_texto = new JTextArea();
		area_texto.setBounds(10, 10, 400, 400);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.setBounds(2, 20, 360, 200);
		add(panel);
	}

	public JTextArea getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}
		
	

}

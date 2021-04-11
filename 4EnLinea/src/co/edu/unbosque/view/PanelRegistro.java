package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel{

	
	public  PanelRegistro() {
		
		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(new FlowLayout());
		setBackground(Color.WHITE);
	}
}

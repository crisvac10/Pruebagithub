package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel{

	private JTextField Jugador1;
	private JTextField Jugador2;
	
	
	public  PanelRegistro() {
		
		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(new FlowLayout());
		setBackground(Color.white);
		
		
		
	}
}

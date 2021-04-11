package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaBienvenido;

public class Controller implements ActionListener{
	
	public VentanaBienvenido ventana_bienvenido;
	//public Quatriqui nose;
	
	
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		// = Quatriqui
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		
		ventana_bienvenido.getBt_Historial().addActionListener(this);
		
	}
	
	
	
	

 

 
}

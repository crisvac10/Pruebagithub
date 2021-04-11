package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Quatriqui;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaHistorial;

public class Controller implements ActionListener{
	
	public VentanaBienvenido ventana_bienvenido;
	public Quatriqui quatriqui;
	public VentanaHistorial ventana_historial;
	
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		ventana_historial = new VentanaHistorial();
		quatriqui = new Quatriqui();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana_bienvenido.getBt_Historial().addActionListener(this);
		ventana_bienvenido.getBt_Jugar().addActionListener(this);
		
		quatriqui.getBt_Menú().addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		//VENTANA QUATRIQUI
		if((e.getActionCommand().equals("JUGAR"))){
			
			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);
		//VENTANA BIENVENIDA		
		}if((e.getActionCommand().equals("MENÚ"))) {
			ventana_bienvenido.setVisible(true);
			quatriqui.setVisible(false);
			ventana_historial.setVisible(false);
		
		//VENTANA HISTORIAL
		}if((e.getActionCommand().equals("HISTORIAL"))) {
			
			ventana_bienvenido.setVisible(false);
			ventana_historial.setVisible(true);
		}
		
		
	}
	
	
	
	

 

 
}

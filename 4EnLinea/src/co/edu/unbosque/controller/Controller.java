package co.edu.unbosque.controller;
	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Quatriqui;
import co.edu.unbosque.view.VentanaBienvenido;

public class Controller implements ActionListener{
	
	public VentanaBienvenido ventana_bienvenido;
	public Quatriqui quatriqui;
	
	
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		quatriqui = new Quatriqui();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana_bienvenido.getBt_Historial().addActionListener(this);
		ventana_bienvenido.getBt_Jugar().addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if((e.getActionCommand().equals("JUGAR"))){
			
			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);
		}
		if((e.getActionCommand().equals("HISTORIAL"))) {
			
			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);
		}
		
		
	}
	
}
	
	

 

 


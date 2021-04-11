package co.edu.unbosque.controller;
	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Registro;
import co.edu.unbosque.view.Quatriqui;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaHistorial;

public class Controller implements ActionListener{
	
	public VentanaBienvenido ventana_bienvenido;
	public Quatriqui quatriqui;
	public VentanaHistorial ventana_historial;
	public Registro registro;
	
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		ventana_historial = new VentanaHistorial();
		quatriqui = new Quatriqui();
		registro = new Registro();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana_bienvenido.getBt_Historial().addActionListener(this);
		ventana_bienvenido.getBt_Jugar().addActionListener(this);
		quatriqui.getBt_Menu().addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		//VENTANA QUATRIQUI
		if((e.getActionCommand().equals("JUGAR"))){
			
			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);
			
			String texto = registro.leerRegistro();
			quatriqui.getPregistro().getArea_texto().setText(texto);
		//conexión con la persistencia	
		}{
			
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
	
	

 

 


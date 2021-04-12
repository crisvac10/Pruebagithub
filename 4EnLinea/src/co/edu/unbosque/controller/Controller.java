package co.edu.unbosque.controller;
	
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

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
		quatriqui.getPanelCuatriqui().getB1().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB2().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB3().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB4().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB5().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB6().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB7().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB8().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB9().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB10().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB11().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB12().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB13().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB14().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB15().addActionListener(this);
		quatriqui.getPanelCuatriqui().getB16().addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		//VENTANA QUATRIQUI
		if((e.getActionCommand().equals("JUGAR"))){
			
			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);
			
			String texto = registro.leerRegistro();
			quatriqui.getPregistro().getArea_texto().setText(texto);
			
		}if((e.getActionCommand().equals("UNO"))){
				quatriqui.getPanelCuatriqui().getLb1().setText("X");
				quatriqui.getPanelCuatriqui().getLb1().setVisible(true);
				quatriqui.getPanelCuatriqui().getB1().setVisible(false);
				
				
			}if((e.getActionCommand().equals("DOS"))) {
				quatriqui.getPanelCuatriqui().getLb2().setText("X");
				quatriqui.getPanelCuatriqui().getLb2().setVisible(true);
				quatriqui.getPanelCuatriqui().getB2().setVisible(false);
				
			}else if((e.getActionCommand().equals("TRES"))) {
				quatriqui.getPanelCuatriqui().getLb3().setText("X");
				quatriqui.getPanelCuatriqui().getLb3().setVisible(true);
				quatriqui.getPanelCuatriqui().getB3().setVisible(false);
				
			}else if((e.getActionCommand().equals("CUATRO"))) {
				quatriqui.getPanelCuatriqui().getLb4().setText("X");
				quatriqui.getPanelCuatriqui().getLb4().setVisible(true);
				quatriqui.getPanelCuatriqui().getB4().setVisible(false);
				
			}else if((e.getActionCommand().equals("CINCO"))) {
				quatriqui.getPanelCuatriqui().getLb5().setText("X");
				quatriqui.getPanelCuatriqui().getLb5().setVisible(true);
				quatriqui.getPanelCuatriqui().getB5().setVisible(false);
				
			}else if((e.getActionCommand().equals("SEIS"))) {
				quatriqui.getPanelCuatriqui().getLb6().setText("X");
				quatriqui.getPanelCuatriqui().getLb6().setVisible(true);
				quatriqui.getPanelCuatriqui().getB6().setVisible(false);
				
			}else if((e.getActionCommand().equals("SIETE"))) {
				quatriqui.getPanelCuatriqui().getLb7().setText("X");
				quatriqui.getPanelCuatriqui().getLb7().setVisible(true);
				quatriqui.getPanelCuatriqui().getB7().setVisible(false);
				
			}else if((e.getActionCommand().equals("OCHO"))) {
				quatriqui.getPanelCuatriqui().getLb8().setText("X");
				quatriqui.getPanelCuatriqui().getLb8().setVisible(true);
				quatriqui.getPanelCuatriqui().getB8().setVisible(false);
				
			}else if((e.getActionCommand().equals("NUEVE"))) {
				quatriqui.getPanelCuatriqui().getLb9().setText("X");
				quatriqui.getPanelCuatriqui().getLb9().setVisible(true);
				quatriqui.getPanelCuatriqui().getB9().setVisible(false);
				
			}else if((e.getActionCommand().equals("DIEZ"))) {
				quatriqui.getPanelCuatriqui().getLb10().setText("X");
				quatriqui.getPanelCuatriqui().getLb10().setVisible(true);
				quatriqui.getPanelCuatriqui().getB10().setVisible(false);
				
			}else if((e.getActionCommand().equals("ONCE"))) {
				quatriqui.getPanelCuatriqui().getLb11().setText("X");
				quatriqui.getPanelCuatriqui().getLb11().setVisible(true);
				quatriqui.getPanelCuatriqui().getB11().setVisible(false);
				
			}else if((e.getActionCommand().equals("DOCE"))){
				quatriqui.getPanelCuatriqui().getLb12().setText("X");
				quatriqui.getPanelCuatriqui().getLb12().setVisible(true);
				quatriqui.getPanelCuatriqui().getB12().setVisible(false);
				
			}else if((e.getActionCommand().equals("TRECE"))) {
				quatriqui.getPanelCuatriqui().getLb13().setText("X");
				quatriqui.getPanelCuatriqui().getLb13().setVisible(true);
				quatriqui.getPanelCuatriqui().getB13().setVisible(false);
				
			}else if((e.getActionCommand().equals("CATORCE"))) {
				quatriqui.getPanelCuatriqui().getLb14().setText("X");
				quatriqui.getPanelCuatriqui().getLb14().setVisible(true);
				quatriqui.getPanelCuatriqui().getB14().setVisible(false);
				
			}else if((e.getActionCommand().equals("QUINCE"))) {
				quatriqui.getPanelCuatriqui().getLb15().setText("X");
				quatriqui.getPanelCuatriqui().getLb15().setVisible(true);
				quatriqui.getPanelCuatriqui().getB15().setVisible(false);
				
			}else if((e.getActionCommand().equals("DIECISEIS"))) {
				quatriqui.getPanelCuatriqui().getLb16().setText("X");
				quatriqui.getPanelCuatriqui().getLb16().setVisible(true);
				quatriqui.getPanelCuatriqui().getB16().setVisible(false);
				
			}
		//conexión con la persistencia	
		{
		
			
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
	
	

 

 


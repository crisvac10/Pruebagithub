package co.edu.unbosque.controller;


import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;

import javax.swing.JLabel;

import co.edu.unbosque.model.JuegoCuatriqui;
import co.edu.unbosque.model.Registro;
import co.edu.unbosque.view.PanelCuatriqui;

import co.edu.unbosque.view.PanelRegistro;
import co.edu.unbosque.view.Quatriqui;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaHistorial;
import co.edu.unbosque.model.JuegoCuatriqui;

public class Controller implements ActionListener, MouseListener {
	private PanelCuatriqui panelcua;




	public VentanaBienvenido ventana_bienvenido;
	public Quatriqui quatriqui;
	public VentanaHistorial ventana_historial;
	public Registro registro;

	public JuegoCuatriqui juego;

	public JuegoCuatriqui JuegoCuatriqui;
	
	public String jugador1;	
	public String jugador2; 
	public String turno;

	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		ventana_historial = new VentanaHistorial();
		quatriqui = new Quatriqui();
		registro = new Registro();
		juego = new JuegoCuatriqui();
		
		JuegoCuatriqui = new JuegoCuatriqui();
		
		jugador1 = quatriqui.getJugador1();	
		jugador2 = quatriqui.getJugador2();
		turno = jugador1;
		asignarOyentes();
		
	}

	public String jugadores() {
		
		if (turno.equals(jugador1)) {	
			turno = jugador2;
			
		} else if (turno.equals(jugador2)) {
			turno = jugador1;
		}
		return turno;
	}
	
	
	public void comprobar() {

		if(quatriqui.getPanelCuatriqui().getLb1().getText()== "X"
		& quatriqui.getPanelCuatriqui().getLb2().getText()== "X"
		& quatriqui.getPanelCuatriqui().getLb3().getText()== "X"
		& quatriqui.getPanelCuatriqui().getLb4().getText()== "X"
		) {
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb5().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb6().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb7().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb8().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if(quatriqui.getPanelCuatriqui().getLb9().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb10().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb11().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb12().getText()== "X"
				) {
			System.out.println("X ganó ");	
		}else if (quatriqui.getPanelCuatriqui().getLb13().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb14().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb15().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb16().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb1().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb5().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb9().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb13().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb2().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb6().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb10().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb14().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb3().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb7().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb11().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb15().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb4().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb8().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb12().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb16().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb1().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb6().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb11().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb16().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb13().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb10().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb7().getText()== "X"
				& quatriqui.getPanelCuatriqui().getLb4().getText()== "X"
				){
			System.out.println("X ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb1().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb2().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb3().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb4().getText()== "O"
				) {
					System.out.println("O Ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb5().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb6().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb7().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb8().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if(quatriqui.getPanelCuatriqui().getLb9().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb10().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb11().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb12().getText()== "O"
				) {
					System.out.println("O ganó ");	
		}else if (quatriqui.getPanelCuatriqui().getLb13().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb14().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb15().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb16().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb1().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb5().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb9().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb13().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb2().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb6().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb10().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb14().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb3().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb7().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb11().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb15().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb4().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb8().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb12().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb16().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb1().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb6().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb11().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb16().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (quatriqui.getPanelCuatriqui().getLb13().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb10().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb7().getText()== "O"
				& quatriqui.getPanelCuatriqui().getLb4().getText()== "O"
				){
					System.out.println("O ganó ");
		}else if (
				quatriqui.getPanelCuatriqui().getLb1().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb2().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb3().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb4().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb5().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb6().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb7().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb8().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb9().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb10().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb11().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb12().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb13().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb14().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb15().getText()!= ""
				& quatriqui.getPanelCuatriqui().getLb16().getText()!= ""
				){
					System.out.println("Empate ");
				}
	}

	public void asignarOyentes() {
		ventana_bienvenido.getBt_Historial().addActionListener(this);
		ventana_bienvenido.getBt_Jugar().addActionListener(this);
		quatriqui.getBt_Menu().addActionListener(this);
		quatriqui.getPanelCuatriqui().getLb1().addMouseListener(this);


		ventana_historial.getBt_Regresar().addActionListener(this);
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

		// VENTANA QUATRIQUI
		if ((e.getActionCommand().equals("JUGAR"))) {

			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);

			String texto = registro.leerRegistro();
			quatriqui.getPregistro().getArea_texto().setText(texto);
            

	
		}
		
		String texto = registro.leerRegistro();
		texto = quatriqui.getPregistro().getArea_texto().getText();
		
		
		if((e.getActionCommand().equals("UNO"))){
			
			
				quatriqui.getPanelCuatriqui().getLb1().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb1().setVisible(true);
				quatriqui.getPanelCuatriqui().getB1().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores() +" su jugada fue Lb1  "+ texto);
				jugadores();
				comprobar();
				
				
			}if((e.getActionCommand().equals("DOS"))) {
				quatriqui.getPanelCuatriqui().getLb2().setText(juego.turnos());
				
				quatriqui.getPanelCuatriqui().getLb2().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb2().setVisible(true);
				quatriqui.getPanelCuatriqui().getB2().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores() +" su jugada fue Lb2  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("TRES"))) {
				quatriqui.getPanelCuatriqui().getLb3().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb3().setVisible(true);
				quatriqui.getPanelCuatriqui().getB3().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb3  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("CUATRO"))) {
				quatriqui.getPanelCuatriqui().getLb4().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb4().setVisible(true);
				quatriqui.getPanelCuatriqui().getB4().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb4  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("CINCO"))) {
				quatriqui.getPanelCuatriqui().getLb5().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb5().setVisible(true);
				quatriqui.getPanelCuatriqui().getB5().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb5  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("SEIS"))) {
				quatriqui.getPanelCuatriqui().getLb6().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb6().setVisible(true);
				quatriqui.getPanelCuatriqui().getB6().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb6  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("SIETE"))) {
				quatriqui.getPanelCuatriqui().getLb7().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb7().setVisible(true);
				quatriqui.getPanelCuatriqui().getB7().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb7  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("OCHO"))) {
				quatriqui.getPanelCuatriqui().getLb8().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb8().setVisible(true);
				quatriqui.getPanelCuatriqui().getB8().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb8  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("NUEVE"))) {
				quatriqui.getPanelCuatriqui().getLb9().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb9().setVisible(true);
				quatriqui.getPanelCuatriqui().getB9().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb9  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("DIEZ"))) {
				quatriqui.getPanelCuatriqui().getLb10().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb10().setVisible(true);
				quatriqui.getPanelCuatriqui().getB10().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb10  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("ONCE"))) {
				quatriqui.getPanelCuatriqui().getLb11().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb11().setVisible(true);
				quatriqui.getPanelCuatriqui().getB11().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb11  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("DOCE"))){
				quatriqui.getPanelCuatriqui().getLb12().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb12().setVisible(true);
				quatriqui.getPanelCuatriqui().getB12().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb12  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("TRECE"))) {
				quatriqui.getPanelCuatriqui().getLb13().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb13().setVisible(true);
				quatriqui.getPanelCuatriqui().getB13().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb13  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("CATORCE"))) {
				quatriqui.getPanelCuatriqui().getLb14().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb14().setVisible(true);
				quatriqui.getPanelCuatriqui().getB14().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb14 "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("QUINCE"))) {
				quatriqui.getPanelCuatriqui().getLb15().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb15().setVisible(true);
				quatriqui.getPanelCuatriqui().getB15().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb15  "+texto);
				jugadores();
				comprobar();
				
			}else if((e.getActionCommand().equals("DIECISEIS"))) {
				quatriqui.getPanelCuatriqui().getLb16().setText(JuegoCuatriqui.turnos());
				quatriqui.getPanelCuatriqui().getLb16().setVisible(true);
				quatriqui.getPanelCuatriqui().getB16().setVisible(false);
				jugadores();
				quatriqui.getPregistro().getArea_texto().setText("\n"+jugadores().toString() +" su jugada fue Lb16  "+texto);
				jugadores();
				comprobar();
				
			}
	
	if((e.getActionCommand().equals("MENU"))) {
			ventana_bienvenido.setVisible(true);
			quatriqui.setVisible(false);
			ventana_historial.setVisible(false);

			// VENTANA HISTORIAL
		}
		if ((e.getActionCommand().equals("HISTORIAL"))) {

			ventana_bienvenido.setVisible(false);
			ventana_historial.setVisible(true);
		}

	}

	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}

package co.edu.unbosque.controller;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.JuegoCuatriqui;
import co.edu.unbosque.model.Registro;
import co.edu.unbosque.view.PanelCuatriqui;

import co.edu.unbosque.view.PanelRegistro;
import co.edu.unbosque.view.Quatriqui;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaHistorial;
import co.edu.unbosque.model.JuegoCuatriqui;
/**
 * Clase Controller que controla el funcionamiento del programa
 * @author Jinetes del apocalipsis
 *@serial 2021
 *@version 5.0
 */
public class Controller implements ActionListener {

	public VentanaBienvenido ventana_bienvenido; // Atributo que renonmbra la clase VentanaBienvenido
	public Quatriqui quatriqui;// Atributoque renombra la clase Quatriqui
	public VentanaHistorial ventana_historial;// Atributo que renombra la clase VentanaHistorial
	public Registro registro;// Atributo que renombra la clase Registro
	public JuegoCuatriqui juego_cuatriqui;// Atributo que renombra la clase JuegoCuatriqui

	public String jugador1;// Atributo de tipo String que  guarda el nombre del Jugador 1
	public String jugador2;// Atributo de tipo String que  guarda el nombre del Jugador 2
	public String turno;// Atributo de tipo String que alterna los turnos de los jugadores
	public Thread hilo;// Atributo de tipo Thread que contiene el cronometro
	public boolean estado = true;// Atributo de tipo boolean que cambia el estado del cronometro
	public int min, seg ,hr;// atributos de tipo int que contienen las horas, minutos, segundos del cronometro
	public String tiempo;// Atributos de tipo String que contiene el tiempo del Cronometro
	/**
	 * Constructor de la clase controller que inicializa las clases importadas y los oyentes
	 */
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		ventana_historial = new VentanaHistorial();
		quatriqui = new Quatriqui();
		registro = new Registro();
		juego_cuatriqui = new JuegoCuatriqui();

		jugador1 = quatriqui.getJugador1();
		jugador2 = quatriqui.getJugador2();
		turno = jugador1;
		asignarOyentes();

	}
/**
 * Metodo de tipo Void que inicia el Hilo del cronometro
 */
	public void Hilo() {

		hilo = new Thread() {
			public void run() {
				for (;;) {
					if (estado == true) {
						try {
							sleep(1000);
							if (seg >= 60) {
								seg = 0;
								min++;

							}
							if (min >= 60) {
								seg = 0;
								min = 0;
								hr++;
							}
							quatriqui.getCronometro().setText(hr + " : " + min + " : " + seg);
							seg++;
						} catch (Exception e) {

						}
					} else {
						break;
					}
				}
			}

		};
		hilo.start();
	
}
/**
 * Metodo de tipo String que realiza el cambio de turno 
 * @return turno
 */
	public String jugadores() {

		if (turno.equals(jugador1)) {
			turno = jugador2;

		} else if (turno.equals(jugador2)) {
			turno = jugador1;
		}
		return turno;
	}
/**
 * Metodo de tipo void que reinicia el juego
 */
	public void reiniciarTodo() {
		quatriqui.getPanelCuatriqui().getLb1().setText("");
		quatriqui.getPanelCuatriqui().getLb2().setText("");
		quatriqui.getPanelCuatriqui().getLb3().setText("");
		quatriqui.getPanelCuatriqui().getLb4().setText("");
		quatriqui.getPanelCuatriqui().getLb5().setText("");
		quatriqui.getPanelCuatriqui().getLb6().setText("");
		quatriqui.getPanelCuatriqui().getLb7().setText("");
		quatriqui.getPanelCuatriqui().getLb8().setText("");
		quatriqui.getPanelCuatriqui().getLb9().setText("");
		quatriqui.getPanelCuatriqui().getLb10().setText("");
		quatriqui.getPanelCuatriqui().getLb11().setText("");
		quatriqui.getPanelCuatriqui().getLb12().setText("");
		quatriqui.getPanelCuatriqui().getLb13().setText("");
		quatriqui.getPanelCuatriqui().getLb14().setText("");
		quatriqui.getPanelCuatriqui().getLb15().setText("");
		quatriqui.getPanelCuatriqui().getLb16().setText("");

		quatriqui.getPanelCuatriqui().getB1().setVisible(true);
		quatriqui.getPanelCuatriqui().getB2().setVisible(true);
		quatriqui.getPanelCuatriqui().getB3().setVisible(true);
		quatriqui.getPanelCuatriqui().getB4().setVisible(true);
		quatriqui.getPanelCuatriqui().getB5().setVisible(true);
		quatriqui.getPanelCuatriqui().getB6().setVisible(true);
		quatriqui.getPanelCuatriqui().getB7().setVisible(true);
		quatriqui.getPanelCuatriqui().getB8().setVisible(true);
		quatriqui.getPanelCuatriqui().getB9().setVisible(true);
		quatriqui.getPanelCuatriqui().getB10().setVisible(true);
		quatriqui.getPanelCuatriqui().getB11().setVisible(true);
		quatriqui.getPanelCuatriqui().getB12().setVisible(true);
		quatriqui.getPanelCuatriqui().getB13().setVisible(true);
		quatriqui.getPanelCuatriqui().getB14().setVisible(true);
		quatriqui.getPanelCuatriqui().getB15().setVisible(true);
		quatriqui.getPanelCuatriqui().getB16().setVisible(true);
		

		hilo.stop();
		hr = 0;
		min = 0;
		seg = 0;
	

	}
/**
 * Metodo de tipo void que comprueba si un jugador ha ganado
 */
	public void comprobar() {

		if (quatriqui.getPanelCuatriqui().getLb1().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb2().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb3().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb4().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();
			


		} else if (quatriqui.getPanelCuatriqui().getLb5().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb6().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb7().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb8().getText() == "X"

		) {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb9().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb10().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb11().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb12().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb13().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb14().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb15().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb16().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb1().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb5().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb9().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb13().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb2().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb6().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb10().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb14().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb3().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb7().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb11().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb15().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb4().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb8().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb12().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb16().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb1().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb6().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb11().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb16().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb13().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb10().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb7().getText() == "X"
				& quatriqui.getPanelCuatriqui().getLb4().getText() == "X") {
			juego_cuatriqui.setPuntajeJ1(Integer.parseInt(juego_cuatriqui.getPuntajeJ1()) + 1);
			quatriqui.getPregistro().getlPuntajeJ1().setText(juego_cuatriqui.getPuntajeJ1());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb1().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb2().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb3().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb4().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb5().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb6().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb7().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb8().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb9().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb10().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb11().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb12().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb13().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb14().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb15().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb16().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb1().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb5().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb9().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb13().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb2().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb6().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb10().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb14().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();
 
		} else if (quatriqui.getPanelCuatriqui().getLb3().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb7().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb11().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb15().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb4().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb8().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb12().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb16().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb1().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb6().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb11().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb16().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb13().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb10().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb7().getText() == "O"
				& quatriqui.getPanelCuatriqui().getLb4().getText() == "O") {
			juego_cuatriqui.setPuntajeJ2(Integer.parseInt(juego_cuatriqui.getPuntajeJ2()) + 1);
			quatriqui.getPregistro().getlPuntajeJ2().setText(juego_cuatriqui.getPuntajeJ2());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui,
					"Ha ganado el jugador: " + jugadores() + "\nAhora comienza el jugador: " + jugadores());
			Hilo();

		} else if (quatriqui.getPanelCuatriqui().getLb1().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb2().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb3().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb4().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb5().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb6().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb7().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb8().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb9().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb10().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb11().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb12().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb13().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb14().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb15().getText() != ""
				& quatriqui.getPanelCuatriqui().getLb16().getText() != "") {
			juego_cuatriqui.setEmpate(Integer.parseInt(juego_cuatriqui.getEmpate()) + 1);
			quatriqui.getPregistro().getlEmpate().setText(juego_cuatriqui.getEmpate());
			reiniciarTodo();
			JOptionPane.showMessageDialog(quatriqui, "Han empatado!! " + 
			"\nAhora comienza el jugador: " + jugadores());
			Hilo();
		}
	}
/**
 * Metodo de tipo void que asigna losoyentes a los distintos botones
 */
	public void asignarOyentes() {
		ventana_bienvenido.getBt_Historial().addActionListener(this);
		ventana_bienvenido.getBt_Jugar().addActionListener(this);
		quatriqui.getBt_Menu().addActionListener(this);

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
		quatriqui.getPregistro().getBtrematch().addActionListener(this);

	}
/**
 * Metodo de tipo void que activa las acciones de los botones
 */
	public void actionPerformed(ActionEvent e) {

		// VENTANA QUATRIQUI
		if ((e.getActionCommand().equals("JUGAR"))) {

			ventana_bienvenido.setVisible(false);
			quatriqui.setVisible(true);

			String texto = registro.leerRegistro();
			quatriqui.getPregistro().getArea_texto().setText(texto);
			Hilo();

		}
	
		
		String texto = registro.leerRegistro();
		texto = quatriqui.getPregistro().getArea_texto().getText();

		if ((e.getActionCommand().equals("UNO"))) {

			quatriqui.getPanelCuatriqui().getLb1().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb1().setVisible(true);
			quatriqui.getPanelCuatriqui().getB1().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText( texto+"\n" +jugadores() + 
					" su jugada fue Lb1 Tiempo: " +hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		}
		if ((e.getActionCommand().equals("DOS"))) {

			quatriqui.getPanelCuatriqui().getLb2().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb2().setVisible(true);
			quatriqui.getPanelCuatriqui().getB2().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n"+ jugadores() + 
					" su jugada fue Lb2  Tiempo: " +hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("TRES"))) {
			quatriqui.getPanelCuatriqui().getLb3().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb3().setVisible(true);
			quatriqui.getPanelCuatriqui().getB3().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb3 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("CUATRO"))) {
			quatriqui.getPanelCuatriqui().getLb4().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb4().setVisible(true);
			quatriqui.getPanelCuatriqui().getB4().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb4 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("CINCO"))) {
			quatriqui.getPanelCuatriqui().getLb5().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb5().setVisible(true);
			quatriqui.getPanelCuatriqui().getB5().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb5 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("SEIS"))) {
			quatriqui.getPanelCuatriqui().getLb6().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb6().setVisible(true);
			quatriqui.getPanelCuatriqui().getB6().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb6 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("SIETE"))) {
			quatriqui.getPanelCuatriqui().getLb7().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb7().setVisible(true);
			quatriqui.getPanelCuatriqui().getB7().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb7 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("OCHO"))) {
			quatriqui.getPanelCuatriqui().getLb8().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb8().setVisible(true);
			quatriqui.getPanelCuatriqui().getB8().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb8 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("NUEVE"))) {
			quatriqui.getPanelCuatriqui().getLb9().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb9().setVisible(true);
			quatriqui.getPanelCuatriqui().getB9().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb9 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("DIEZ"))) {
			quatriqui.getPanelCuatriqui().getLb10().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb10().setVisible(true);
			quatriqui.getPanelCuatriqui().getB10().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb10 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("ONCE"))) {
			quatriqui.getPanelCuatriqui().getLb11().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb11().setVisible(true);
			quatriqui.getPanelCuatriqui().getB11().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb11 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("DOCE"))) {
			quatriqui.getPanelCuatriqui().getLb12().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb12().setVisible(true);
			quatriqui.getPanelCuatriqui().getB12().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb12 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("TRECE"))) {
			quatriqui.getPanelCuatriqui().getLb13().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb13().setVisible(true);
			quatriqui.getPanelCuatriqui().getB13().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb13 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("CATORCE"))) {
			quatriqui.getPanelCuatriqui().getLb14().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb14().setVisible(true);
			quatriqui.getPanelCuatriqui().getB14().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb14 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("QUINCE"))) {
			quatriqui.getPanelCuatriqui().getLb15().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb15().setVisible(true);
			quatriqui.getPanelCuatriqui().getB15().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb15 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		} else if ((e.getActionCommand().equals("DIECISEIS"))) {
			quatriqui.getPanelCuatriqui().getLb16().setText(juego_cuatriqui.turnos());
			quatriqui.getPanelCuatriqui().getLb16().setVisible(true);
			quatriqui.getPanelCuatriqui().getB16().setVisible(false);
			jugadores();
			quatriqui.getPregistro().getArea_texto().setText(texto+"\n" + jugadores().toString() + 
					" su jugada fue Lb16 Tiempo: "+hr + " : "+ min+ " : "+seg);
			jugadores();
			comprobar();

		}

		if ((e.getActionCommand().equals("REMATCH"))) {
			reiniciarTodo();
			registro.actualizarRegistro(texto);
			hilo.stop();
			hr = 0;
			min= 0;
			seg= 0;
			Hilo();
			
			JOptionPane.showMessageDialog(quatriqui, "Se reiniciará la partida, el tiempo \ny se guardarán las jugadas en el historial");
			
		}

		if ((e.getActionCommand().equals("MENU"))) {
			ventana_bienvenido.setVisible(true);
			quatriqui.setVisible(false);
			ventana_historial.setVisible(false);
			hilo.stop();
			

			// VENTANA HISTORIAL
		}
		if ((e.getActionCommand().equals("HISTORIAL"))) {
			Hilo();
			ventana_bienvenido.setVisible(false);
			ventana_historial.setVisible(true);
			hilo.stop();
		}

	}

}

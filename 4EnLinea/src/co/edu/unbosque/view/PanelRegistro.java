package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
/**
 * Clase PanelRegistro que extiende de JPanel, contiene el puntajes, nombres y movimientos de los jugadores 
 * @author Jinetes del apocalipsis
 *
 */
public class PanelRegistro extends JPanel {

	private JTextArea area_texto;// Atributo de tipo JTextArea con el cual implementamos un area de texto
	private JLabel lbjugador1;// Atributo tipo label para eljugador 1
	private JLabel nombjugador1;// Atributo que contiene el nombre del jugador1 
	private JLabel nombjugador2;// Atributo que contiene el nombre del jugador 2
	private JLabel puntajeJ1;// Atributo en el que se encuentra el puntaje de partidas ganadas del Jugador 1
	private JLabel puntajeJ2;// Atributo en el que se encuentra el puntaje de partidas ganadas del Jugador 2
	private JLabel empates;//// Atributo en el que se encuentra las partidas empatadas
	private JTextArea lPuntajeJ1;// Atributo en el que se modifica el puntaje de partidas ganadas del Jugador 1
	private JTextArea lPuntajeJ2;// Atributo en el que se modifica el puntaje de partidas ganadas del Jugador 2
	private JTextArea lEmpate;// Atributo en el que se modifica el puntaje de partidas empatadas
	private JButton btrematch;// Atributo para el boton de volver a jugar
	
/**
 * Constructor de la clase PanelRegistro que inicializa los metodos para funcionar
 * @param j1 Jugador 1 renombrado
 * @param j2 Jugador 2 renombrado
 */
	public PanelRegistro(String j1, String j2) {

		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(null);
		setBackground(Color.white);

		funcionar(j1, j2);

	}

/**
 * Metodo que inicializa los atributos, les asigna sudestino y los agrega.
 * @param j1 Jugador 1 renombrado
 * @param j2 Jugador 2 renombrado
 */
	private void funcionar(String j1, String j2) {

		area_texto = new JTextArea();
		area_texto.setBounds(10, 10, 400, 600);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.getVerticalScrollBar().setValue(0);
		panel.setBounds(2, 20, 360, 200);
		area_texto.setEditable(false);
		add(panel);
		
		lbjugador1 = new JLabel("Jugador 1:");
		lbjugador1.setBounds(10,220,200,25);
		add(lbjugador1);
		nombjugador1 = new JLabel(j1);
		nombjugador1.setBounds(10,240,200,25);
		add(nombjugador1);
		puntajeJ1 = new JLabel("Puntaje: ");
		puntajeJ1.setBounds(10,260,200,25);
		add(puntajeJ1);
		lPuntajeJ1= new JTextArea(); 
		lPuntajeJ1.setBounds(10,290,60, 20);
		lPuntajeJ1.setEditable(false);
		add(lPuntajeJ1);
		
		nombjugador2 = new JLabel("Jugador 2:");
		nombjugador2.setBounds(200,220,200,25);
		add(nombjugador2);
		nombjugador2 = new JLabel(j2);
		nombjugador2.setBounds(200,240,200,25);
		add(nombjugador2);
		puntajeJ2 = new JLabel("Puntaje: ");
		puntajeJ2.setBounds(200,260,200,25);
		add(puntajeJ2);
		lPuntajeJ2= new JTextArea(); 
		lPuntajeJ2.setBounds(200,290,60, 20);
		add(lPuntajeJ2);
		
		empates = new JLabel("Empates: ");
		empates.setBounds(100,300,200,25);
		add(empates);
		lEmpate= new JTextArea(); 
		lEmpate.setBounds(100,330,60, 20);
		add(lEmpate);
		
		btrematch = new JButton("Rematch");
		btrematch.setActionCommand("REMATCH");
		btrematch.setBounds(120, 500, 120, 25);
		btrematch.setVisible(true);
		add(btrematch);
	}

	/**
	 * Metodo que permite acceder al atributo Area_texto
	 * @return area_texto
	 */
	public JTextArea getArea_texto() {
		return area_texto;
	}
	/**
	 * Metodo que permite modificar el atributo area_texto
	 * @param area_texto to set area_texto
	 */
	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}
	/**
	 * Metodo que permite acceder al atributo Btrematch
	 * @return btrematch
	 */

	public JButton getBtrematch() {
		return btrematch;
	}
	/**
	 * Metodo que permite modificar el atributo Btrematch
	 * @param btrematch to set Btrematch
	 */

	public void setBtrematch(JButton btrematch) {
		this.btrematch = btrematch;
	}
	/**
	 * Metodo que permite acceder al atributo lPuntajeJ1
	 * @return lPuntajeJ1
	 */

	public JTextArea getlPuntajeJ1() {
		return lPuntajeJ1;
	}
	/**
	 * Metodo que permite modificar el atributo lPuntajeJ1
	 * @param lPuntajeJ1 to set lPuntajeJ1
	 */

	public void setlPuntajeJ1(JTextArea string) {
		this.lPuntajeJ1 = string;
	}
	/**
	 * Metodo que permite acceder al atributo lPuntajeJ2
	 * @return lPuntajeJ2
	 */

	public JTextArea getlPuntajeJ2() {
		return lPuntajeJ2;
	}
	/**
	 * Metodo que permite modificar el atributo lPuntajeJ2
	 * @param lPuntajeJ2 to set lPuntajeJ2
	 */

	public void setlPuntajeJ2(JTextArea lPuntajeJ2) {
		this.lPuntajeJ2 = lPuntajeJ2;
	}

	/**
	 * Metodo que permite acceder al atributo lEmpate
	 * @return lEmpate
	 */
	public JTextArea getlEmpate() {
		return lEmpate;
	}
/**
 * Metodo que permite modificar el atributo lEmpate
 * @param lEmpate to set lEmpate
 */

	public void setlEmpate(JTextArea lEmpate) {
		this.lEmpate = lEmpate;
	}

	
}

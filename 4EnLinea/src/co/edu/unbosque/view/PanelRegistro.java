package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel {

	private JTextArea area_texto;
	private JLabel lbjugador1;
	private JLabel nombjugador1;
	private JLabel lbjugador2;
	private JLabel nombjugador2;
	private JLabel puntajeJ1;
	private JLabel puntajeJ2;
	private JLabel empates;
	private List lPuntajeJ1;
	private List lPuntajeJ2;
	private List lEmpate;
	private JButton btrematch;
	

	public PanelRegistro(String j1, String j2) {

		setBorder(new TitledBorder("Registro de jugadas"));
		setLayout(null);
		setBackground(Color.white);

		funcionar(j1, j2);

	}


	private void funcionar(String j1, String j2) {

		area_texto = new JTextArea();
		area_texto.setBounds(10, 10, 400, 600);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.setBounds(2, 20, 360, 200);
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
		lPuntajeJ1= new List(); 
		lPuntajeJ1.setBounds(10,290,60, 20);
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
		lPuntajeJ2= new List(); 
		lPuntajeJ2.setBounds(200,290,60, 20);
		add(lPuntajeJ2);
		
		empates = new JLabel("Empates: ");
		empates.setBounds(100,300,200,25);
		add(empates);
		lEmpate= new List(); 
		lEmpate.setBounds(100,330,60, 20);
		add(lEmpate);
		
		btrematch = new JButton("Rematch");
		btrematch.setActionCommand("REMATCH");
		btrematch.setBounds(120, 500, 120, 25);
		btrematch.setVisible(true);
		add(btrematch);
	}

	
	public JTextArea getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}


	public JButton getBtrematch() {
		return btrematch;
	}


	public void setBtrematch(JButton btrematch) {
		this.btrematch = btrematch;
	}

	
}

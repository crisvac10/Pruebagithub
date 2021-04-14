package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

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
		
		nombjugador2 = new JLabel("Jugador 2:");
		nombjugador2.setBounds(200,220,200,25);
		add(nombjugador2);
		nombjugador2 = new JLabel(j2);
		nombjugador2.setBounds(200,240,200,25);
		add(nombjugador2);
	}

	
	public JTextArea getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}

}

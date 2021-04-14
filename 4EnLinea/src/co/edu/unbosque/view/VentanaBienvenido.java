package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaBienvenido extends JFrame {
	
	private ImageIcon ImagenBienvenida;// imagen de fondo de la ventana Bienvenido
	private JLabel bienvenida; // Atributo Jlabel que contiene la imagen de fondo
	private JButton bt_Jugar; // Boton para entrar a la ventana base de datos
	private JButton bt_Historial;// Boton para entrar a la ventana a�adir Empleado
	private JButton bt_salir; // Boton para salir del programa
	private int ancho; // Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	public VentanaBienvenido() {

		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		setTitle("Cuatriqui");
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLayout(null);
		setSize(500, 538);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Botones();

		Dimension tam = getSize();
		ImagenBienvenida = new ImageIcon(getClass().getResource("/Imagen/quatriqui.jpeg"));
		bienvenida = new JLabel(ImagenBienvenida);
		bienvenida.setBounds(-5, -20, tam.width, tam.height);

		add(bienvenida);

		setResizable(false);
		setVisible(true);
	}
	
	public void Botones() {

		bt_Jugar = new JButton("Jugar");
		bt_Jugar.setActionCommand("JUGAR");
		bt_Jugar.setBounds(46, 380, 100, 30);
		bt_Jugar.setBackground(new Color(33,34,29));
		bt_Jugar.setForeground(new Color(255,255,255));
		bt_Jugar.setBorderPainted(false);
		bt_Jugar.setFocusPainted(false);
		bt_Jugar.setVisible(true);
		add(bt_Jugar);

		bt_Historial = new JButton("Historial de partidas");
		bt_Historial.setActionCommand("HISTORIAL");
		bt_Historial.setBackground(new Color(46,46,44));
		bt_Historial.setForeground(new Color(255,255,255));
		bt_Historial.setFocusPainted(false);
		bt_Historial.setBorderPainted(false);
		bt_Historial.setBounds(146, 230, 200, 30);
		bt_Historial.setVisible(true);
		add(bt_Historial);
		
		
	}

	public JButton getBt_Jugar() {
		return bt_Jugar;
	}

	public void setBt_Jugar(JButton bt_Jugar) {
		this.bt_Jugar = bt_Jugar;
	}

	public JButton getBt_Historial() {
		return bt_Historial;
	}

	public void setBt_Historial(JButton bt_Historial) {
		this.bt_Historial = bt_Historial;
	}

	

}

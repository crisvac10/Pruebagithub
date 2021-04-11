package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaHistorial extends JFrame{
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	
	private JButton bt_men�;
	
	public VentanaHistorial (){
		
		setTitle("ventana historial");
		setSize(500, 500);
		getContentPane().setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((int) (ancho / 3), (int) (alto / 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Interfaz();

		setResizable(false);
		setVisible(false);


	}
	
	public void Interfaz() {
		
	}

}

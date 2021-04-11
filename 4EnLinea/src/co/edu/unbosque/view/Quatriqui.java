package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Quatriqui extends JFrame {
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	public Quatriqui() {
		
		setTitle("Quatriqui");
		setSize(800,600);
		getContentPane().setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((int) (ancho / 5), (int) (alto / 7.5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		InterfazQuatriqui();
		
		setResizable(false);
		setVisible(false);
	}
	
	public void InterfazQuatriqui() {
		
		
		
	}

}

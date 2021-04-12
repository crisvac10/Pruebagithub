package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaHistorial extends JFrame{
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	
	private JButton bt_Regresar;
	
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
		bt_Regresar = new JButton("Regresar");
		bt_Regresar.setActionCommand("MENU");
		bt_Regresar.setBounds(50, 400, 100, 30);
		bt_Regresar.setVisible(true);
		add(bt_Regresar);
		
		this.getContentPane().setBackground(new Color(251,201,40));
		
	}

	public JButton getBt_Regresar() {
		return bt_Regresar;
	}

	public void setBt_Regresar(JButton bt_Regresar) {
		this.bt_Regresar = bt_Regresar;
	}

}

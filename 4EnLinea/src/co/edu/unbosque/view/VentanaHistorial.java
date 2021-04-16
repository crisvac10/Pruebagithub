package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Clase VentanaHistorial que extiende de JFrame, aqui es donde se encuentra el historial delas partidas
 * @author Jinetes del apocalipsis
 *
 */
public class VentanaHistorial extends JFrame{
	
	private PanelHistorial panel_historial;// Atributo Panel_historial querenombran la clase PanelHistorial.
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	
	private JButton bt_Regresar;// Atributo que contiene el boton para regresar a la ventana principal 
	/**
	 * Constructor de la clase VentanaHistorial  que inicializa losmetodos y asignas las dimensiones de la ventana
	 */
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
	/**
	 * metodo que inicializa el panel y el boton regresar
	 */
	public void Interfaz() {
		bt_Regresar = new JButton("Regresar");
		bt_Regresar.setActionCommand("MENU");
		bt_Regresar.setBounds(20, 420, 100, 30);
		bt_Regresar.setVisible(true);
		add(bt_Regresar);
		
		this.getContentPane().setBackground(new Color(251,201,40));
		
		panel_historial = new PanelHistorial();
		panel_historial.setBounds(0, 0, 430, 410);
		panel_historial.setOpaque(false);
		panel_historial.setVisible(true);
		add(panel_historial);		
	}
/**
 * metodo que permite acceder al atributo Bt_Regresar
 * @return bt_Regresar 
 */
	public JButton getBt_Regresar() {
		return bt_Regresar;
	}
/**
 * Metodo que permite modificar el atributo Bt_Regresar 
 * @param bt_Regresar
 */
	public void setBt_Regresar(JButton bt_Regresar) {
		this.bt_Regresar = bt_Regresar;
	}

}

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * Clase Quatriqui de tipo JFrame que contiene la ventana y los paneles de el juego
 * @author Jinetes del apocalipsis
 *
 */
public class Quatriqui extends JFrame {
	
	private ImageIcon ImagenCuatriqui;// imagen de fondo de la ventana Bienvenido
	private JLabel quatriqui; // Atributo Jlabel que contiene la imagen de fondo
	private PanelRegistro pregistro;// Atributo Pregistro que renombra al PanelRegistro	
	private PanelCuatriqui panel_cuatriqui;// Atributo panel_cuatriqui que renombra al PanelCuatriqui
	
	private JButton bt_Menu;// Atributo JButton que nombra un boton
	
	private String Jugador1;// Atributo tipo String que nombra al jugador 1
	private String Jugador2;//Atributo tipo String que nombra al jugador 2
	private JLabel Cronometro;// Atributo tipo JLabel que contiene la impresion del cronometro
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	/**
	 * Constructor de la clase Quatriqui que inicializa los metodos y asigna las dimensiones de la ventana 
	 */
	public Quatriqui() {
		
		setTitle("Cuatriqui");
		setSize(800,600);
		getContentPane().setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((int) (ancho / 5), (int) (alto / 7.5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		InterfazQuatriqui();
		
		Dimension tam = getSize();
		ImagenCuatriqui = new ImageIcon(getClass().getResource("/Imagen/cuatriqui1.png"));
		quatriqui = new JLabel(ImagenCuatriqui);
		//quatriqui.setBounds(-30, -130, tam.width, tam.height);
		quatriqui.setBounds(10,10,384,384);

		add(quatriqui);
		
		
		setResizable(false);
		setVisible(false);
	}
	

	/**
	 * Metodo que inicializa los Atributos dentro del panel y les asigna sus posiciones.
	 */
	public void InterfazQuatriqui() {
		
		Cronometro = new JLabel("");
		Cronometro.setBounds(150, 475, 200, 30);
		Cronometro.setFont(new Font("Tahoma", 1, 30));
		Cronometro.setHorizontalAlignment(JLabel.CENTER);
		Cronometro.setForeground(Color.black);
		Cronometro.setVisible(true);
		Cronometro.setBackground(Color.white);
		add(Cronometro);
		
		bt_Menu = new JButton("Menu");
		bt_Menu.setActionCommand("MENU");
		bt_Menu.setBounds(20, 475, 100, 30);
		bt_Menu.setVisible(true);
		add(bt_Menu);
		
		Jugador1 = JOptionPane.showInputDialog("Nombre Jugador 1: ");
		Jugador2 = JOptionPane.showInputDialog("Nombre Jugador 2: ");
		
		pregistro = new PanelRegistro(Jugador1, Jugador2);
		pregistro.setBorder(new TitledBorder("Registro de jugadas"));
		pregistro.setBounds(420, 0, 400, 600);
		pregistro.setVisible(true);
		getContentPane().add(pregistro);
		
		panel_cuatriqui = new PanelCuatriqui();
		panel_cuatriqui.setBounds(10, 10, 384, 384);
		panel_cuatriqui.setOpaque(false);
		panel_cuatriqui.setVisible(true);
		getContentPane().add(panel_cuatriqui);
		
		this.getContentPane().setBackground(new Color(251,201,40));
	}


/**
 * Metodo que permite acceder al atributo Bt_Menu 
 * @return bt_menu
 */
	public JButton getBt_Menu() {
		return bt_Menu;
	}
/**
 * Metodo que permite modificar el atributo Bt_Menu
 * @param bt_Menu to set Bt_Menu
 */
	public void setBt_Menu(JButton bt_Menu) {
		this.bt_Menu = bt_Menu;
	}
	/**
	 * Metodo que permite acceder al atributo Pregistro 
	 * @return pregistro
	 */

	public PanelRegistro getPregistro() {
		return pregistro;
	}
/**
 * Metodo que permite acceder al atributo Pregistro
 * @param pregistro to set Pregistro
 */
	public void setPregistro(PanelRegistro pregistro) {
		this.pregistro = pregistro;
	}
	/**
	 * Metodo que permite acceder al atributo PanelCuatriqui 
	 * @return PanelCuatriqui
	 */

	public PanelCuatriqui getPanelCuatriqui() {
		return panel_cuatriqui;
	}
/**
 * Metodo que permite modificar el atributo PanelCuatriqui
 * @param panelCuatriqui to set PanelCuatriqui
 */

	public void setPanelCuatriqui(PanelCuatriqui panelCuatriqui) {
		panel_cuatriqui = panelCuatriqui;
	}

/**
 * Metodo que  permite acceder al atributo Jugador1 
 * @return Jugador1
 */
	public String getJugador1() {
		return Jugador1;
	}
/**
 * Metodo que permite modificar al atributo Jugador1
 * @param jugador1
 */

	public void setJugador1(String jugador1) {
		Jugador1 = jugador1;
	}

	/**
	 * Metodo que me permite acceder al atributo Jugador2 
	 * @return Jugador2
	 */
	public String getJugador2() {
		return Jugador2;
	}
	/**
	 * Metodo que permite modificar al atributo Jugador2
	 * @param jugador2
	 */

	public void setJugador2(String jugador2) {
		Jugador2 = jugador2;
	}
/**
 * Metodo que permite acceder al metodo Cronometro
 * @return Cronometro
 */
	public JLabel getCronometro() {
		return Cronometro;
	}
	/**
	 * Metodo que permite modificar el atributo Cronometro
	 * @param cronometro to set Cronometro
	 */

	public void setCronometro(JLabel cronometro) {
		Cronometro = cronometro;
	}
	
	

}

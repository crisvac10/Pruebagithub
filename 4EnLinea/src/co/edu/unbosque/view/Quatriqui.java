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

public class Quatriqui extends JFrame {
	
	private ImageIcon ImagenCuatriqui;// imagen de fondo de la ventana Bienvenido
	private JLabel quatriqui; // Atributo Jlabel que contiene la imagen de fondo
	private PanelRegistro pregistro;
	private PanelCuatriqui panel_cuatriqui;
	
	private JButton bt_Menu;
	
	private String Jugador1;
	private String Jugador2;
	private JLabel Cronometro;
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	

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
	

	
	public void InterfazQuatriqui() {
		
		Cronometro = new JLabel("");
		Cronometro.setBounds(150, 475, 100, 30);
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



	public JButton getBt_Menu() {
		return bt_Menu;
	}

	public void setBt_Menu(JButton bt_Menu) {
		this.bt_Menu = bt_Menu;
	}

	public PanelRegistro getPregistro() {
		return pregistro;
	}

	public void setPregistro(PanelRegistro pregistro) {
		this.pregistro = pregistro;
	}


	public PanelCuatriqui getPanelCuatriqui() {
		return panel_cuatriqui;
	}


	public void setPanelCuatriqui(PanelCuatriqui panelCuatriqui) {
		panel_cuatriqui = panelCuatriqui;
	}


	public String getJugador1() {
		return Jugador1;
	}


	public void setJugador1(String jugador1) {
		Jugador1 = jugador1;
	}


	public String getJugador2() {
		return Jugador2;
	}


	public void setJugador2(String jugador2) {
		Jugador2 = jugador2;
	}

	public JLabel getCronometro() {
		return Cronometro;
	}

	public void setCronometro(JLabel cronometro) {
		Cronometro = cronometro;
	}
	
	

}

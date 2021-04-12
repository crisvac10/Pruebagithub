package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Quatriqui extends JFrame {
	

	private PanelRegistro pregistro;
	private PanelCuatriqui PanelCuatriqui;
	
	private JButton bt_Menu;
	private JPanel cuatriqui;

	
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

		setResizable(false);
		setVisible(false);
	}
	
	
	public void InterfazQuatriqui() {
		
		bt_Menu = new JButton("Men�");
		bt_Menu.setActionCommand("MEN�");
		bt_Menu.setBounds(20, 475, 100, 30);
		bt_Menu.setVisible(true);
		add(bt_Menu);

		pregistro = new PanelRegistro();
		pregistro.setBorder(new TitledBorder("Registro de jugadas"));
		pregistro.setBounds(420, 0, 400, 600);
		pregistro.setVisible(true);
		getContentPane().add(pregistro);
		
		PanelCuatriqui = new PanelCuatriqui();
		PanelCuatriqui.setBounds(10, 10, 384, 384);
		PanelCuatriqui.setVisible(true);
		getContentPane().add(PanelCuatriqui);
		
		
		
	}

	public JPanel getCuatriqui() {
		return cuatriqui;
	}


	public void setCuatriqui(JPanel cuatriqui) {
		this.cuatriqui = cuatriqui;
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
		return PanelCuatriqui;
	}


	public void setPanelCuatriqui(PanelCuatriqui panelCuatriqui) {
		PanelCuatriqui = panelCuatriqui;
	}
	
	

}

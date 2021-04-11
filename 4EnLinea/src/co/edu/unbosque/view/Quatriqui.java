package co.edu.unbosque.view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quatriqui extends JFrame {
	
	
	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	private JButton B1_1;
	private JButton B1_2;
	private JButton B1_3;
	private JButton B1_4;
	private JButton B2_1;
	private JButton B2_2;
	private JButton B2_3;
	private JButton B2_4;
	private JButton B3_1;
	private JButton B3_2;
	private JButton B3_3;
	private JButton B3_4;
	private JButton B4_1;
	private JButton B4_2;
	private JButton B4_3;
	private JButton B4_4;
	private JLabel cuatriqui;
	private ImageIcon Imagencuatriqui;
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
		
		Dimension tam = getSize();
		Imagencuatriqui = new ImageIcon(getClass().getResource("/Imagen/cuatriqui1.png"));
		cuatriqui = new JLabel(Imagencuatriqui);
		cuatriqui.setBounds(-20, -130, tam.width, tam.height);
		add(cuatriqui);

		
		setResizable(false);
		setVisible(false);
	}
	
	
	public void InterfazQuatriqui() {
		
		B1_1 = new JButton("");
		B1_1.setActionCommand("B1_1");
		B1_1.setVisible(true);
		B1_1.setBounds(25, 25, 50, 50);
		add(B1_1);
		
		B1_2 = new JButton("");
		B1_2.setActionCommand("B1_2");
		B1_2.setVisible(true);
		B1_2.setBounds(135, 25, 50, 50);
		add(B1_2);

		B1_3 = new JButton("");
		B1_3.setActionCommand("B1_3");
		B1_3.setVisible(true);
		B1_3.setBounds(245, 25, 50, 50);
		add(B1_3);
		
		B1_4 = new JButton("");
		B1_4.setActionCommand("B1_4");
		B1_4.setVisible(true);
		B1_4.setBounds(355, 25, 50, 50);
		add(B1_4);
		
		B2_1 = new JButton("");
		B2_1.setActionCommand("B2_1");
		B2_1.setVisible(true);
		B2_1.setBounds(25, 125, 50, 50);
		add(B2_1);
		
		B2_2 = new JButton("");
		B2_2.setActionCommand("B2_2");
		B2_2.setVisible(true);
		B2_2.setBounds(135, 125, 50, 50);
		add(B2_2);
		
		B2_3 = new JButton("");
		B2_3.setActionCommand("B2_3");
		B2_3.setVisible(true);
		B2_3.setBounds(245, 125, 50, 50);
		add(B2_3);
		
		B2_4 = new JButton("");
		B2_4.setActionCommand("B2_4");
		B2_4.setVisible(true);
		B2_4.setBounds(355, 125, 50, 50);
		add(B2_4);
		
		B3_1 = new JButton("");
		B3_1.setActionCommand("B3_1");
		B3_1.setVisible(true);
		B3_1.setBounds(25, 225, 50, 50);
		add(B3_1);

		B3_2 = new JButton("");
		B3_2.setActionCommand("B3_2");
		B3_2.setVisible(true);
		B3_2.setBounds(135, 225, 50, 50);
		add(B3_2);

		B3_3 = new JButton("");
		B3_3.setActionCommand("B3_3");
		B3_3.setVisible(true);
		B3_3.setBounds(245, 225, 50, 50);
		add(B3_3);

		B3_4 = new JButton("");
		B3_4.setActionCommand("B3_4");
		B3_4.setVisible(true);
		B3_4.setBounds(355, 225, 50, 50);
		add(B3_4);
		

		B4_1 = new JButton("");
		B4_1.setActionCommand("B4_1");
		B4_1.setVisible(true);
		B4_1.setBounds(25, 325, 50, 50);
		add(B4_1);
		
		B4_2 = new JButton("");
		B4_2.setActionCommand("B4_2");
		B4_2.setVisible(true);
		B4_2.setBounds(135, 325, 50, 50);
		add(B4_2);
		
		B4_3 = new JButton("");
		B4_3.setActionCommand("B4_3");
		B4_3.setVisible(true);
		B4_3.setBounds(245, 325, 50, 50);
		add(B4_3);
		
		B4_4 = new JButton("");
		B4_4.setActionCommand("B4_4");
		B4_4.setVisible(true);
		B4_4.setBounds(355, 325, 50, 50);
		add(B4_4);
	}

}

package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Quatriqui extends JFrame {
	
	private PanelRegistro pregistro;
	
	private JButton bt_Men�;
	
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
		
		bt_Men� = new JButton("Men�");
		bt_Men�.setActionCommand("MEN�");
		bt_Men�.setBounds(20, 475, 100, 30);
		bt_Men�.setVisible(true);
		add(bt_Men�);
		
		pregistro = new PanelRegistro();
		pregistro.setBounds(400, 0, 400, 600);
		pregistro.setVisible(true);
		getContentPane().add(pregistro);
		
	}

	public JButton getBt_Men�() {
		return bt_Men�;
	}

	public void setBt_Men�(JButton bt_Men�) {
		this.bt_Men� = bt_Men�;
	}

	public PanelRegistro getPregistro() {
		return pregistro;
	}

	public void setPregistro(PanelRegistro pregistro) {
		this.pregistro = pregistro;
	}
	
	

}

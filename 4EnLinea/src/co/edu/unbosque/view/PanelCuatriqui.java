package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * Clase PanelCuatriqui que extiendede JPanel, contiene los JLabel y Botones para el juego 
 * @author Jinetes del apocalipsis
 *  
 */
public class PanelCuatriqui extends JPanel{
	
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16;//Atributos JLabel que contendran la jugada de los jugadores 
	private JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16;// Atributos JButton que contiene los Botones para el juego
	
/**
 * Constructor de la clase PanelCuatriqui que inicializa el metodo del Panel
 */
	public PanelCuatriqui() {
		
		setLayout(null);
		
		
		funcionar();
		
	}
	/**
	 * Metodo que inicializa los atributos, les da sus especificaciones y los agrega al panel.
	 */
	public void funcionar() {
		
		
		
		lb1 = new JLabel("");
		lb1.setBounds(2, 2, 80, 80);
		lb1.setFont(new Font("Tahoma", 1, 80));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setForeground(Color.black);
		lb1.setVisible(false);
		lb1.setOpaque(true);
		lb1.setBackground(Color.white);
		add(lb1);
		
		lb2 = new JLabel("");
		lb2.setBounds(102, 2, 80, 80);
		lb2.setFont(new Font("Tahoma", 1, 80));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setForeground(Color.black);
		lb2.setVisible(false);
		lb2.setOpaque(true);
		lb2.setBackground(Color.white);
		add(lb2);
		
		lb3 = new JLabel("");
		lb3.setBounds(202, 2, 80, 80);
		lb3.setFont(new Font("Tahoma", 1, 80));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setForeground(Color.black);
		lb3.setVisible(false);
		lb3.setOpaque(true);
		lb3.setBackground(Color.white);
		add(lb3);
		
		lb4 = new JLabel("");
		lb4.setBounds(302, 2, 80, 80);
		lb4.setFont(new Font("Tahoma", 1, 80));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setForeground(Color.black);
		lb4.setVisible(false);
		lb4.setOpaque(true);
		lb4.setBackground(Color.white);
		add(lb4);
		
		lb5 = new JLabel("");
		lb5.setBounds(2, 102, 80, 80);
		lb5.setFont(new Font("Tahoma", 1, 80));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setForeground(Color.black);
		lb5.setVisible(false);
		lb5.setOpaque(true);
		lb5.setBackground(Color.white);
		add(lb5);
		
		lb6 = new JLabel("");
		lb6.setBounds(102, 102, 80, 80);
		lb6.setFont(new Font("Tahoma", 1, 80));
		lb6.setHorizontalAlignment(JLabel.CENTER);
		lb6.setForeground(Color.black);
		lb6.setVisible(false);
		lb6.setOpaque(true);
		lb6.setBackground(Color.white);
		add(lb6);
		
		lb7 = new JLabel("");
		lb7.setBounds(202, 102, 80, 80);
		lb7.setFont(new Font("Tahoma", 1, 80));
		lb7.setHorizontalAlignment(JLabel.CENTER);
		lb7.setForeground(Color.black);
		lb7.setVisible(false);
		lb7.setOpaque(true);
		lb7.setBackground(Color.white);
		add(lb7);
		
		lb8 = new JLabel("");
		lb8.setBounds(302, 102, 80, 80);
		lb8.setFont(new Font("Tahoma", 1, 80));
		lb8.setHorizontalAlignment(JLabel.CENTER);
		lb8.setForeground(Color.black);
		lb8.setVisible(false);
		lb8.setOpaque(true);
		lb8.setBackground(Color.white);
		add(lb8);
		
		lb9 = new JLabel("");
		lb9.setBounds(2, 202, 80, 80);
		lb9.setFont(new Font("Tahoma", 1, 80));
		lb9.setHorizontalAlignment(JLabel.CENTER);
		lb9.setForeground(Color.black);
		lb9.setVisible(false);
		lb9.setOpaque(true);
		lb9.setBackground(Color.white);
		add(lb9);
		
		lb10 = new JLabel("");
		lb10.setBounds(102, 202, 80, 80);
		lb10.setFont(new Font("Tahoma", 1, 80));
		lb10.setHorizontalAlignment(JLabel.CENTER);
		lb10.setForeground(Color.black);
		lb10.setVisible(false);
		lb10.setOpaque(true);
		lb10.setBackground(Color.white);
		add(lb10);
		
		lb11 = new JLabel("");
		lb11.setBounds(202, 202, 80, 80);
		lb11.setFont(new Font("Tahoma", 1, 80));
		lb11.setHorizontalAlignment(JLabel.CENTER);
		lb11.setForeground(Color.black);
		lb11.setVisible(false);
		lb11.setOpaque(true);
		lb11.setBackground(Color.white);
		add(lb11);
		
		lb12 = new JLabel("");
		lb12.setBounds(302, 202, 80, 80);
		lb12.setFont(new Font("Tahoma", 1, 80));
		lb12.setHorizontalAlignment(JLabel.CENTER);
		lb12.setForeground(Color.black);
		lb12.setVisible(false);
		lb12.setOpaque(true);
		lb12.setBackground(Color.white);
		add(lb12);
		
		lb13 = new JLabel("");
		lb13.setBounds(2, 302, 80, 80);
		lb13.setFont(new Font("Tahoma", 1, 80));
		lb13.setHorizontalAlignment(JLabel.CENTER);
		lb13.setForeground(Color.black);
		lb13.setVisible(false);
		lb13.setOpaque(true);
		lb13.setBackground(Color.white);
		add(lb13);
		
		lb14 = new JLabel("");
		lb14.setBounds(102, 302, 80, 80);
		lb14.setFont(new Font("Tahoma", 1, 80));
		lb14.setHorizontalAlignment(JLabel.CENTER);
		lb14.setForeground(Color.black);
		lb14.setVisible(false);
		lb14.setOpaque(true);
		lb14.setBackground(Color.white);
		add(lb14);
		
		lb15 = new JLabel("");
		lb15.setBounds(202, 302, 80, 80);
		lb15.setFont(new Font("Tahoma", 1, 80));
		lb15.setHorizontalAlignment(JLabel.CENTER);
		lb15.setForeground(Color.black);
		lb15.setVisible(false);
		lb15.setOpaque(true);
		lb15.setBackground(Color.white);
		add(lb15);
		
		lb16 = new JLabel("");
		lb16.setBounds(302, 302, 80, 80);
		lb16.setFont(new Font("Tahoma", 1, 80));
		lb16.setHorizontalAlignment(JLabel.CENTER);
		lb16.setForeground(Color.black);
		lb16.setVisible(false);
		lb16.setOpaque(true);
		lb16.setBackground(Color.white);
		add(lb16);
		
		// BOTONESSSSSSSSSSSSSSSS
		B1 = new JButton();
		B1.setActionCommand("UNO");
		B1.setOpaque(true);
		B1.setBounds(2, 2, 80, 80);
		B1.setBackground(new Color(255,255,255,255));
		B1.setVisible(true);
		add(B1);
		
		B2 = new JButton();
		B2.setActionCommand("DOS");
		B2.setOpaque(true);
		B2.setBounds(102, 2, 80, 80);
		B2.setBackground(new Color(255,255,255,255));
		B2.setVisible(true);
		add(B2);
		
		B3 = new JButton();
		B3.setActionCommand("TRES");
		B3.setOpaque(true);
		B3.setBounds(202, 2, 80, 80);
		B3.setBackground(new Color(255,255,255,255));
		B3.setVisible(true);
		add(B3);
		
		B4 = new JButton();
		B4.setActionCommand("CUATRO");
		B4.setOpaque(true);
		B4.setBounds(302, 2, 80, 80);
		B4.setBackground(new Color(255,255,255,255));
		B4.setVisible(true);
		add(B4);
		
		B5 = new JButton();
		B5.setActionCommand("CINCO");
		B5.setOpaque(true);
		B5.setBounds(2, 102, 80, 80);
		B5.setBackground(new Color(255,255,255,255));
		B5.setVisible(true);
		add(B5);
		
		B6 = new JButton();
		B6.setActionCommand("SEIS");
		B6.setOpaque(true);
		B6.setBounds(102, 102, 80, 80);
		B6.setBackground(new Color(255,255,255,255));
		B6.setVisible(true);
		add(B6);
		
		B7 = new JButton();
		B7.setActionCommand("SIETE");
		B7.setOpaque(true);
		B7.setBounds(202, 102, 80, 80);
		B7.setBackground(new Color(255,255,255,255));
		B7.setVisible(true);
		add(B7);
		
		B8 = new JButton();
		B8.setActionCommand("OCHO");
		B8.setOpaque(true);
		B8.setBounds(302, 102, 80, 80);
		B8.setBackground(new Color(255,255,255,255));
		B8.setVisible(true);
		add(B8);
		
		B9 = new JButton();
		B9.setActionCommand("NUEVE");
		B9.setOpaque(true);
		B9.setBounds(2, 202, 80, 80);
		B9.setBackground(new Color(255,255,255,255));
		B9.setVisible(true);
		add(B9);
		
		B10 = new JButton();
		B10.setActionCommand("DIEZ");
		B10.setOpaque(true);
		B10.setBounds(102, 202, 80, 80);
		B10.setBackground(new Color(255,255,255,255));
		B10.setVisible(true);
		add(B10);
		
		B11 = new JButton();
		B11.setActionCommand("ONCE");
		B11.setOpaque(true);
		B11.setBounds(202, 202, 80, 80);
		B11.setBackground(new Color(255,255,255,255));
		B11.setVisible(true);
		add(B11);
		
		B12 = new JButton();
		B12.setActionCommand("DOCE");
		B12.setOpaque(true);
		B12.setBounds(302, 202, 80, 80);
		B12.setBackground(new Color(255,255,255,255));
		B12.setVisible(true);
		add(B12);
		
		B13 = new JButton();
		B13.setActionCommand("TRECE");
		B13.setOpaque(true);
		B13.setBounds(2, 302, 80, 80);
		B13.setBackground(new Color(255,255,255,255));
		B13.setVisible(true);
		add(B13);
		
		B14 = new JButton();
		B14.setActionCommand("CATORCE");
		B14.setOpaque(true);
		B14.setBounds(102, 302, 80, 80);
		B14.setBackground(new Color(255,255,255,255));
		B14.setVisible(true);
		add(B14);
		
		B15 = new JButton();
		B15.setActionCommand("QUINCE");
		B15.setOpaque(true);
		B15.setBounds(202, 302, 80, 80);
		B15.setBackground(new Color(255,255,255,255));
		B15.setVisible(true);
		add(B15);
		
		B16 = new JButton();
		B16.setActionCommand("DIECISEIS");
		B16.setOpaque(true);
		B16.setBounds(302, 302, 80, 80);
		B16.setBackground(new Color(255,255,255,255));
		B16.setVisible(true);
		add(B16);
		

		
		
		
	}
	/**
	 * Metodo que permite acceder al atributo Lb1
	 * @return lb1
	 */
	public JLabel getLb1() {
		return lb1;
	}
	/**
	 * Metodo que permite modificar el atributo Lb1
	 * @param lb1 to set lb1
	 */
	public void setLb1(JLabel lb1) {
		this.lb1 = lb1;
	}
	/**
	 * Metodo que permite acceder al atributo Lb2
	 * @return lb2
	 */
	public JLabel getLb2() {
		return lb2;
	}
	/**
	 * Metodo que permite modificar el atributo Lb2
	 * @param lb2 to set lb2
	 */
	public void setLb2(JLabel lb2) {
		this.lb2 = lb2;
	}
	/**
	 * Metodo que permite acceder al atributo Lb3
	 * @return lb3
	 */
	public JLabel getLb3() {
		return lb3;
	}
	/**
	 * Metodo que permite modificar el atributo Lb3
	 * @param lb3 to set lb3
	 */
	public void setLb3(JLabel lb3) {
		this.lb3 = lb3;
	}
	/**
	 * Metodo que permite acceder al atributo Lb4
	 * @return lb4
	 */
	public JLabel getLb4() {
		return lb4;
	}
	/**
	 * Metodo que permite modificar el atributo Lb4
	 * @param lb4 to set lb4
	 */
	public void setLb4(JLabel lb4) {
		this.lb4 = lb4;
	}
	/**
	 * Metodo que permite acceder al atributo Lb5
	 * @return lb5
	 */
	public JLabel getLb5() {
		return lb5;
	}
	/**
	 * Metodo que permite modificar el atributo Lb5
	 * @param lb5 to set lb5
	 */
	public void setLb5(JLabel lb5) {
		this.lb5 = lb5;
	}
	/**
	 * Metodo que permite acceder al atributo Lb6
	 * @return lb6
	 */
	public JLabel getLb6() {
		return lb6;
	}
	/**
	 * Metodo que permite modificar el atributo Lb6
	 * @param lb6 to set lb6
	 */
	public void setLb6(JLabel lb6) {
		this.lb6 = lb6;
	}
	/**
	 * Metodo que permite acceder al atributo Lb7
	 * @return lb7
	 */
	public JLabel getLb7() {
		return lb7;
	}
	/**
	 * Metodo que permite modificar el atributo Lb7
	 * @param lb7 to set lb7
	 */
	public void setLb7(JLabel lb7) {
		this.lb7 = lb7;
	}
	/**
	 * Metodo que permite acceder al atributo Lb8
	 * @return lb8
	 */
	public JLabel getLb8() {
		return lb8;
	}
	/**
	 * Metodo que permite modificar el atributo Lb8
	 * @param lb8 to set lb8
	 */
	public void setLb8(JLabel lb8) {
		this.lb8 = lb8;
	}
	/**
	 * Metodo que permite acceder al atributo Lb9
	 * @return lb9
	 */
	public JLabel getLb9() {
		return lb9;
	}
	/**
	 * Metodo que permite modificar el atributo Lb9
	 * @param lb9 to set lb9
	 */
	public void setLb9(JLabel lb9) {
		this.lb9 = lb9;
	}
	/**
	 * Metodo que permite acceder al atributo Lb10
	 * @return lb10
	 */
	public JLabel getLb10() {
		return lb10;
	}
	/**
	 * Metodo que permite modificar el atributo Lb10
	 * @param lb10 to set lb10
	 */
	public void setLb10(JLabel lb10) {
		this.lb10 = lb10;
	}
	/**
	 * Metodo que permite acceder al atributo Lb11
	 * @return lb11
	 */
	public JLabel getLb11() {
		return lb11;
	}
	/**
	 * Metodo que permite modificar el atributo Lb11
	 * @param lb11 to set lb11
	 */
	public void setLb11(JLabel lb11) {
		this.lb11 = lb11;
	}
	/**
	 * Metodo que permite acceder al atributo Lb12
	 * @return lb12
	 */
	public JLabel getLb12() {
		return lb12;
	}
	/**
	 * Metodo que permite modificar el atributo Lb12
	 * @param lb12 to set lb12
	 */
	public void setLb12(JLabel lb12) {
		this.lb12 = lb12;
	}
	/**
	 * Metodo que permite acceder al atributo Lb13
	 * @return lb13
	 */
	public JLabel getLb13() {
		return lb13;
	}
	/**
	 * Metodo que permite modificar el atributo Lb13
	 * @param lb13 to set lb13
	 */
	public void setLb13(JLabel lb13) {
		this.lb13 = lb13;
	}
	/**
	 * Metodo que permite acceder al atributo Lb14
	 * @return lb14
	 */
	public JLabel getLb14() {
		return lb14;
	}
	/**
	 * Metodo que permite modificar el atributo Lb14
	 * @param lb14 to set lb14
	 */
	public void setLb14(JLabel lb14) {
		this.lb14 = lb14;
	}
	/**
	 * Metodo que permite acceder al atributo Lb15
	 * @return lb15
	 */
	public JLabel getLb15() {
		return lb15;
	}
	/**
	 * Metodo que permite modificar el atributo Lb15
	 * @param lb15 to set lb15
	 */
	public void setLb15(JLabel lb15) {
		this.lb15 = lb15;
	}
	/**
	 * Metodo que permite acceder al atributo Lb16
	 * @return lb16
	 */
	public JLabel getLb16() {
		return lb16;
	}
	/**
	 * Metodo que permite modificar el atributo Lb16
	 * @param lb16 to set lb16
	 */
	public void setLb16(JLabel lb16) {
		this.lb16 = lb16;
	}
	/**
	 * Metodo que permite acceder al atributo B1
	 * @return B1
	 */
	public JButton getB1() {
		return B1;
	}
	/**
	 * Metodo que permite modificar el atributo B1
	 * @param b1 to set B1
	 */
	public void setB1(JButton b1) {
		B1 = b1;
	}
	/**
	 * Metodo que permite acceder al atributo B2
	 * @return B12
	 */
	public JButton getB2() {
		return B2;
	}
	/**
	 * Metodo que permite modificar el atributo B2
	 * @param b2 to set B2
	 */
	public void setB2(JButton b2) {
		B2 = b2;
	}
	/**
	 * Metodo que permite acceder al atributo B3
	 * @return B3
	 */
	public JButton getB3() {
		return B3;
	}
	/**
	 * Metodo que permite modificar el atributo B3
	 * @param b3 to set B3
	 */
	public void setB3(JButton b3) {
		B3 = b3;
	}
	/**
	 * Metodo que permite acceder al atributo B4
	 * @return B4
	 */
	public JButton getB4() {
		return B4;
	}
	/**
	 * Metodo que permite modificar el atributo B4
	 * @param b4 to set B4
	 */
	public void setB4(JButton b4) {
		B4 = b4;
	}
	/**
	 * Metodo que permite acceder al atributo B5
	 * @return B5
	 */
	public JButton getB5() {
		return B5;
	}
	/**
	 * Metodo que permite modificar el atributo B5
	 * @param b5 to set B5
	 */
	public void setB5(JButton b5) {
		B5 = b5;
	}
	/**
	 * Metodo que permite acceder al atributo B6
	 * @return B6
	 */
	public JButton getB6() {
		return B6;
	}
	/**
	 * Metodo que permite modificar el atributo B6
	 * @param b6 to set B6
	 */
	public void setB6(JButton b6) {
		B6 = b6;
	}
	/**
	 * Metodo que permite acceder al atributo B7
	 * @return B7
	 */
	public JButton getB7() {
		return B7;
	}
	/**
	 * Metodo que permite modificar el atributo B7
	 * @param b7 to set B7
	 */
	public void setB7(JButton b7) {
		B7 = b7;
	}
	/**
	 * Metodo que permite acceder al atributo B8
	 * @return B8
	 */
	public JButton getB8() {
		return B8;
	}
	/**
	 * Metodo que permite modificar el atributo B8
	 * @param b8 to set B8
	 */
	public void setB8(JButton b8) {
		B8 = b8;
	}
	/**
	 * Metodo que permite acceder al atributo B9
	 * @return B9
	 */
	public JButton getB9() {
		return B9;
	}
	/**
	 * Metodo que permite modificar el atributo B9
	 * @param b9 to set B9
	 */
	public void setB9(JButton b9) {
		B9 = b9;
	}
	/**
	 * Metodo que permite acceder al atributo B10
	 * @return B10
	 */
	public JButton getB10() {
		return B10;
	}
	/**
	 * Metodo que permite modificar el atributo B10
	 * @param b10 to set B10
	 */
	public void setB10(JButton b10) {
		B10 = b10;
	}
	/**
	 * Metodo que permite acceder al atributo B11
	 * @return B11
	 */
	public JButton getB11() {
		return B11;
	}
	/**
	 * Metodo que permite modificar el atributo B11
	 * @param b11 to set B11
	 */
	public void setB11(JButton b11) {
		B11 = b11;
	}
	/**
	 * Metodo que permite acceder al atributo B12
	 * @return B12
	 */
	public JButton getB12() {
		return B12;
	}
	/**
	 * Metodo que permite modificar el atributo B12
	 * @param b12 to set B12
	 */
	public void setB12(JButton b12) {
		B12 = b12;
	}
	/**
	 * Metodo que permite acceder al atributo B13
	 * @return B13
	 */
	public JButton getB13() {
		return B13;
	}
	/**
	 * Metodo que permite modificar el atributo B13
	 * @param b13 to set B13
	 */
	public void setB13(JButton b13) {
		B13 = b13;
	}
	/**
	 * Metodo que permite acceder al atributo B14
	 * @return B14
	 */
	public JButton getB14() {
		return B14;
	}
	/**
	 * Metodo que permite modificar el atributo B14
	 * @param b14 to set B14
	 */
	public void setB14(JButton b14) {
		B14 = b14;
	}
	/**
	 * Metodo que permite acceder al atributo B15
	 * @return B15
	 */
	public JButton getB15() {
		return B15;
	}
	/**
	 * Metodo que permite modificar el atributo B15
	 * @param b15to set B15
	 */
	public void setB15(JButton b15) {
		B15 = b15;
	}
	/**
	 * Metodo que permite acceder al atributo B16
	 * @return B16
	 */
	public JButton getB16() {
		return B16;
	}
	/**
	 * Metodo que permite modificar el atributo B16
	 * @param b16 to set B16
	 */
	public void setB16(JButton b16) {
		B16 = b16;
	}
	
	
}

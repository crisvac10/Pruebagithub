package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelCuatriqui extends JPanel{
	
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel lb5;
	private JLabel lb6;
	private JLabel lb7;
	private JLabel lb8;
	private JLabel lb9;
	private JLabel lb10;
	private JLabel lb11;
	private JLabel lb12;
	private JLabel lb13;
	private JLabel lb14;
	private JLabel lb15;
	private JLabel lb16;
	

	public PanelCuatriqui() {
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		funcionar();
		
	}
	public void funcionar() {
		
		lb1 = new JLabel();
		lb1.setBounds(2, 2, 80, 80);
		lb1.setFont(new Font("Tahoma", 1, 80));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setVisible(true);
		lb1.setOpaque(true);
		lb1.setBackground(Color.white);
		add(lb1);
		
		lb2 = new JLabel();
		lb2.setBounds(102, 2, 80, 80);
		lb2.setFont(new Font("Tahoma", 1, 80));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setVisible(true);
		lb2.setOpaque(true);
		lb2.setBackground(Color.white);
		add(lb2);
		
		lb3 = new JLabel();
		lb3.setBounds(202, 2, 80, 80);
		lb3.setFont(new Font("Tahoma", 1, 80));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setVisible(true);
		lb3.setOpaque(true);
		lb3.setBackground(Color.white);
		add(lb3);
		
		lb4 = new JLabel();
		lb4.setBounds(302, 2, 80, 80);
		lb4.setFont(new Font("Tahoma", 1, 80));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setVisible(true);
		lb4.setOpaque(true);
		lb4.setBackground(Color.white);
		add(lb4);
		
		lb5 = new JLabel();
		lb5.setBounds(2, 102, 80, 80);
		lb5.setFont(new Font("Tahoma", 1, 80));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setVisible(true);
		lb5.setOpaque(true);
		lb5.setBackground(Color.white);
		add(lb5);
		
		lb6 = new JLabel();
		lb6.setBounds(102, 102, 80, 80);
		lb6.setFont(new Font("Tahoma", 1, 80));
		lb6.setHorizontalAlignment(JLabel.CENTER);
		lb6.setVisible(true);
		lb6.setOpaque(true);
		lb6.setBackground(Color.white);
		add(lb6);
		
		lb7 = new JLabel();
		lb7.setBounds(202, 102, 80, 80);
		lb7.setFont(new Font("Tahoma", 1, 80));
		lb7.setHorizontalAlignment(JLabel.CENTER);
		lb7.setVisible(true);
		lb7.setOpaque(true);
		lb7.setBackground(Color.white);
		add(lb7);
		
		lb8 = new JLabel();
		lb8.setBounds(302, 102, 80, 80);
		lb8.setFont(new Font("Tahoma", 1, 80));
		lb8.setHorizontalAlignment(JLabel.CENTER);
		lb8.setVisible(true);
		lb8.setOpaque(true);
		lb8.setBackground(Color.white);
		add(lb8);
		
		lb9 = new JLabel();
		lb9.setBounds(2, 202, 80, 80);
		lb9.setFont(new Font("Tahoma", 1, 80));
		lb9.setHorizontalAlignment(JLabel.CENTER);
		lb9.setVisible(true);
		lb9.setOpaque(true);
		lb9.setBackground(Color.white);
		add(lb9);
		
		lb10 = new JLabel();
		lb10.setBounds(102, 202, 80, 80);
		lb10.setFont(new Font("Tahoma", 1, 80));
		lb10.setHorizontalAlignment(JLabel.CENTER);
		lb10.setVisible(true);
		lb10.setOpaque(true);
		lb10.setBackground(Color.white);
		add(lb10);
		
		lb11 = new JLabel();
		lb11.setBounds(202, 202, 80, 80);
		lb11.setFont(new Font("Tahoma", 1, 80));
		lb11.setHorizontalAlignment(JLabel.CENTER);
		lb11.setVisible(true);
		lb11.setOpaque(true);
		lb11.setBackground(Color.white);
		add(lb11);
		
		lb12 = new JLabel();
		lb12.setBounds(302, 202, 80, 80);
		lb12.setFont(new Font("Tahoma", 1, 80));
		lb12.setHorizontalAlignment(JLabel.CENTER);
		lb12.setVisible(true);
		lb12.setOpaque(true);
		lb12.setBackground(Color.white);
		add(lb12);
		
		lb13 = new JLabel();
		lb13.setBounds(2, 302, 80, 80);
		lb13.setFont(new Font("Tahoma", 1, 80));
		lb13.setHorizontalAlignment(JLabel.CENTER);
		lb13.setVisible(true);
		lb13.setOpaque(true);
		lb13.setBackground(Color.white);
		add(lb13);
		
		lb14 = new JLabel();
		lb14.setBounds(102, 302, 80, 80);
		lb14.setFont(new Font("Tahoma", 1, 80));
		lb14.setHorizontalAlignment(JLabel.CENTER);
		lb14.setVisible(true);
		lb14.setOpaque(true);
		lb14.setBackground(Color.white);
		add(lb14);
		
		lb15 = new JLabel();
		lb15.setBounds(202, 302, 80, 80);
		lb15.setFont(new Font("Tahoma", 1, 80));
		lb15.setHorizontalAlignment(JLabel.CENTER);
		lb15.setVisible(true);
		lb15.setOpaque(true);
		lb15.setBackground(Color.white);
		add(lb15);
		
		lb16 = new JLabel();
		lb16.setBounds(302, 302, 80, 80);
		lb16.setFont(new Font("Tahoma", 1, 80));
		lb16.setHorizontalAlignment(JLabel.CENTER);
		lb16.setVisible(true);
		lb16.setOpaque(true);
		lb16.setBackground(Color.white);
		add(lb16);
		
		
	}
	public JLabel getLb1() {
		return lb1;
	}
	public void setLb1(JLabel lb1) {
		this.lb1 = lb1;
	}
	public JLabel getLb2() {
		return lb2;
	}
	public void setLb2(JLabel lb2) {
		this.lb2 = lb2;
	}
	public JLabel getLb3() {
		return lb3;
	}
	public void setLb3(JLabel lb3) {
		this.lb3 = lb3;
	}
	public JLabel getLb4() {
		return lb4;
	}
	public void setLb4(JLabel lb4) {
		this.lb4 = lb4;
	}
	public JLabel getLb5() {
		return lb5;
	}
	public void setLb5(JLabel lb5) {
		this.lb5 = lb5;
	}
	public JLabel getLb6() {
		return lb6;
	}
	public void setLb6(JLabel lb6) {
		this.lb6 = lb6;
	}
	public JLabel getLb7() {
		return lb7;
	}
	public void setLb7(JLabel lb7) {
		this.lb7 = lb7;
	}
	public JLabel getLb8() {
		return lb8;
	}
	public void setLb8(JLabel lb8) {
		this.lb8 = lb8;
	}
	public JLabel getLb9() {
		return lb9;
	}
	public void setLb9(JLabel lb9) {
		this.lb9 = lb9;
	}
	public JLabel getLb10() {
		return lb10;
	}
	public void setLb10(JLabel lb10) {
		this.lb10 = lb10;
	}
	public JLabel getLb11() {
		return lb11;
	}
	public void setLb11(JLabel lb11) {
		this.lb11 = lb11;
	}
	public JLabel getLb12() {
		return lb12;
	}
	public void setLb12(JLabel lb12) {
		this.lb12 = lb12;
	}
	public JLabel getLb13() {
		return lb13;
	}
	public void setLb13(JLabel lb13) {
		this.lb13 = lb13;
	}
	public JLabel getLb14() {
		return lb14;
	}
	public void setLb14(JLabel lb14) {
		this.lb14 = lb14;
	}
	public JLabel getLb15() {
		return lb15;
	}
	public void setLb15(JLabel lb15) {
		this.lb15 = lb15;
	}
	public JLabel getLb16() {
		return lb16;
	}
	public void setLb16(JLabel lb16) {
		this.lb16 = lb16;
	}
}

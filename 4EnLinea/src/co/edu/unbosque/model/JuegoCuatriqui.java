package co.edu.unbosque.model;

import co.edu.unbosque.view.PanelCuatriqui;

public class JuegoCuatriqui {
	public PanelCuatriqui PanelCuatriqui;
	String turno = "X";

	public JuegoCuatriqui() {
		PanelCuatriqui = new PanelCuatriqui();
	}

	public String turnos() {

		if (turno.equals("X")) {
			turno = "O";
		} else if (turno.equals("O")) {
			turno = "X";
		}
		return turno;
	}
}

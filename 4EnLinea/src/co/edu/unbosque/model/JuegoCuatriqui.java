package co.edu.unbosque.model;

import co.edu.unbosque.view.PanelCuatriqui;

public class JuegoCuatriqui {
	public PanelCuatriqui PanelCuatriqui;
	String Turno="X";
	public JuegoCuatriqui() {
		PanelCuatriqui = new PanelCuatriqui();
		
	}
	public void juego() {
	}
		public String Turnos() {
	   if (Turno == "X") {
		   Turno ="O";
	   }else if (Turno == "O") {
		   Turno="X";
	   }
	return Turno;
		}
	}

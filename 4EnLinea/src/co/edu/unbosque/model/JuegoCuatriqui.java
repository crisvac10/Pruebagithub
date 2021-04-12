package co.edu.unbosque.model;

public class JuegoCuatriqui {
	String turno = "O";


	public String turnos() {

		if (turno.equals("X")) {
			turno = "O";
		} else if (turno.equals("O")) {
			turno = "X";
		}
		return turno;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}
	

}

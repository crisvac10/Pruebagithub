package co.edu.unbosque.model;
import co.edu.unbosque.view.PanelCuatriqui;

public class JuegoCuatriqui {
	public PanelCuatriqui PanelCuatriqui;
	private String turno = "O";
	private int puntajeJ1;
	private int puntajeJ2;
	private int empate;
	
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
	
	


	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getPuntajeJ1() {
		String pj1 ="";
		pj1= String.valueOf(puntajeJ1);
		return pj1;
	}
	
	public void setPuntajeJ1(int puntajeJ1) {
		this.puntajeJ1 = puntajeJ1;
	}
	
	public String getPuntajeJ2() {
		String pj2="";
		pj2= String.valueOf(puntajeJ2);
		return pj2;
	}
	
	public void setPuntajeJ2(int puntajeJ2) {
		this.puntajeJ2 = puntajeJ2;
	}
	
	public String getEmpate() {
		String emp ="";
		emp= String.valueOf(emp);
		return emp;
	}
	
	public void setEmpate(int empate) {
		this.empate = empate;
	}

}

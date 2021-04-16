package co.edu.unbosque.model;
import co.edu.unbosque.view.PanelCuatriqui;
/**
 * Clase JuegoCuatriqui donde da los turnos para el juego
 * @author Jinetes del apocalipsis
 *
 */
public class JuegoCuatriqui {
	public PanelCuatriqui PanelCuatriqui;// Atributo PanelCuatriqui renombrado 
	private String turno = "O";// Atributo tipo String que inicializa el turno 
	private int puntajeJ1=0;// Atributo tipo int que contiene el puntaje del Jugador 1
	private int puntajeJ2=0;// Atributo tipo int que contiene el puntaje del Jugador 2
	private int empate=0;// Atributo tipo int que contiene el puntaje de empatados
	
	/**
	 * Constructor de la clase JuegoCuatriqui  
	 */
	public JuegoCuatriqui() {
		
		

	}
	/**
	 * Metodo de tipo String que asigna los turnos del juego
	 * @return turno 
	 */
	public String turnos() {

		if (turno.equals("X")) {
			turno = "O";
		} else if (turno.equals("O")) {
			turno = "X";
		}
		return turno;
	}
	
	

/**
 * Metodo que permite modificar el atributo Turno
 * @param turno to set Turno
 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
	/**
	 * Metodo que permite acceder al atributo PuntajeJ1
	 * @return pj1
	 */
	public String getPuntajeJ1() {
		String pj1 ="";
		pj1= String.valueOf(puntajeJ1);
		return pj1;
	}
	/**
	 * Metodo que permite modificar el atributo PuntajeJ1
	 * @param puntajeJ1 to set PuntajeJ1
	 */
	public void setPuntajeJ1(int puntajeJ1) {
		this.puntajeJ1 = puntajeJ1;
	}
	/**
	 * Metodo que permite acceder al atributo PuntajeJ2
	 * @return pj2
	 */
	public String getPuntajeJ2() {
		String pj2="";
		pj2= String.valueOf(puntajeJ2);
		return pj2;
	}
	/**
	 * Metodo que permite modificar el atributo PuntajeJ2
	 * @param puntajeJ2 to set PuntajeJ2
	 */
	public void setPuntajeJ2(int puntajeJ2) {
		this.puntajeJ2 = puntajeJ2;
	}
	/**
	 * Metodo que permite acceder al atributo Empate
	 * @return emp
	 */
	public String getEmpate() {
		String emp ="";
		emp= String.valueOf(empate);
		return emp;
	}
	/**
	 * Metodo que permite modificar el Atributo Empate
	 * @param string to set empate
	 */
	public void setEmpate(int string) {
		this.empate = string;
	}

}

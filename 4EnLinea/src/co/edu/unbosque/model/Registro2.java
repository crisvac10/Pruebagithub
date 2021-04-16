package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;
/**
 * Clase Registro2 que contiene los archivos de texto guardados del juego
 * @author Jinetes del apocalipsis
 *
 */
public class Registro2 { 

	private String texto;// Atributo de tipo String que guarda el historial
	Archivo arch;// Atributo de tipo Archivo que guarda el archivo
/**
 * Constructor dela clase Registro2 inicializa el archivo	
 */
	public Registro2() {
		arch = new Archivo();
	}
	/**
	 * Constructor de la clase Registro2 
	 * @param f2 Archivo2
	 */
	public Registro2(File f2) {
		arch = new Archivo(f2, f2);
	}
	/**
	 * Metodo de tipo String que permite leer el archivo  
	 * @return texto
	 */
	public String leerRegistro() {
		texto = arch.leerArchivo();
		return texto;
	}
 
	/**
	 * Metodo de tipo String que modifica el Registro
	 * @param frase
	 * @return archivo que se escribio
	 */
	public String actualizarRegistro(String frase) {
		return arch.escribirArchivo(frase);
	}
/**
 * Metodo que permite acceder al atributo Texto
 * @return texto
 */
	public String getTexto() {
		return texto;
	}
/**
 * Metodo que permite modificar el atributo Texto
 * @param texto to set Texto
 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}


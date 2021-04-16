package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;

public class Registro {
	
	private String texto;
	Archivo arch;
	
	public Registro() {
		arch = new Archivo();
	}
	
	public Registro(File f) {
		arch = new Archivo(f, f);
	}
	
	public String leerRegistro() {
		texto = arch.leerArchivo();
		return texto;
	}
	
	
	public String actualizarRegistro(String frase) {
		return arch.escribirArchivo(frase);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
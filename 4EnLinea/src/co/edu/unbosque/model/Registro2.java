package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;

public class Registro2 { 

	private String texto;
	Archivo arch;
	
	public Registro2() {
		arch = new Archivo();
	}
	
	public Registro2(File f2) {
		arch = new Archivo(f2, f2);
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


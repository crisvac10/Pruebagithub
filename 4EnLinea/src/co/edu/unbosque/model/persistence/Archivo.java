package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase Archivo persistencia del programa 
 * @author Jinetes del apocalipsis
 *
 */
public class Archivo {
	
	private File f;//Atributo de tipo File que contiene un archivo de texto 1
	private File f2;// Atributo de tipo File que contiene un archivo de texto 2
	/**
	 * Constructor de la clase Archivo que inicializa los archivos registro y registro2
	 */
	public Archivo() {
		f = new File("historial\\registro.txt");
		f2 = new File("historial\\historial.txt");
	}
	/**
	 * Constructor de la clase Archivo  que crea dos metodos
	 * @param f
	 * @param f2
	 */
	public Archivo(File f, File f2) {
		this.f = f;
		this.f2 = f2;
	}
	
	/**
	 * Metodo de tipo String que permite leer el archivo y lo guarda en una memoria 
	 * @return String
	 */
	public String leerArchivo() {
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader linea; 
		try {
			fis = new FileInputStream(f);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);
			
			if(f.exists()) {
				String linea_arch = linea.readLine();
				String archivo_total = linea_arch;
				while(linea_arch != null) {
					linea_arch = linea.readLine();
					if(linea_arch != null) {
						archivo_total = archivo_total + "\n" + linea_arch;
					}
				}
				linea.close();
				return archivo_total;
			}else {
				return "El archivo no existe";
			}
		}catch(IOException e) {
			return "No se pudo leer el archivo";
		}
	}
	
	
		
	
/**
 * Metodo que permite ingresar texto dentro de la memoria buffer	
 * @param frase linea de texto
 * @return String
 */
	public String escribirArchivo(String frase) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader linea = new BufferedReader(isr);
			FileWriter lineatx = new FileWriter(f);
			String linea_arch = frase;
			lineatx.write(linea_arch + "\r\n");
			lineatx.close();
			return "Linea ingresada con exito";
		}catch(IOException e) {
			return "No se pudo escribir en el archivo";
		} 
		
	}
	/**
	 * Metodo de tipo String que permite leer el archivo y lo guarda en una memoria 
	 * @return String
	 */
	public String leerArchivo2() {
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader linea; 
		try {
			fis = new FileInputStream(f2);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);
			
			if(f.exists()) {
				String linea_arch = linea.readLine();
				String archivo_total = linea_arch;
				while(linea_arch != null) {
					linea_arch = linea.readLine();
					if(linea_arch != null) {
						archivo_total = archivo_total + "\n" + linea_arch;
					}
				}
				linea.close();
				return archivo_total;
			}else {
				return "El archivo no existe";
			}
		}catch(IOException e) {
			return "No se pudo leer el archivo";
		}
	}
	
	/**
	 * Metodo que permite ingresar texto dentro de la memoria buffer	
	 * @param frase linea de texto
	 * @return String
	 */
		public String escribirArchivo2(String frase) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader linea = new BufferedReader(isr);
				FileWriter lineatx = new FileWriter(f2);
				String linea_arch = frase;
				lineatx.write(linea_arch + "\r\n");
				lineatx.close();
				return "Linea ingresada con exito";
			}catch(IOException e) {
				return "No se pudo escribir en el archivo";
			} 
			
		}

}
 
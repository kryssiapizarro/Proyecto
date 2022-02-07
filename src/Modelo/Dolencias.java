package Modelo;

import java.io.Serializable;

public class Dolencias implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String Tipo; 
	public String Descripcion;
	
	
	public Dolencias(String tipo, String descripcion) {
		super();
		
		this.Tipo=tipo;
		this.Descripcion = descripcion;
	}
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
}

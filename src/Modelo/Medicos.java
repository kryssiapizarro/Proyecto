
package Modelo;

import java.io.Serializable;

public class Medicos implements Serializable {
    private static final long serialVersionUID = 1L;
	public int CodMedico; 
	public String Nombre; 
	public String Apellido; 
	public String Estado;// para determinar si esta ocupado o disponible
	
	public Medicos() {
		
	}
	
	public Medicos(int cod, String nombre, String apellido) {
		this.CodMedico = cod; 
		this.Nombre = nombre; 
		this.Apellido = apellido; 
		this.Estado = "Disponible";//inicializamos el estado del médico 
	}
	
	public Medicos(int cod, String nombre, String apellido, String estado) {
		this.CodMedico = cod; 
		this.Nombre = nombre; 
		this.Apellido = apellido; 
		this.Estado = estado;
	}
//Getters and Setters
	public int getCodMedico() {
		return CodMedico;
	}

	public void setCodMedico(int codMedico) {
		CodMedico = codMedico;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "\t  MEDICO"
				+"\nEstado: "+Estado
				+ "\nCodMedico: " + CodMedico 
				+ "\nNombre: " + Nombre 
				+ "\nApellido: " + Apellido;
	}

    
}

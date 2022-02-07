
package Modelo;
import java.io.Serializable;

public class Mascotas implements Serializable {
private static final long serialVersionUID = 1L;  
public String Clasificacion; // variable para indicar el tipo de mascota
public String Nombre;
public String Raza; 
public String Dueño; 
public String Dolencia;
public int Edad; 
public int CodPaciente; 

    public Mascotas() {
    }

    public Mascotas(String Clasificacion, String Nombre, String Raza, String Dueño, int Edad, int CodPaciente) {
		this.Clasificacion = Clasificacion; 
		this.Nombre = Nombre;
		this.Raza = Raza;
		this.Dueño = Dueño; 
		this.Edad = Edad; 
		this.CodPaciente = CodPaciente;
	}
    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getDolencia() {
        return Dolencia;
    }

    public void setDolencia(String Dolencia) {
        this.Dolencia = Dolencia;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCodPaciente() {
        return CodPaciente;
    }

    public void setCodPaciente(int CodPaciente) {
        this.CodPaciente = CodPaciente;
    }

    @Override
    public String toString() {
        return "\t    Información del Paciente" + "\nClasificacion: " + Clasificacion + "\nNombre: " + Nombre + 
                "\nRaza: " + Raza + "\nDueño: " + Dueño +
                "\nDolencia: " + Dolencia + "\nEdad: " + Edad + "\nNúmero de paciente:" + CodPaciente;
    }
    
}

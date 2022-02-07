package Modelo;

import java.io.Serializable;

public class Hospital implements Serializable{

private static final long serialVersionUID = 5501236923483468806L;
public int codigo;
public Consultorios consultorio; 
public Receta receta;


public Hospital() {
	super();
}

public Hospital(int cod,Consultorios con, Receta rece) {
	this.codigo = cod;
	this.consultorio = con;
	this.receta = rece;
	
}

public int getCod() {
	return codigo;
}

public void setCod(int cod) {
	this.codigo = cod;
}

public Consultorios getConsultorio() {
	return consultorio;
}
public void setConsultorio(Consultorios consultorio) {
	this.consultorio = consultorio;
}
public Receta getReceta() {
	return receta;
}
public void setReceta(Receta receta) {
	this.receta = receta;
}

@Override
public String toString() {
	return "\tHospital ("+codigo+")"
                + "\nConsultorio: " + consultorio.toString()
		+ "\nReceta: " + receta.toString() + "\n";
}




}

package Modelo;

import java.io.Serializable;

public class NodoHospital implements Serializable{

    private static final long serialVersionUID = 1L;
    public Hospital dato;
    public NodoHospital adelante;
    public NodoHospital atras;

	public NodoHospital (Hospital entrada){

		dato= entrada;
		adelante = null;
		atras = null;

	}

	public NodoHospital getAdelante() {
		return adelante;
	}

	public void setAdelante(NodoHospital adelante) {
		this.adelante = adelante;
	}

	public NodoHospital getAtras() {
		return atras;
	}

	public void setAtras(NodoHospital atras) {
		this.atras = atras;	
	}

	public Hospital getDato() {
		return dato;
	}

	public void setDato(Hospital dato) {
		this.dato = dato;
	}

}


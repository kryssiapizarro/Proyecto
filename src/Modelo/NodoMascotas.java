/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;


public class NodoMascotas implements Serializable {
    
        private static final long serialVersionUID = 1L;
	private Mascotas dato;
	private NodoMascotas Siguiente;

	public NodoMascotas(Mascotas dato){
		this.dato=dato;
	}
	
	public Mascotas getDato() {
		return dato;
	}
	public void setDato(Mascotas dato) {
		this.dato = dato;
	}
	public NodoMascotas getNext() {
		return Siguiente;
	}
	public void setNext(NodoMascotas next) {
		this.Siguiente = next;
	}
}

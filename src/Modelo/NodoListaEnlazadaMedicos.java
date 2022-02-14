
package Modelo;

import java.io.Serializable;


public class NodoListaEnlazadaMedicos implements Serializable{


private static final long serialVersionUID = 1L;
public Medicos dato;
public NodoListaEnlazadaMedicos siguiente;
public NodoListaEnlazadaMedicos anterior;
	
  public NodoListaEnlazadaMedicos(Medicos dato) {
  
   this.dato = dato;
   this.siguiente = null;
	
  }
  
  public NodoListaEnlazadaMedicos() {  }

  public Medicos getDato() {
            return dato;
    }

  public void setDato(Medicos dato) {
            this.dato = dato;
    }

    public NodoListaEnlazadaMedicos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaEnlazadaMedicos siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaEnlazadaMedicos getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaEnlazadaMedicos anterior) {
        this.anterior = anterior;
    }

  
  
	 
}

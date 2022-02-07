
package Modelo;

import java.io.Serializable;


public class NodoListaEnlazadaMedicos implements Serializable{


private static final long serialVersionUID = 1L;
public Medicos dato;
public NodoListaEnlazadaMedicos Siguiente;
	
  public NodoListaEnlazadaMedicos(Medicos dato) {
  
   this.dato = dato;
   this.Siguiente = null;
	
  }
  
  public NodoListaEnlazadaMedicos() {  }

  public Medicos getDato() {
            return dato;
    }

  public void setDato(Medicos dato) {
            this.dato = dato;
    }

  public NodoListaEnlazadaMedicos getSiguiente() {
            return Siguiente;
    }

  public void setSiguiente(NodoListaEnlazadaMedicos siguiente) {
            Siguiente = siguiente;
    }
	 
}

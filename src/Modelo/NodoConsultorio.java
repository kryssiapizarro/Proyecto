
package Modelo;

import java.io.Serializable;

public class NodoConsultorio implements Serializable {

private static final long serialVersionUID = 1L;
public Consultorios dato;
public NodoConsultorio Siguiente; 

    public Consultorios getDato() {
        return dato;
    }

    public void setDato(Consultorios dato) {
        this.dato = dato;
    }

    public NodoConsultorio getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoConsultorio Siguiente) {
        this.Siguiente = Siguiente;
    }

}


package Modelo;

import java.io.Serializable;


public class NodoListaEspera implements Serializable {
    private static final long serialVersionUID = 1L;
    private Mascotas dato;
    public NodoListaEspera izq;
    public NodoListaEspera der;

    public Mascotas getDato() {
        return dato;
    }

    public void setDato(Mascotas dato) {
        this.dato = dato;
    }

    public NodoListaEspera getIzq() {
        return izq;
    }

    public void setIzq(NodoListaEspera izq) {
        this.izq = izq;
    }

    public NodoListaEspera getDer() {
        return der;
    }

    public void setDer(NodoListaEspera der) {
        this.der = der;
    }
    
}

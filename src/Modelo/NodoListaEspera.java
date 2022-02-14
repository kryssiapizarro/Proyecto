
package Modelo;

import java.io.Serializable;


public class NodoListaEspera implements Serializable {
    private static final long serialVersionUID = 1L;
    public Mascotas dato;
    public NodoListaEspera hijoIzquierdo, hijoDerecho;
    
    public NodoListaEspera(Mascotas dato){
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
    public Mascotas getDato() {
        return dato;
    }

    public void setDato(Mascotas dato) {
        this.dato = dato;
    }

    public NodoListaEspera getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoListaEspera hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoListaEspera getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoListaEspera hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    public void inOrden(NodoListaEspera r){
        if(r != null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
    
//    public NodoListaEspera izq;
//    public NodoListaEspera der;
//
//    public Mascotas getDato() {
//        return dato;
//    }
//
//    public void setDato(Mascotas dato) {
//        this.dato = dato;
//    }
//
//    public NodoListaEspera getIzq() {
//        return izq;
//    }
//
//    public void setIzq(NodoListaEspera izq) {
//        this.izq = izq;
//    }
//
//    public NodoListaEspera getDer() {
//        return der;
//    }
//
//    public void setDer(NodoListaEspera der) {
//        this.der = der;
//    }

    
}

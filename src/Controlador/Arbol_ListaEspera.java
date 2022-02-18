
package Controlador;

//esto es para poner los pacientes en lsta de espera si no hay ningun médico disponible

import Modelo.Mascotas;
import Modelo.NodoConsultorio;
import Modelo.NodoListaEspera;
import java.util.*;
import javax.swing.JOptionPane;

//apenas se desocupe un médico se le asigna el paciente de la lista de espera segpun el orden de llegada
public class Arbol_ListaEspera {
       public NodoListaEspera raiz;
       List listaDeEspera = new ArrayList<NodoListaEspera>();

    public Arbol_ListaEspera() {
        //raiz = null;
    }
    public boolean estaVacio(){
        return raiz == null;
    }
    
    public void agregarNodo(Mascotas mascota) {
        NodoListaEspera nuevo = new NodoListaEspera(mascota);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoListaEspera auxiliar = raiz;
            NodoListaEspera padre;
            while (true) {
                padre = auxiliar;
                if (mascota.getCodPaciente() < auxiliar.getDato().CodPaciente) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrden(NodoListaEspera r){
        if(r != null){
            inOrden(r.hijoIzquierdo);
            //System.out.println(r.dato.toString());
            listaDeEspera.add(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
    
    public Mascotas eliminar(NodoListaEspera auxiliar,NodoConsultorio nodo){
        //auxiliar = raiz;
        NodoListaEspera padre = auxiliar;
        Mascotas mascota = new Mascotas();
        boolean esHijoIzquierdo = true;
        while(auxiliar.getCodigoDelPaciente()!= nodo.getDato().getMascota().getCodPaciente()){
            padre = auxiliar;
            mascota = auxiliar.getDato();
            if(nodo.getDato().getMascota().getCodPaciente()<auxiliar.getDato().getCodPaciente()){
                esHijoIzquierdo = true;
                auxiliar = auxiliar.hijoIzquierdo;
                //mascota = auxiliar.getDato();
            }else{
                esHijoIzquierdo = false;
                auxiliar = auxiliar.hijoDerecho;
                //mascota = auxiliar.getDato();
            }
            if(auxiliar == null){
                JOptionPane.showMessageDialog(null, "No hay nada");
            }
        }//fin del while
        if(auxiliar.hijoIzquierdo == null && auxiliar.hijoDerecho == null){
            if(auxiliar == raiz){
                raiz = null;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = null;
            }else{
                padre.hijoDerecho = null;
            }
        }else if(auxiliar.hijoDerecho == null){
            if(auxiliar == raiz){
                raiz = auxiliar.hijoIzquierdo;
                mascota = raiz.getDato();
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = auxiliar.hijoIzquierdo;
                mascota = auxiliar.hijoIzquierdo.getDato();
            }else{
                padre.hijoDerecho = auxiliar.hijoIzquierdo;
                mascota = auxiliar.hijoIzquierdo.getDato();
            }
        }else if(auxiliar.hijoIzquierdo == null){
            if(auxiliar == raiz){
                raiz = auxiliar.hijoDerecho;
                mascota = raiz.getDato();
            }else if(esHijoIzquierdo){
                padre.hijoDerecho = auxiliar.hijoDerecho;
                mascota = padre.hijoIzquierdo.getDato();
            }else{
                padre.hijoIzquierdo = auxiliar.hijoDerecho;
                mascota = padre.hijoDerecho.getDato();
            }
        }else{
            NodoListaEspera reemplazo = obtenerNodoReemplazo(auxiliar);
            if(auxiliar == raiz){
                raiz = reemplazo;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = reemplazo;
            }else{
                padre.hijoDerecho = reemplazo;
            }
            reemplazo.hijoIzquierdo = auxiliar.hijoIzquierdo;
        }
        return mascota;
    }
    
    public NodoListaEspera obtenerNodoReemplazo(NodoListaEspera nodoReemplazo){
        NodoListaEspera reemplazarPadre = nodoReemplazo;
        NodoListaEspera reemplazo = nodoReemplazo;
        NodoListaEspera auxiliar = nodoReemplazo.hijoDerecho;
        while(auxiliar != null){
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIzquierdo;
        }
        if(reemplazo != nodoReemplazo.hijoDerecho){
            reemplazarPadre.hijoIzquierdo = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = nodoReemplazo.hijoDerecho;
        }
        System.out.println("El nodo reemplazo es: "+reemplazo);
        return reemplazo;
    }
//prueba repositorio

    @Override
    public String toString() {
        return "Lista De Espera \n" +
                "\n************************"+ Arrays.toString(listaDeEspera.toArray()).replace("[", "").replace("]", "").replace(",", "").replace("null", "Desconocido") + "\n"+
                "\n************************";
    }
    
}

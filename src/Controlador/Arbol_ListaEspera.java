
package Controlador;

//esto es para poner los pacientes en lsta de espera si no hay ningun médico disponible

import Modelo.Mascotas;
import Modelo.NodoListaEspera;
import java.util.*;

//apenas se desocupe un médico se le asigna el paciente de la lista de espera segpun el orden de llegada
public class Arbol_ListaEspera {
       public NodoListaEspera raiz;
       List listaDeEspera = new ArrayList<NodoListaEspera>();

    public Arbol_ListaEspera() {
        raiz = null;
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
    
    
//prueba repositorio

    @Override
    public String toString() {
        return "Lista De Espera \n\n" + Arrays.toString(listaDeEspera.toArray()).replace("[", "").replace("]", "").replace(",", "").replace("null", "Desconocido") + "\n";
    }
    
}


package Controlador;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

import Modelo.Medicos;
import Modelo.NodoListaEnlazadaMedicos;
        
public class ListaEnlazadaMedicos {
    public NodoListaEnlazadaMedicos Inicio;
    public NodoListaEnlazadaMedicos Fin;


    public ListaEnlazadaMedicos() {

	Inicio = null;
	Fin = null;
	}

	//---SI LA LISTA ESTA VACIA---
    public boolean ListaVacia() {
	if(Inicio == null) {

		return true;

            }else {
            return false;
            }
	}

	//---AGREGA AL INICIO---
    public void agregarAlInicio(Medicos valor){

	NodoListaEnlazadaMedicos nuevo = new NodoListaEnlazadaMedicos();
	nuevo.setDato(valor);

            if (ListaVacia()) {

                Inicio = nuevo;

                }else{

                    nuevo.setSiguiente(Inicio);
                    Inicio = nuevo;
		}
	}
	//---AGREGA AL FINAL---
    public void agregarAlFinal(Medicos valor){

	NodoListaEnlazadaMedicos nuevo = new NodoListaEnlazadaMedicos();
	nuevo.setDato(valor);

            if (ListaVacia()) {

                Inicio = nuevo;

		} else{
                    NodoListaEnlazadaMedicos aux = Inicio;

                    while(aux.getSiguiente() != null){
			aux = aux.getSiguiente();
		}

                    aux.setSiguiente(nuevo);
		}

	}

	//---BUSCA UN ELEMENO---
    public boolean buscar(int referencia) throws HeadlessException, Exception{

	NodoListaEnlazadaMedicos aux = Inicio;// nodo aux va a ser igual a lo que haya en el inicio
        boolean encontrado = false;
            //mientras NO sea nulo y la bandera sea false
            while(aux != null && encontrado != true){
                // si el codMedico es igual al codigo digitado
		if (referencia == aux.getDato().getCodMedico()){
                    encontrado = true;// cambia a verdadero el estado de la bandera
                    
                }else{//caso contratio sigue buscando el elemento

		aux = aux.getSiguiente();
		}
            }
            return encontrado;
	}
    public boolean Comprobacion(int elem) {
	NodoListaEnlazadaMedicos temp = Inicio;
	boolean encontrado = false;

            while (temp != null) {
		if (temp.getDato().getCodMedico() == elem)

			switch(temp.getDato().getEstado()) {

                            case "Ocupado":
                            encontrado =false;
                            break; 
                            case "Disponible":
                            encontrado = true;
                            break; 
				}

			temp = temp.getSiguiente();
		}

		return encontrado;
	}

	//---COMPRUEBA SI EL MEDICO ESTA OCUPADO O DISPONIBLE---
    public boolean ComprobacionDisponibilidad(int elem) {
	NodoListaEnlazadaMedicos temp = Inicio;
	boolean encontrado = false;
            
            while (temp != null) {
                //si el dato ingresado corresponde al medico a cosultar
		if (temp.getDato().getCodMedico() == elem)
                    
                    //hacemos un switch para cambiar el estado del medico
                    switch(temp.getDato().getEstado()) {

			case "Ocupado":
                            encontrado =false;
                            break; 
			case "Disponible":
                            encontrado = true;
                            break; 
			}

                    temp = temp.getSiguiente();
		}

            return encontrado;
	}

	//---BUSCAR UN ELEMENTO Y RECUPERA LA INFORMACION---
    public Medicos Cambio(int cod) throws HeadlessException, Exception {
	NodoListaEnlazadaMedicos aux = Inicio; 
	Medicos veterinarios=null; 
	boolean encontrado = false;

            while(aux != null && encontrado != true){
                //si el id ingresado corresponde al del medico
		if (cod == aux.getDato().getCodMedico()){
			
                    encontrado = true;//devuelve true y cambia el estado del médico
                    aux.getDato().setEstado("Ocupado");
                    veterinarios = aux.getDato();

		}else{

                    aux = aux.getSiguiente();
		}
            }
        return veterinarios; 
	}

	//---CONOCER LA POSICION DE UN ELEMENTO---
    public int getPosicion(int referencia) throws Exception{

	if (buscar(referencia)) {

            NodoListaEnlazadaMedicos aux = Inicio;
		int cont = 0;
                    while(referencia != aux.getDato().getCodMedico()){

                        cont ++;
			aux = aux.getSiguiente();
                    }

		return cont;

            } else {
                throw new Exception("Valor inexistente en la lista.");
	}
}

	//---MUESTRA TODO---
    public ListaEnlazadaMedicos MostarTodo() {

	NodoListaEnlazadaMedicos Actual = Inicio;

            if(Actual == null) {

            JOptionPane.showMessageDialog(null, "La lista aún no posee elementos");

            }else {
		while(Actual != null) {
                    
                   Actual = Actual.Siguiente;
		}
             }

            return this;
	}

    public String MostrarMedicos() {
	String a = "";
	NodoListaEnlazadaMedicos Actual = Inicio;

            if(Actual == null) {
		a="La lista no contiene datos";
            }else {
		while(Actual != null) {

                    a += "Doc:"+Actual.getDato().getNombre()+", cod("+Actual.dato.getCodMedico()+")\t Estado:("+Actual.getDato().getEstado()+
                            ")\n-----------------------------------------------------------"+"\n";
                    Actual = Actual.Siguiente;
		}
	}

	return a;
       }
}

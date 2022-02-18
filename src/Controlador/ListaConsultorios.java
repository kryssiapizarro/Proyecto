
package Controlador;

import Modelo.Consultorios;
import Modelo.NodoConsultorio;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListaConsultorios {
    
    public NodoConsultorio Inicio;
    public NodoConsultorio Fin;
    int cont;

	public ListaConsultorios() {

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
	public void agregarAlInicio(Consultorios valor){

		NodoConsultorio nuevo = new NodoConsultorio();
		nuevo.setDato(valor);
	
		if (ListaVacia()) {

			Inicio = nuevo;

		}else{

			nuevo.setSiguiente(Inicio);
			Inicio = nuevo;
                        cont++;
		}
	}
        public int TamanioFila() {
		return cont;
	}

	//---AGREGA AL FINAL---
	public void agregarAlFinal(Consultorios valor){

		NodoConsultorio nuevo = new NodoConsultorio();
		nuevo.setDato(valor);

		if (ListaVacia()) {

                    Inicio = nuevo;

		} else{

                    NodoConsultorio aux = Inicio;

                        while(aux.getSiguiente() != null){
                            aux = aux.getSiguiente();
			}

			aux.setSiguiente(nuevo);
		}

	}

	//---BUSCA UN ELEMENO---
	public boolean buscar(int referencia) throws HeadlessException, Exception{

		NodoConsultorio aux = Inicio;
		boolean encontrado = false;
                
		while(aux != null && encontrado != true){
                    if (referencia == aux.getDato().Numerocon){

			encontrado = true;
                        
			}else{

                        aux = aux.getSiguiente();
		}
            }
            return encontrado;
	}
        


	//---BUSCAMOS UN ELEMENTO Y RECUPERAMOS EL ELEMENTO---
	public Consultorios Cambio(int cod) throws HeadlessException, Exception {
		NodoConsultorio aux = Inicio; 
		Consultorios consultorio_medico=null; 
		boolean encontrado = false;

                    while(aux != null && encontrado != true){
			if (cod == aux.getDato().getNumerocon()){
				
                            encontrado = true;
                            aux.getDato().setEstado("Disponible");
                            aux.getDato().getMedico().setEstado("Disponible");
                            consultorio_medico = aux.getDato();
			
			}else{

                            aux = aux.getSiguiente();
                    }
		}
		removerPorReferencia(cod);
		return consultorio_medico; 
	}

	//---BUSCAMOS UN ELEMENTO Y RECUPERAMOS EL ELEMENTO---
	public void Cambio2(int cod, Consultorios con) throws HeadlessException, Exception {
		NodoConsultorio aux = Inicio; 
		Consultorios consultoriomedico=null; 
		boolean encontrado = false;

                    while(aux != null && encontrado != true){
			if (cod == aux.getDato().getNumerocon()){
					
                            encontrado = true;
                            aux.setDato(con);
					
			}else{

			aux = aux.getSiguiente();
                    }
		}
			
	}
	//---CONOCER LA POSICION DE UN ELEMENTO---
	public int getPosicion(int referencia) throws Exception{

            if (buscar(referencia)) {

		NodoConsultorio aux = Inicio;
                int cont = 0;

                    while(referencia != aux.getDato().getNumerocon()){
                        cont ++;
                        aux = aux.getSiguiente();
                    }

                    return cont;
            } else {
		throw new Exception("Valor inexistente en la lista.");
            }
	}
	//---MUESTRA TODO---
	public String MostarTodo() {
		String a = "";
		NodoConsultorio Actual = Inicio;

                    if(Actual == null) {

                        JOptionPane.showMessageDialog(null, "La lista aún no posee elementos");
                    }else {
			while(Actual != null) {
			
                            a += "Consultorio ("+Actual.dato.getNumerocon()+")-->"+Actual.getDato().getEstado()+"\n";
                            Actual = Actual.Siguiente;
			}
		}

            return a;
	}
        
        //MUESTRA SOLAMENTE LOS OCUPADOS
        	public String mostrarOcupados() {
		String a = "";
		NodoConsultorio Actual = Inicio;

                    if(Actual == null) {

                        JOptionPane.showMessageDialog(null, "La lista aún no posee elementos");
                    }else {
			while(Actual != null) {
                            if(Actual.getDato().getEstado() == "Ocupado"){
                            a += "Consultorio ("+Actual.dato.getNumerocon()+")-->"+Actual.getDato().getEstado()+"\n";
                            Actual = Actual.Siguiente;
                            }else{
                                Actual = Actual.Siguiente;
                            }
			}
		}

            return a;
	}


	public String MuestraConsultorios() {
		String a = "";
		NodoConsultorio Actual = Inicio;

                    if(Actual == null) {
			a="La lista no contiene datos";
                        
                    }else {
			while(Actual != null) {

                            a += Actual.dato.toString();
                            Actual = Actual.Siguiente;
                    }
		}
                    return a;
	}
        
        public String MuestraDictamen() {
		String a = "";
		NodoConsultorio Actual = Inicio;

                    if(Actual == null) {
			a="La lista no contiene datos";
                        
                    }else {
			while(Actual != null) {

                            a += Actual.dato.MuestraDictamen();
                            Actual = Actual.Siguiente;
                    }
		}
                    return a;
	}
	
	public void removerPorReferencia(int referencia) throws HeadlessException, Exception{
		
        // Consulta si el valor de referencia existe en la lista.
                if (buscar(referencia)) {
                    // Consulta si el nodo a eliminar es el pirmero
                    if (Inicio.getDato().getNumerocon() == referencia) {
                        // El primer nodo apunta al siguiente.
                        Inicio = Inicio.getSiguiente();

                    } else{
                        // Crea una copia de la lista.
                        NodoConsultorio aux = Inicio;
                        // Recorre la lista hasta llegar al nodo anterior al de referencia.
                        while(aux.getSiguiente().getDato().getNumerocon() != referencia){
                            aux = aux.getSiguiente();
                       }
                        // Guarda el nodo siguiente del nodo a eliminar.
                        NodoConsultorio siguiente = aux.getSiguiente().getSiguiente();
                        // Enlaza el nodo anterior al de eliminar con el sguiente despues de el.
                        aux.setSiguiente(siguiente);  
                    }
                    // Disminuye el contador de tamaño de la lista.
        //            tamanio--;
                }
                 Consultorios consul1 = new Consultorios(referencia, "Disponible", null, null);
                  agregarAlFinal(consul1);
            }
        
    public ListaConsultorios ListaOcupados(){
            ListaConsultorios ocupados= new ListaConsultorios();
            NodoConsultorio temp = Inicio;
                while (temp != null) {
                  if (temp.getDato().getEstado().equals("Ocupado")){
                      ocupados.agregarAlInicio(temp.dato);
                  }  
                  temp= temp.Siguiente;
                }
                return ocupados;
        }
        public Consultorios DesocuparConsultorio(){
            
           Consultorios ocupado = Inicio.dato;
           if(Inicio==Fin){
             JOptionPane.showMessageDialog(null, "Todos los consultorios se encuentran disponible.No hay consultorios para desocupar");
             
           }else{
               Inicio= Inicio.getSiguiente();
           }
            return ocupado;
            
        }
        
	public boolean Comprobar(int elem) {
		NodoConsultorio temp = Inicio;
		boolean encontrado = false;
                //el elemento temp no sea nulo
                    while (temp != null) {
                        // si el cod del nodo temp  es igual a el elemento ingresado
			if (temp.getDato().getNumerocon() == elem)
                            //cambia el estado
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
        

}

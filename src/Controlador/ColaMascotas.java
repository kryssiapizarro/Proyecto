
package Controlador;

import Modelo.Mascotas;
import Modelo.NodoMascotas;

public class ColaMascotas {
    	public NodoMascotas Inicio;
	public NodoMascotas Fin;
	int cont;

	public ColaMascotas(){
		Inicio=null;
		Fin=null;
	}

	public void insertar(Mascotas dato){
            NodoMascotas nuevamascota=new NodoMascotas(dato);
            nuevamascota.setNext(null);

                 if(Inicio==null && Fin==null){

                     Inicio=nuevamascota;
                     Fin=nuevamascota;
                     cont++;
                 }else {
                     Fin.setNext(nuevamascota);
                     Fin=Fin.getNext();
                     cont++;
                    }
	}

	public Mascotas extraer(){
		Mascotas dato=Inicio.getDato();
		Inicio=Inicio.getNext();
		cont--;
		return dato;
	}

	public boolean estaVacia(){
		boolean cola=false;
		
                    if(Inicio==null & Fin==null){

                            cola=true;
                            System.out.println("La cola esta vacia");

                    }else{
                            System.out.println("La cola contiene elementos");
                            cola=false;
                    }
                    return cola;
	}

	public int contar(){
		int contador=0;
		NodoMascotas c=this.Inicio;
		
		while(c!=null){
			contador++;
			c=c.getNext();
		}
		//System.out.println("Numero de datos en la cola: "+contador);
		return contador;
	}
	
	public int TamanioFila() {
		return cont;
	}
       /* public int generarCod(){
             String s = "";
             int codigo=0;
             
                for (int i = 1; i <= 16; i++) {
                    codigo = (int) (Math.random() * 20);
         
                 if (codigo % 2 == 0 && i != 16) {
                   s = s + "-";
            }
                }     return codigo;
            
        }*/
	
	public String imprimir() {
	        NodoMascotas reco=Inicio;
	        String a = "";
	        //System.out.println("Listado de todos los elementos de la cola.");
	        while (reco!=null) {
	            a += "\n"
                            //+reco.getDato().getCodPaciente()
                             +"Paciente: "+reco.getDato().getNombre()
                             +"\nClasificación: "+reco.getDato().getClasificacion()+
                            "\n*******************************\n";
	            reco=reco.getNext();
	        }
	        return a;
	    }
}

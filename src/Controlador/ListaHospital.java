
package Controlador;

import Modelo.Hospital;
import Modelo.NodoHospital;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class ListaHospital {
        public NodoHospital Adelante;
	public NodoHospital Atras;
	public NodoHospital inicio;
	public NodoHospital fin;
        
        
        public ListaHospital() {
		Adelante = null;
		Atras = null;
		inicio = null;
		
	}

	//---Para Buscar Un dato---
	public void buscar(Integer valor){
            Hospital a= null;
                if (inicio != null){
                    NodoHospital aux = inicio;
                    int cont = 0;
                       while (aux != null){
                           if (aux.getDato().getCod() == valor ){
                               cont++;
                               a =  aux.getDato();
                               JOptionPane.showMessageDialog(null, a);
                           }
                              aux = aux.atras;
                       }  
                        }else {
                            JOptionPane.showMessageDialog(null, "No hay nada");
                            }
                    }

	//--- Para insertar al final de la lista----
	public void insertarFinal(Hospital d){
            NodoHospital nuevo = new NodoHospital(d);

                    if(inicio == null){
			inicio = nuevo;

                    }else{
			NodoHospital aux = inicio;

			while(aux.getAtras() != null){
				aux = aux.getAtras();

			}

			aux.setAtras(nuevo);
			nuevo.setAdelante(aux);
			
		}

	}

	//---Para insertar al inicio de la lista---
	public void insertarInicio(Hospital d){

            NodoHospital nuevo = new NodoHospital(d);

		if(inicio==null){

			inicio=nuevo;
			fin = nuevo;

		}else{

			nuevo.setAtras(inicio);
			inicio.setAdelante(nuevo);
			inicio=nuevo;

		}
	}

	//----Muestra los datos de la lista----
	public String Mostrar() {
		String a= "";

		if(inicio != null) {

			NodoHospital aux = inicio;

			int cont =0;

			while(aux != null) {

				cont++;

				a += aux.dato.toString();
				aux = aux.atras;
			}

//			JOptionPane.showMessageDialog(null, a);
		}else {

			JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA MOSTRAR");
		}
		
		return a;

	}

	//----Elimina datos de la lista-----
	public void eliminaValor(Integer valor){
		
		if (inicio != null){
		
			NodoHospital aux = inicio;
			NodoHospital ant = null;
			
			while (aux != null){
			
				if (aux.getDato().getCod() == valor ){
				
					if (ant == null){
						inicio = inicio.getAtras();
						aux.setAtras(null);
						aux= inicio;

					}else {
						ant.setAtras(aux.getAtras());
						aux.setAtras(null);
						aux = ant.getAtras();
					}                                             
				JOptionPane.showMessageDialog(null, "Eliminacion correcta, el dato es "+valor);
				}else{
					ant = aux;
					aux = aux.getAtras();
					
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "Lista Vacia");
		}

	}
	//Para los datos
	public void escritura() {
		JFileChooser Chooser = new JFileChooser();
		Chooser.showSaveDialog(Chooser);
		File f = Chooser.getSelectedFile();
		FileOutputStream fos;
		NodoHospital aux = inicio;

		try {
			
			fos = new FileOutputStream(f);
			ObjectOutputStream oss;
			oss = new ObjectOutputStream(fos);
			
			while(aux != null) {
				oss.writeObject(aux.getDato());
				aux = aux.getAdelante();
			}

			oss.close();
			JOptionPane.showMessageDialog(null, "Se guardó correctamente");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

	public void lectura() {

		ObjectInputStream ois = null;
		JFileChooser Chooser = new JFileChooser();
		Chooser.showOpenDialog(Chooser);
		NodoHospital aux = inicio;

		try {
			File f = Chooser.getSelectedFile();
			FileInputStream fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);

			while(true) {

				Hospital e = (Hospital) ois.readObject();
				insertarInicio(e);
			}

		}catch(IOException | ClassNotFoundException io){

			io.getMessage();

		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}

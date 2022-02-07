
package Modelo;

import java.io.Serializable;

public class Consultorios implements Serializable{

	private static final long serialVersionUID = 1L;
	public int Numerocon; 
	public String Estado; 
	public Mascotas mascota; 
	public Medicos medico;
        public Receta receta;

	public Consultorios() {

	}

	public Consultorios(int numeconsultorio, String estado, Mascotas mascota, Medicos medico, Receta receta) {
		this.Numerocon = numeconsultorio;
		this.Estado = estado;
		this.mascota = mascota;
		this.medico = medico;
                this.receta = receta;
	}

	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Mascotas getMascota() {
		return mascota;
	}
	public void setMascota(Mascotas mascota) {
		this.mascota = mascota;
	}
	public Medicos getMedico() {
		return medico;
	}
	public void setMedico(Medicos medico) {
		this.medico = medico;
	}

	public int getNumerocon() {
		return Numerocon;
	}

	public void setNumerocon(int numerocon) {
		Numerocon = numerocon;
	}

        public Receta getReceta() {
            return receta;
        }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }


	@Override
	public String toString() {
		return "\n"
                        + "\t   CONSULTORIO (" + getNumerocon() + ")"
				+ "\nEstado: " + getEstado()
				+"\n\n" 
				+ getMascota()
				+ "\n\n"
				+ getMedico()+"\n_________________________________\n";
	}
        
        public String MuestraDictamen() {
		return "\n________________________________________\n"
                        + "\t  DICTAMEN MÉDICO\n"
                        +getMascota().getNombre()+"fue diagnósticado con: "+ getMascota().getDolencia()
                        + "\nRecibió atención médica en el consultorio #:" + getNumerocon()
			+"\nMédico encargado de la revisión: " + getMedico().getNombre()
//			+ "\nSe le recetó:"+ getReceta().getNombre_Medicamento() +
   //                     "\nCódigo del medicamento:"+ getReceta().getCodigoMeidcamento()
			+"\n________________________________________\n"+
                          "\n*******************************************\n";
	}

    
}

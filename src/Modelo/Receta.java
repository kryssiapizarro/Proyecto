package Modelo;

import java.io.Serializable;

public class Receta implements Serializable{

	private static final long serialVersionUID = 1L;
	public int Num_medicamentos;
	public String Nombre_Medicamento; 
	public int Dosis;
	public int Cantidad = (int) (Math.random() * 3+1);
        public int CodigoMeidcamento;

        public int getNum_medicamentos() {
            return Num_medicamentos;
        }

        public void setNum_medicamentos(int Num_medicamentos) {
            this.Num_medicamentos = Num_medicamentos;
        }

        public int getCantidad() {
            return Cantidad;
        }

        public void setCantidad(int Cantidad) {
            this.Cantidad = Cantidad;
        }

        public int getCodigoMeidcamento() {
            return CodigoMeidcamento;
        }

        public void setCodigoMeidcamento(int CodigoMeidcamento) {
            this.CodigoMeidcamento = CodigoMeidcamento;
        }


	public Receta(int n_medicamento, String nombre, int dosis, int cantidad) {
		this.Nombre_Medicamento = nombre;
		this.Dosis = dosis; 
	}

	public String getNombre_Medicamento() {
		return Nombre_Medicamento;
	}

	public void setNombre_Medicamento(String nombre) {
		Nombre_Medicamento = nombre;
	}

	public int getDosis() {
		return Dosis;
	}

	public void setDosis(int dosis) {
		Dosis = dosis;
	}

	@Override
	public String toString() {
		return "Receta Medica"
				+ "\nN° Medicamento: (" + Num_medicamentos + ")"
				+ "\nNombre del medicamento: " + Nombre_Medicamento 
				+ "\nDosis: " + Dosis +"ML"
				+ "\nCantidad: "+ Cantidad + " veces al dia\n";
	}

}


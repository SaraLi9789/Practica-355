package Asignatura;

public class Asignatura {

	private String nombre;
	private double nota;
	
	
	public Asignatura(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String Aprobacion() {
		if (nota >=5) 
			return "Aprobado";
			else return "Suspenso";	
	}
	
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + ", aprobadosuspenso()=" + Aprobacion() + "]";
	}

}

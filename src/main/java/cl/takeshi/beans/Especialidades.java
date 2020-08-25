package cl.takeshi.beans;

public class Especialidades {

	private int idespecialidad;
	private String descripcion;


	public Especialidades(int idespecialidad, String descripcion) {
		super();
		this.idespecialidad = idespecialidad;
		this.descripcion = descripcion;
	}


	public int getIdespecialidad() {
		return idespecialidad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setIdespecialidad(int idespecialidad) {
		this.idespecialidad = idespecialidad;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}

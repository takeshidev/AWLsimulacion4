package cl.takeshi.beans;

public class Doctores {

	
	private int iddoctor;
	private String rutdoctor;
	private String nombred;
	private String apellidod;
	private int idespecialidad;


	public Doctores(int iddoctor, String rutdoctor, String nombred, String apellidod, int idespecialidad) {
		super();
		this.iddoctor = iddoctor;
		this.rutdoctor = rutdoctor;
		this.nombred = nombred;
		this.apellidod = apellidod;
		this.idespecialidad = idespecialidad;
	}


	public int getIddoctor() {
		return iddoctor;
	}


	public String getRutdoctor() {
		return rutdoctor;
	}


	public String getNombred() {
		return nombred;
	}


	public String getApellidod() {
		return apellidod;
	}


	public int getIdespecialidad() {
		return idespecialidad;
	}


	public void setIddoctor(int iddoctor) {
		this.iddoctor = iddoctor;
	}


	public void setRutdoctor(String rutdoctor) {
		this.rutdoctor = rutdoctor;
	}


	public void setNombred(String nombred) {
		this.nombred = nombred;
	}


	public void setApellidod(String apellidod) {
		this.apellidod = apellidod;
	}


	public void setIdespecialidad(int idespecialidad) {
		this.idespecialidad = idespecialidad;
	}
	
	
	
}

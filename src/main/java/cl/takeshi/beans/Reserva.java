package cl.takeshi.beans;

import java.util.Date;

public class Reserva {
	
	private int idpaciente;
	private int iddoctor;
	private int idagenda;
	private Date fecha;
	private Date horadesde;
	private int duracion = 15;
	private String rutpaciente;
	private String nombre;
	private String apellido;
	private String rutdoctor;
	private String nombred;
	private String apellidod;
	private String descripcion;

	
	public Reserva(int idpaciente, int iddoctor, int idagenda, Date fecha, Date horadesde, int duracion,
			String rutpaciente, String nombre, String apellido, String rutdoctor, String nombred, String apellidod,
			String descripcion) {
		super();
		this.idpaciente = idpaciente;
		this.iddoctor = iddoctor;
		this.idagenda = idagenda;
		this.fecha = fecha;
		this.horadesde = horadesde;
		this.duracion = duracion;
		this.rutpaciente = rutpaciente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rutdoctor = rutdoctor;
		this.nombred = nombred;
		this.apellidod = apellidod;
		this.descripcion = descripcion;
	}


	public int getIdpaciente() {
		return idpaciente;
	}


	public int getIddoctor() {
		return iddoctor;
	}


	public int getIdagenda() {
		return idagenda;
	}


	public Date getFecha() {
		return fecha;
	}


	public Date getHoradesde() {
		return horadesde;
	}


	public int getDuracion() {
		return duracion;
	}


	public String getRutpaciente() {
		return rutpaciente;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
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


	public String getDescripcion() {
		return descripcion;
	}


	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}


	public void setIddoctor(int iddoctor) {
		this.iddoctor = iddoctor;
	}


	public void setIdagenda(int idagenda) {
		this.idagenda = idagenda;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public void setHoradesde(Date horadesde) {
		this.horadesde = horadesde;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public void setRutpaciente(String rutpaciente) {
		this.rutpaciente = rutpaciente;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
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


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
	

}

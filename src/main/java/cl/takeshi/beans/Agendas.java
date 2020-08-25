package cl.takeshi.beans;

import java.sql.Timestamp;
import java.util.Date;

public class Agendas {

	private int idpaciente;
	private int iddoctor;
	private int idagenda;
	private Date fecha;
	private Timestamp horadesde;
	private int duracion = 15;


	public Agendas(int idpaciente, int iddoctor, int idagenda, Date fecha, Timestamp horadesde, int duracion) {
		super();
		this.idpaciente = idpaciente;
		this.iddoctor = iddoctor;
		this.idagenda = idagenda;
		this.fecha = fecha;
		this.horadesde = horadesde;
		this.duracion = duracion;
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


	public Timestamp getHoradesde() {
		return horadesde;
	}


	public int getDuracion() {
		return duracion;
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


	public void setHoradesde(Timestamp horadesde) {
		this.horadesde = horadesde;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
}

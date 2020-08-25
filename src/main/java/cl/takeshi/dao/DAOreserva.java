package cl.takeshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.beans.Reserva;

public class DAOreserva {

	private String SQL_RESERVA = "SELECT agendas.idpaciente, agendas.iddoctor, agendas.idagenda, agendas.fecha, agendas.horadesde, agendas.duracion, pacientes.rutpaciente, pacientes.nombre, pacientes.apellido, doctores.rutdoctor, doctores.nombre  AS NOMBREd, doctores.apellido AS APELLIDOd, especialidades.descripcion FROM agendas INNER JOIN pacientes ON pacientes.idpaciente = agendas.idpaciente INNER JOIN doctores ON agendas.iddoctor = doctores.iddoctor INNER JOIN especialidades ON especialidades.idespecialidad = doctores.idespecialidad ORDER BY agendas.idagenda";
	private String DETALLE = "SELECT agendas.idpaciente, agendas.iddoctor, agendas.idagenda, agendas.fecha, agendas.horadesde, agendas.duracion, pacientes.rutpaciente, pacientes.nombre, pacientes.apellido, doctores.rutdoctor, doctores.nombre  AS NOMBREd, doctores.apellido AS APELLIDOd, especialidades.descripcion FROM agendas INNER JOIN pacientes ON pacientes.idpaciente = agendas.idpaciente INNER JOIN doctores ON agendas.iddoctor = doctores.iddoctor INNER JOIN especialidades ON especialidades.idespecialidad = doctores.idespecialidad where idagenda =";
	private String DETALLEB = " ORDER BY agendas.idagenda";
	private String where = "";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public List<Reserva> listareservas(){
		return template.query(SQL_RESERVA, new ReservaMapper());
	}
	public List<Reserva> detalle(int id){
		return template.query(DETALLE+id+DETALLEB, new ReservaMapper());
	}
	
	
		
	public class ReservaMapper implements RowMapper<Reserva>{
		public Reserva mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Reserva(
					rs.getInt("idpaciente"),
					rs.getInt("iddoctor"),
					rs.getInt("idagenda"),
					rs.getDate("fecha"),
					rs.getTimestamp("horadesde"),
					rs.getInt("duracion"),
					rs.getString("rutpaciente"),
					rs.getString("nombre"),
					rs.getString("apellido"),
					rs.getString("rutdoctor"),
					rs.getString("nombred"),
					rs.getString("apellidod"),
					rs.getString("descripcion")
					);
		}
	}
}

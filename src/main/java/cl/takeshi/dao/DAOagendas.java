package cl.takeshi.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAOagendas {
	private String SQL_RESERVA = "SELECT agendas.idpaciente, agendas.iddoctor, agendas.idagenda, agendas.fecha, agendas.horadesde, agendas.duracion, pacientes.rutpaciente, pacientes.nombre, pacientes.apellido, doctores.rutdoctor, doctores.nombr  AS NOMBREd, doctores.apellido AS APELLIDOd, especialidades.descripcion FROM agendas INNER JOIN pacientes ON pacientes.idpaciente = agendas.idpaciente INNER JOIN doctores ON agendas.iddoctor = doctores.iddoctor INNER JOIN especialidades ON especialidades.idespecialidad = doctores.idespecialidad ORDER BY agendas.idagenda";
	private String where = "";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
}

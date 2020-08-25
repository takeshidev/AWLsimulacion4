package cl.takeshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.beans.Doctores;


public class DAOdoctores {

	
	private String SQL_DOCTORES ="SELECT doctores.iddoctor, doctores.rutdoctor, doctores.nombre, doctores.apellido, doctores.idespecialidad FROM doctores";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Doctores> listadoctores(){
		return template.query(SQL_DOCTORES, new DoctoresMapper());
	}
	
	
	
	public class DoctoresMapper implements RowMapper<Doctores>{
		public Doctores mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Doctores(
					rs.getInt("iddoctor"),
					rs.getString("rutdoctor"),
					rs.getString("nombre"),
					rs.getString("apellido"),
					rs.getInt("idespecialdiad")
					
					
					);
		}
	}
	
	
}

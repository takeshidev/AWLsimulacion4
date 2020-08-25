package cl.takeshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.beans.Especialidades;

public class DAOespecialidades {

	private String SQL_ESPECIALIDADES = "SELECT idespecialidad, descripcion FROM especialidades";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Especialidades> listaespecialidades(){
		return template.query(SQL_ESPECIALIDADES, new EspecialidadMapper());
	}
	
	
	public class EspecialidadMapper implements RowMapper<Especialidades>{
		public Especialidades mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Especialidades(
					rs.getInt("idespecialidad"),
					rs.getString("descripcion")
					);
		}
	}
}

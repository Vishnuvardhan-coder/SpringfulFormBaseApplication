package info.inetsolv.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import info.inetsolv.formobject.Employee;
@Repository
public class Employeedao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int Storedetailsemp(Employee e){
		String sql="insert into employee values(?,?,?)";
		int i = jdbcTemplate.update(sql,e.getEno(),e.getName(),e.getSalary());
		return i;
	}

}

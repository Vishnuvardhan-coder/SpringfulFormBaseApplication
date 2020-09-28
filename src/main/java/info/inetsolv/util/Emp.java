package info.inetsolv.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class Emp 
{
@Bean	
public JdbcTemplate display(){

	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	dataSource.setUsername("vishnu");
	dataSource.setPassword("vishnu");
	JdbcTemplate jdbctemplate = new JdbcTemplate(dataSource);
	return jdbctemplate;

}
}
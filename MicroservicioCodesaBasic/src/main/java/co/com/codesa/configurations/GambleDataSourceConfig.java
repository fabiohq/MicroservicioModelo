package co.com.codesa.configurations;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Clase encargada de obtener un Datasource configurado application.yml
 * y generar su respectivo JdbcTemplate y crear su respectivo Bean
 * para poder inyectarlo en los Bean que se necesite el DataSource
 * o el JdbcTemplae
 * @author Giancarlo 02/05/2017
 * @modificacion 18/05/2017
 * @author Giancarlo
 * Se realiza cambio para utilizar el pool de conexion HikaryCP y no utilizar
 * el por defecto de SpringBoot del tomcat
 * **/
@Configuration
@ConfigurationProperties(prefix = "gamble.datasource")
@Service
public class GambleDataSourceConfig extends HikariConfig{
		
	@Bean(name = "gambleDataSource")
	public DataSource gambleDataSource() {
		return new HikariDataSource(this);
	}

	@Bean(name = "gambleJdbcTemplate")
	public JdbcTemplate gambleJdbcTemplate(DataSource gambleDataSource){
		return new JdbcTemplate(gambleDataSource);
	}

}

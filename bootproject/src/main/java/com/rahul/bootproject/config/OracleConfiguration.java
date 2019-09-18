package com.rahul.bootproject.config;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import oracle.jdbc.pool.OracleDataSource;

@Validated
@Configuration
@ConfigurationProperties("spring.datasource")
public class OracleConfiguration {

	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String url;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Bean
	DataSource dataSource() throws SQLException {
		System.out.println("######### "+this.url);
		System.out.println("######### "+url);
		
		OracleDataSource dataSource= new OracleDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setURL(url);
		dataSource.setImplicitCachingEnabled(true);
		dataSource.setFastConnectionFailoverEnabled(true);
		return dataSource;		
	}
}

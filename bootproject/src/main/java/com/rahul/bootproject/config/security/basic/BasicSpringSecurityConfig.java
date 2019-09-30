/**
 * 
 */
package com.rahul.bootproject.config.security.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.rahul.bootproject.config.security.basic.Authenticate.UserAuthenticator;

/**
 * @author rahul.s.shukla
 *
 */

@Configuration
@EnableWebSecurity
public class BasicSpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyAuthenticationEntryPoint authEntryPoint;

	@Autowired
	private UserAuthenticator authenticator;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic()
				.authenticationEntryPoint(authEntryPoint);
		
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(authenticator);
	}

	
	// This is plain password encryptor no need
	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

	/*
	 * In-Mewmory authentication
	 * 
	 * @Bean public UserDetailsService userDetailsService() {
	 * 
	 * User.UserBuilder users = User.withDefaultPasswordEncoder();
	 * InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	 * manager.createUser(users.username("user").password("password").roles("USER").
	 * build());
	 * manager.createUser(users.username("admin").password("password").roles("USER",
	 * "ADMIN").build()); return manager;
	 * 
	 * }
	 */
}

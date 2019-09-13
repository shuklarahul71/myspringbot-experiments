/**
 * 
 */
package com.rahul.bootproject.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rahul.bootproject.um.rest.UserRestImpl;

/**
 * @author rahul.s.shukla
 *
 */

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(UserRestImpl.class);
		System.out.println("Rest Registration done");
	}
}

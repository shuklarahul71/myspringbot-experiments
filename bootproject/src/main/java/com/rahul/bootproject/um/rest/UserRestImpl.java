/**
 * 
 */
package com.rahul.bootproject.um.rest;

import javax.validation.constraints.NotEmpty;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rahul.bootproject.um.service.UserService;
import com.rahul.bootproject.util.constant.BootConstant;

/**
 * @author rahul.s.shukla
 *
 */

@Component
@Consumes("application/json")
@Path("/user")
public class UserRestImpl {
	
	 Logger log = LoggerFactory.getLogger(UserRestImpl.class);
	 
	 @Autowired
	 UserService userService;
	 
	 @GET
	 @Path("/getUserbyId")
	 public String getUserbyId(@NotEmpty @QueryParam("id") String userId) {
		 return userService.getUserById(userId);
	 }
	
	 @GET
	 @Path("/getGreetingMessage")
	 public String getGreetingMessage() {
		 return BootConstant.GREETING_MESSAGE;
	 }
}

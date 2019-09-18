/**
 * 
 */
package com.rahul.bootproject.um.rest;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

import com.rahul.bootproject.um.model.User;
import com.rahul.bootproject.um.service.UserService;
import com.rahul.bootproject.util.constant.BootConstant;

/**
 * @author rahul.s.shukla
 *
 */

@Component
@Consumes("application/json")
@Produces("application/json")
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
	 
	 
	 @POST
	 @Path("/createUser")
	 @Consumes("application/json")
	 public String createUser(User user) {
		 System.out.println("User "+user);
		 return userService.createUser(user);
	 }
	 
	 
	 @GET
	 @Path("/getAllUser")
	 public List getAllUser() {
		 return userService.getAllUser();
	 }
}

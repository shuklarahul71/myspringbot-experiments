/**
 * 
 */
package com.rahul.bootproject.um.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rahul.bootproject.um.service.UserService;
import com.rahul.bootproject.util.constant.BootConstant;

/**
 * @author rahul.s.shukla
 *
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public String getUserById(String userid) {
		 System.out.println("Values those are pass by user:: "+userid);
		 log.info("Input parameters is {}",userid);
		 return BootConstant.SUCCESS_RESPONSE;
	}
	
	
	
}

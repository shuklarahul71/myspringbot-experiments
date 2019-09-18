/**
 * 
 */
package com.rahul.bootproject.um.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.bootproject.um.dao.UserRDBMSDao;
import com.rahul.bootproject.um.model.User;
import com.rahul.bootproject.um.service.UserService;
import com.rahul.bootproject.util.constant.BootConstant;

/**
 * @author rahul.s.shukla
 *
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRDBMSDao userDao;
	
	@Override
	public String getUserById(String userid) {
		 System.out.println("Values those are pass by user:: "+userid);
		 log.info("Input parameters is {}",userid);
		 return BootConstant.SUCCESS_RESPONSE;
	}
	
	@Override
	public String createUser(User user) {
		userDao.saveAndFlush(user);
		return BootConstant.SUCCESS_RESPONSE;
	}

	@Override
	public List getAllUser() {
		return userDao.findAll();
	}
	
}

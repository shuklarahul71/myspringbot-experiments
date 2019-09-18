/**
 * 
 */
package com.rahul.bootproject.um.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rahul.bootproject.um.dao.UserLocalDao;
import com.rahul.bootproject.um.model.User;

/**
 * @author rahul.s.shukla
 *
 */
@Repository
public class UserLocalDaoImpl implements UserLocalDao{

	private static final Map<Integer, User> usersMap = new HashMap<Integer, User>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
    	User emp1 = new User(1,"Smaith@xyz.com", "Smith", "Clerk","Indore");
    	User emp2 = new User(2,"Smaith@xyz.com", "Smith", "Clerk","Indore");
    	User emp3 = new User(3,"Smaith@xyz.com", "Smith", "Clerk","Indore");
    	
        
        usersMap.put(emp1.getUserid(), emp1);
        usersMap.put(emp2.getUserid(), emp2);
        usersMap.put(emp3.getUserid(), emp3);
    }
    
    
}

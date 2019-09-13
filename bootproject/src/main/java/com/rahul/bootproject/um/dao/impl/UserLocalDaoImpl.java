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

	private static final Map<String, User> usersMap = new HashMap<String, User>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
    	User emp1 = new User("E01","Smaith@xyz.com", "Smith", "Clerk","Indore");
    	User emp2 = new User("E01","Smaith@xyz.com", "Smith", "Clerk","Indore");
    	User emp3 = new User("E01","Smaith@xyz.com", "Smith", "Clerk","Indore");
    	
        
        usersMap.put(emp1.getUserid(), emp1);
        usersMap.put(emp2.getUserid(), emp2);
        usersMap.put(emp3.getUserid(), emp3);
    }
    
    
}

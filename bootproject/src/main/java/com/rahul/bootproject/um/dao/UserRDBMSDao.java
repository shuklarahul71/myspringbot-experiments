/**
 * 
 */
package com.rahul.bootproject.um.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rahul.bootproject.um.model.User;

/**
 * @author rahul.s.shukla
 *
 */


public interface UserRDBMSDao extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM Users u WHERE u.username=:username")
	public User findByUsername(@Param("username") String username);
}

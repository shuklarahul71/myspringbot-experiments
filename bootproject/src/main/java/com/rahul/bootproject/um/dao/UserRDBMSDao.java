/**
 * 
 */
package com.rahul.bootproject.um.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.bootproject.um.model.User;

/**
 * @author rahul.s.shukla
 *
 */


public interface UserRDBMSDao extends JpaRepository<User, Integer>{

}
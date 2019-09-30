/**
 * 
 */
package com.rahul.bootproject.config.security.basic.Authenticate;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author rahul.s.shukla
 *
 */

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rahul.bootproject.um.dao.UserRDBMSDao;
import com.rahul.bootproject.um.model.User;

@Service
public class UserAuthenticator implements UserDetailsService {

	@Autowired
	UserRDBMSDao userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User name " + username + " not found");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getGrantedAuthorities(user));
	}

	private Collection getGrantedAuthorities(User user) {
		Collection grantedAuthorities = new ArrayList();
		grantedAuthorities.add(new SimpleGrantedAuthority("ADMIN"));
		return grantedAuthorities;
	}
}

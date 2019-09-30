/**
 * 
 */
package com.rahul.bootproject.um.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author rahul.s.shukla
 *
 */

@Entity(name="Users")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	@NotNull
	private Integer userid;
	
	@Basic
	@NotEmpty
	private String username;
	
	@Basic
	private String firstName;
	
	@Basic
	private String lastName;
	
	@Basic
	private String address;
	
	@Basic
	private String password;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Integer userid, String username, String firstName, String lastName, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	
	
	public User(@NotNull Integer userid, @NotEmpty String username, String firstName, String lastName, String address,
			String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.password = password;
	}
	
	public User() {
		super();
	}
	
	
	
}

/**
 * 
 */
package com.rahul.bootproject.um.wrapper;

/**
 * @author rahul.s.shukla
 *
 */

public class UserWrapper {

	private String userid;
	private String username;
	private String firstName;
	private String lastName;
	private String address;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
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
	
	@Override
	public String toString() {
		return "UserWrapper [userid=" + userid + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address + "]";
	}
	
	
	
	
}

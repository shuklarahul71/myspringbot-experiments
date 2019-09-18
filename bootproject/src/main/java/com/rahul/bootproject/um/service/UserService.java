package com.rahul.bootproject.um.service;

import java.util.List;

import com.rahul.bootproject.um.model.User;

public interface UserService {

	public String getUserById(String userid);

	public String createUser(User user);

	public List getAllUser();
}

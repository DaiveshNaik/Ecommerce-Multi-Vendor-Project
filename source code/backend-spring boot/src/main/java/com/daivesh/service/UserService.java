package com.daivesh.service;

import java.util.List;

import com.daivesh.exception.UserException;
import com.daivesh.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}

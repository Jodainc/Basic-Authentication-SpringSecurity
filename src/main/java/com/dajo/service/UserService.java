package com.dajo.service;
/**
 * Created by LordKotan on 31/05/2017... RESTApiBasicAuthentication
 */
import java.util.List;

import com.dajo.model.User;



public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}

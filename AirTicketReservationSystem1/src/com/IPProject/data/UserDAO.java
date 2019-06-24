package com.IPProject.data;

import java.util.List;

import com.IPProject.model.User;

public interface UserDAO {
	public void addUser(User user)throws Exception;
	public void addOtherDetails(User user)throws Exception;
	public User getUser(String emailId) throws Exception;
	public User getUserss(String emailId) throws Exception;
	public List<User> getUsers() throws Exception;

}

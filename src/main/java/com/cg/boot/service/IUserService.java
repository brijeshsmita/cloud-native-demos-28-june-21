/**
 * 
 */
package com.cg.boot.service;

import java.util.List;
import java.util.Optional;

import com.cg.boot.entity.User;
import com.cg.boot.exception.MyUserException;

/**
 * @author Smita B Kumar
 *
 */
public interface IUserService {
	public Optional<User> getUserById(Long userId) throws MyUserException;
	public List<User> getUserList()throws MyUserException;
	public User addUser(User user) throws MyUserException;

	public User updateUser(User user)throws MyUserException;
	public void deleteUser(Long userId)throws MyUserException; 
}

/**
 * 
 */
package com.cg.boot.repository;

import java.util.List;
import java.util.Optional;

import com.cg.boot.entity.User;
import com.cg.boot.exception.MyUserException;

/**
 * @author Smita B Kumar
 *
 */
public interface IUserDao {
	public Optional<User> findById(Long userId) throws MyUserException;
	public List<User> findAll()throws MyUserException;
	public User save(User user) throws MyUserException;

	public User updateUser(User user)throws MyUserException;
	public void deleteById(Long userId)throws MyUserException;
	
}

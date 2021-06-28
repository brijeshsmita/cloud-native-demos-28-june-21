/**
 * 
 */
package com.cg.boot.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.boot.entity.User;
import com.cg.boot.exception.MyUserException;
import com.cg.boot.repository.IUserDao;

/**
 * @author Smita B Kumar
 *
 */
//prep-work -> annotate Service component
@Service
public class UserService implements IUserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
//prep work 2-> inject Dao Object
	@Autowired
	private IUserDao userDao;
	public UserService() {
		System.out.println(" Spring container created the Service Object/bean");
	}
	@Override
	public Optional<User> getUserById(Long userId) throws MyUserException {
		logger.info("Trying to fetch User in service layer ");
//prep work 4-> call and return dao method in specific service method
		return userDao.findById(userId);
	}

	@Override

	public User addUser(User user) throws MyUserException {
		logger.info("Trying to add User in service layer " + user);

		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override

	public User updateUser(User user) throws MyUserException {
		logger.info("Trying to update User in service layer ");
		// TODO Auto-generated method stub
		
		return userDao.updateUser(user);
	}

	@Override

	public void deleteUser(Long userId) throws MyUserException {
		logger.info("Trying to delete User in service layer ");
		userDao.deleteById(userId);
	}

	@Override
	public List<User> getUserList() throws MyUserException {
		logger.info("Trying to fetch all User in service layer ");
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}

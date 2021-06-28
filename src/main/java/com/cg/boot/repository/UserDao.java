/**
 * 
 */
package com.cg.boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.cg.boot.entity.User;
import com.cg.boot.exception.MyUserException;

/**
 * @author smitkuma
 *
 */
@Repository
public class UserDao implements IUserDao {

	private static List<User> users;
	static {
		users = UserDb.getUsers();
	}
	public UserDao() {
		System.out.println(" Spring container created the DAO Object/bean");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capgemini.paymentwallet.services.IPaymentWalletService#register(com.
	 * capgemini.paymentwallet.model.User)
	 */
	@Override
	public User save(User user) {
		// adding new user to the exiting users list
		user.setId((long) (100 + Math.random() * 111 * 123));
		System.out.println("User added : "+user);
		return (users.add(user) ? user : null);// if user added successfully then return user object else return null
//		users.add(user);
//		return user;

	}

	@Override
	public Optional<User> findById(Long userId) throws MyUserException {
		User foundUser = users.stream()
				  .filter(u1 -> userId==u1.getId())
				  .findAny()
				  .orElse(null);
		return Optional.of((User) foundUser);
	}

	@Override
	public List<User> findAll() throws MyUserException {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User updateUser(User user) throws MyUserException {
		boolean userExists= users.contains(user);
		System.out.println("###Trying to update user at Dao Layer");
		if(userExists)
			{
				int index =users.indexOf(user);
				System.out.println("##################index of user: "+user+" at update :"+index);
				users.set(index, user);
				UserDb.setUsers(users);
			}
		return user;
	}

	@Override
	public void deleteById(Long userId) throws MyUserException {
		
		Optional<User> foundUser = findById(userId);
		if (foundUser.isPresent()) {
			users.remove(foundUser);UserDb.setUsers(users);
		}

	}

}

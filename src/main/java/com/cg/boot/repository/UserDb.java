/**
 * 
 */
package com.cg.boot.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.boot.entity.User;

/**
 * @author smitkuma
 * This class is acting as static database for WalletUser and WalletAccount class
 */
public class UserDb {

	private static List<User> users;
	static
	{
		users= new ArrayList<User>();
		//creating user and his WalletAccount by calling both entity setter method as we have 1 to 1 association
		User u1 = new User(101L, "Smita", "Kumar", "smita@cg.com");
		User u2 = new User(102L, "Mona", "Darling", "mona@cg.com");
		User u3 = new User(103L, "Ria", "Sen", "ria@cg.com");
		User u4 = new User(104L, "Sia", "Shah", "sia@cg.com");
		
		//adding both the user to list
		users.add(u1);
		users.add(u2);users.add(u3);users.add(u4);
	}

	public static List<User> getUsers() {
		return users;
	}

	public static void setUsers(List<User> users) {
		UserDb.users = users;
	}
	
}

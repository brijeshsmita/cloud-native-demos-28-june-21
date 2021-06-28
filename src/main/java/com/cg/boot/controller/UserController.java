/**
 * 
 */
package com.cg.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.boot.entity.User;
import com.cg.boot.service.IUserService;

/**
 * @author smitkuma
 *
 */
@CrossOrigin(origins = {"http://localhost:4200"}, 
allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class UserController {
	
	//Spring container will provide the dependent object as a when required
	
	@Autowired //DI - property/setter injection
	private IUserService userService;
	
	// http://localhost:8084/api/hello-app/users/
	@GetMapping(path = "/", produces = "application/json")
	public List<User> getAllUsers(){
		return userService.getUserList();
	}
	// http://localhost:8084/api/hello-app/users/add - requestBody (user)
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		//return userService.addUser(user);
		User addedUser = userService.addUser(user);
		return new ResponseEntity<>(addedUser, HttpStatus.CREATED);		
	}
	
	public IUserService getUserService() {
		return userService;
	}
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public UserController() {
		System.out.println(" Spring container created the Controller Object/bean");
	}

}

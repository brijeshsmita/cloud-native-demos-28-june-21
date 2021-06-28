/**
 * 
 */
package com.cg.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smitkuma
 *
 */
@RestController
@RequestMapping("/home")
public class HomeController {

	/**
	 * http://localhost:8084/api/hello-app/home/hi
	 */
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi from my Spring boot Home Controller";
	}

}

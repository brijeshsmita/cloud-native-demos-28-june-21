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
@RequestMapping("/hello")
public class HelloController {

	/**
	 * http://localhost:8084/api/hello-app/hello/hi
	 */
	@GetMapping("/")
	public String defaultMethod() {
		return "Hi from my first Spring boot app HelloController -defaultMethod";
	}
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi from my first Spring boot app HelloController";
	}

}

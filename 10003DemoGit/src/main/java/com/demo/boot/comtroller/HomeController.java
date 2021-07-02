/**
 * 
 */
package com.demo.boot.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smitkuma
 *
 */
@RestController
public class HomeController {

	/**
	 * 
	 */
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "/")
	public String homePage() {
		return "Hello Spring Boot - Git Demo";
	}

}

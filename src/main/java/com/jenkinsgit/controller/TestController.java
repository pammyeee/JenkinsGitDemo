/**
 * 
 */
package com.jenkinsgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pramod
 *
 */
@RestController
@RequestMapping("/tests")
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "It is working";
	}

}

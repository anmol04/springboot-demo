package com.demo.helloEmployee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloController {

	 public static void main(String[] args) {
		    SpringApplication.run(HelloController.class, args);
		    }
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
}
